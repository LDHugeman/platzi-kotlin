class Collections {
    fun lists() {
        val namesList = listOf("Juan", "Enrique", "Camila")
        println(namesList)

        val emptyList = mutableListOf<String>()
        println(emptyList)

        emptyList.add("Juan")
        println(emptyList)

        val valueUsingGet = emptyList.get(0)
        println(valueUsingGet)

        val valueUsingOperator = emptyList[0]
        println(valueUsingOperator)

        val firstValue: String? = namesList.firstOrNull()
        println(firstValue)

        emptyList.removeAt(0)
        println(emptyList)

        emptyList.add("Enrique")
        println(emptyList)
        emptyList.removeIf { name -> name.length > 3 }
        println(emptyList)
    }

    fun arrays() {
        val myArray = arrayOf(1, 2, 3, 4)
        println("Nuestro array $myArray")
        println("Array como lista ${myArray.toList()}")
    }
}