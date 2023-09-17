package com.example.compose_lazycolumn_stickyheader


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.compose_lazycolumn_stickyheader.ui.theme.md_theme_light_onPrimary
import com.example.compose_lazycolumn_stickyheader.ui.theme.md_theme_light_primary

class MainActivity2 : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val sections = listOf("A", "B", "C", "D")

            LazyColumn(
                contentPadding = PaddingValues(12.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                sections.forEach { section ->
                    stickyHeader {
                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(md_theme_light_primary)
                                .padding(12.dp),
                            fontWeight = FontWeight.Bold,
                            color = md_theme_light_onPrimary,
                            text = "Section $section"
                        )
                    }
                    items(5) {
                        Text(
                            modifier = Modifier.padding(all = 12.dp),
                            text = "Item $it from the section $section"
                        )
                    }
                }
            }
        }

    }
}