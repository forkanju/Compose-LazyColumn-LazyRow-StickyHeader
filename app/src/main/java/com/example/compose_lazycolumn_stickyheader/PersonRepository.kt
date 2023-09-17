package com.example.compose_lazycolumn_stickyheader

class PersonRepository {

    fun getAllData(): List<Person> {
        return listOf(
            Person(id = 0, firstName = "Md", lastName = "Forkan", age = 30),
            Person(id = 1, firstName = "Md", lastName = "Hasan", age = 32),
            Person(id = 2, firstName = "Shubo", lastName = "Talukdar", age = 28),
            Person(id = 3, firstName = "Abu", lastName = "Sina", age = 35),
            Person(id = 4, firstName = "Masum", lastName = "Hossain", age = 29),
            Person(id = 5, firstName = "Md", lastName = "Saimum", age = 31),
            Person(id = 6, firstName = "Shehirul Islam", lastName = "Rehi", age = 26),
            Person(id = 7, firstName = "Md", lastName = "Asadul Haque", age = 33),
            Person(id = 8, firstName = "Md", lastName = "Tushar", age = 27),
            Person(id = 9, firstName = "Sukriti", lastName = "Das", age = 24),
            Person(id = 10, firstName = "Selim", lastName = "Hossain", age = 37),
            Person(id = 11, firstName = "Md", lastName = "Shabuj Mia", age = 30),
            Person(id = 12, firstName = "Salauddin", lastName = "Ahmed", age = 34)
        )
    }
}