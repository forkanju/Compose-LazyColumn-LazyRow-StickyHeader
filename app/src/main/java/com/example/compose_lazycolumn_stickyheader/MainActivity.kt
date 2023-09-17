package com.example.compose_lazycolumn_stickyheader

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val repository = PersonRepository()
            val persons = repository.getAllData()
            LazyRow(
                contentPadding = PaddingValues(12.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {

                items(items = persons) { person ->
                    CustomItem(person = person)
                }

                //here key is required for keep track an item remove, add and so on..
                /**              itemsIndexed(
                items = persons,
                key = { index, person ->
                person.id
                ) { index, person ->
                Log.d("MainActivity", index.toString())
                CustomItem(person = person)
                }*/


            }
        }
    }
}

