package com.example.cookbook.ui.screen

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.cookbook.FoodApplication
import com.example.cookbook.data.FoodDataProvider
import com.example.cookbook.data.FoodRepository
import com.example.cookbook.data.model.Food
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn

class FoodViewModel(
    foodRepository: FoodRepository
): ViewModel() {
    companion object {
        val Factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
                val application = checkNotNull(extras[APPLICATION_KEY])
                return FoodViewModel(
                    (application as FoodApplication).foodRepository
                ) as T
            }
        }
    }

    val searchText = MutableStateFlow("")
    val isSearching = MutableStateFlow(false)

    fun onSearchTextChange(text: String) {
        searchText.value = text
    }

    fun onToggleSearch() {
        isSearching.value = !isSearching.value
        if (!isSearching.value)
            onSearchTextChange("")
    }


    val foods: State<List<Food>> = mutableStateOf(
        foodRepository.getFoods()
    )

    private val _searchedFoods = MutableStateFlow(foods.value)
    val searchedFoods = searchText.combine(_searchedFoods) { text, foods ->
        if (text.isBlank())
            emptyList()
        else {
            foods.filter { food ->
                food.name.uppercase().startsWith(text.trim().uppercase())
            }
        }
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = _searchedFoods.value
    )

    fun getFoodById(id: Int?): Food {
        return foods.value.find { food -> food.id == id } ?: FoodDataProvider.foods[0]
    }
}