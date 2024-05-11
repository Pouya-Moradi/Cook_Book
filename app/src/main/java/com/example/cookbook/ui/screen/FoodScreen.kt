package com.example.cookbook.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.cookbook.data.model.Food

@Composable
fun FoodScreen(
    food: Food,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier,

    ) {
        Column(modifier = Modifier.background(color = Color(0xFFDBD0C0))) {
            Box {
                AsyncImage(
                    modifier = Modifier
                        .height(180.dp)
                        .fillMaxWidth(),
                    model = food.imageUrl,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    alpha = 0.8f
                )
                Text(
                    text = food.name,
                    modifier = Modifier
                        .padding(8.dp)
                        .background(
                            color = MaterialTheme.colorScheme.surfaceTint,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .padding(4.dp)
                        .align(Alignment.BottomEnd),
                    color = MaterialTheme.colorScheme.onPrimary,
                    style = MaterialTheme.typography.titleLarge

                )
            }
            Text(
                text = food.recipe,
                modifier = Modifier.fillMaxWidth()
                    .padding(top = 20.dp) // Margin from the image above
                    .padding(horizontal = 25.dp) // Margin from the left and right sides of the screen
                    .padding(bottom = 8.dp),
                textAlign = TextAlign.End
            )
        }
    }
}