package com.example.cookbook.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.cookbook.data.FoodDataProvider
import com.example.cookbook.data.model.FoodCategory

@Composable
fun FoodCategoryScreen(
    modifier: Modifier = Modifier,
    foodCategories: List<FoodCategory> = FoodDataProvider.foodCategories
) {
    Surface(modifier = modifier
        .fillMaxSize()
        .padding(12.dp)) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "انواع غذا",
                style = MaterialTheme.typography.displaySmall
            )
            //Spacer(modifier = Modifier.height(12.dp))
            LazyColumn {
                items(foodCategories) { foodCategory ->
                    FoodCategoryItem(foodCategory = foodCategory)
                }
            }
        }
    }
}

@Composable
private fun FoodCategoryItem(
    modifier: Modifier = Modifier,
    foodCategory: FoodCategory = FoodDataProvider.foodCategories[0]
) {
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .height(120.dp)
            .padding(vertical = 4.dp),
        shape = RoundedCornerShape(4.dp),
        border = BorderStroke(2.dp, MaterialTheme.colorScheme.primary),
        color = MaterialTheme.colorScheme.tertiaryContainer
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = foodCategory.name,
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onTertiaryContainer,
                style = MaterialTheme.typography.titleLarge
            )
            AsyncImage(
                modifier = Modifier.weight(1f),
                model = foodCategory.imageUrl,
                contentDescription = null,
                contentScale = ContentScale.FillBounds
            )
        }
    }
}

@Preview
@Composable
private fun FoodCategoryItemPreview() {
    FoodCategoryItem()
}
