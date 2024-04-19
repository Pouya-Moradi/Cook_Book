package com.example.cookbook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.cookbook.data.FoodDataProvider
import com.example.cookbook.data.db.CookDataBase
import com.example.cookbook.ui.screen.FoodCategoryScreen
import com.example.cookbook.ui.theme.CookBookTheme

class MainActivity : ComponentActivity() {
    private lateinit var cookDataBase: CookDataBase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        cookDataBase = CookDataBase.getInstance(this.applicationContext)

        if (cookDataBase.foodDao().getAllFoods().isEmpty())
            cookDataBase.foodDao().insertAllFoods(FoodDataProvider.foods)

        setContent {
            CookBookTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FoodCategoryScreen()
                }
            }
        }
    }
}
