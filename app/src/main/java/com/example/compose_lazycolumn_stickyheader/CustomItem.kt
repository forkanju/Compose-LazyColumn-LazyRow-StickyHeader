package com.example.compose_lazycolumn_stickyheader

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_lazycolumn_stickyheader.ui.theme.md_theme_light_errorContainer
import com.example.compose_lazycolumn_stickyheader.ui.theme.md_theme_light_secondary
import com.example.compose_lazycolumn_stickyheader.ui.theme.md_theme_light_shadow

@Composable
fun CustomItem(person: Person) {

    Row(
        modifier = Modifier
            .background(color = md_theme_light_errorContainer)
            .fillMaxWidth()
            .padding(all = 24.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(14.dp)
    ) {

        Text(
            text = "${person.age}",
            color = md_theme_light_shadow,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = person.firstName,
            color = md_theme_light_shadow,
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal
        )

        Text(
            text = person.lastName,
            color = md_theme_light_shadow,
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal
        )

    }
}

@Preview(showBackground = true)
@Composable
fun CustomItemPreview() {
    CustomItem(person = Person(id = 0, firstName = "Md", lastName = "Forkan", age = 27))
}