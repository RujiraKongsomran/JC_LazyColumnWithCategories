@file:OptIn(ExperimentalFoundationApi::class, ExperimentalFoundationApi::class,
    ExperimentalFoundationApi::class, ExperimentalFoundationApi::class
)

package com.rujirakongsomran.jc_lazycolumnwithcategories

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rujirakongsomran.jc_lazycolumnwithcategories.ui.theme.JC_LazyColumnWithCategoriesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val namesList = names.map {
            Category(
                name = it.key.toString(),
                items = it.value
            )
        }
        setContent {
            JC_LazyColumnWithCategoriesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CategorizedLazyColumn(
                        categories = namesList
                    )
                }
            }
        }
    }
}

data class Category(
    val name: String,
    val items: List<String>
)

@Composable
fun CategoryHeader(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        modifier = modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primaryContainer)
            .padding(16.dp)

    )

}

@Composable
fun CategoryItem(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        fontSize = 14.sp,
        modifier = modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp)

    )
}

@Composable
fun CategorizedLazyColumn(
    categories: List<Category>,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier) {
        categories.forEach { category ->
            stickyHeader {
                CategoryHeader(category.name)
            }
            items(category.items) { text ->
                CategoryItem(text = text)
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun CategoryHeaderPreview() {
    JC_LazyColumnWithCategoriesTheme {
        CategoryHeader(text = "H")
    }
}

@Preview(showSystemUi = true)
@Composable
fun CategoryItemPreview() {
    JC_LazyColumnWithCategoriesTheme {
        CategoryItem("Ari jura")
    }
}


@Preview(showSystemUi = true)
@Composable
fun CategorizedLazyColumnPreview() {
    val namesList = names.map {
        Category(
            name = it.key.toString(),
            items = it.value
        )
    }
    JC_LazyColumnWithCategoriesTheme {
        CategorizedLazyColumn(categories = namesList)
    }
}
