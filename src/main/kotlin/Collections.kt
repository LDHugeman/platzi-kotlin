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

    fun orderLists() {
        val lotteryNumbers = listOf(11, 22, 43, 56, 78, 66)

        val sortedNumbers = lotteryNumbers.sorted()
        println(sortedNumbers)

        val sortedDescendingNumbers = lotteryNumbers.sortedDescending()
        println(sortedDescendingNumbers)

        val sortedByMultiples = lotteryNumbers.sortedBy { number -> number < 50 }
        println(sortedByMultiples)

        val randomNumbers = lotteryNumbers.shuffled()
        println(randomNumbers)

        val reversedNumbers = lotteryNumbers.reversed()
        println(reversedNumbers)


        val numberMessages =
            lotteryNumbers
                .map { number -> ("Tu número de lotería es $number") }
                .forEach { number -> println(number) }

        val filterNumbers = lotteryNumbers.filter { number -> number > 50 }
        println(filterNumbers)
    }

    fun maps() {
        val superheroAges = mapOf(
            "Ironman" to 35,
            "Spiderman" to 23,
            "Capitán América" to 99
        )
        println(superheroAges)

        val superheroAgesMutable = mutableMapOf(
            "Ironman" to 35,
            "Spiderman" to 23,
            "Capitán América" to 99
        )
        println(superheroAgesMutable)

        superheroAgesMutable.put("Wolverine", 45)
        println(superheroAgesMutable)

        superheroAgesMutable["Storm"] = 30
        println(superheroAgesMutable)

        val ironmanAge = superheroAgesMutable["Ironman"]
        println(ironmanAge)

        superheroAgesMutable.remove("Wolverine")
        println(superheroAgesMutable)

        println(superheroAgesMutable.keys)
        println(superheroAgesMutable.values)
    }

    fun sets() {
        val repeatedVowels = setOf("a", "e", "i", "o", "u", "a", "e", "i", "o", "u")
        println(repeatedVowels)

        val favouriteNumbers = mutableSetOf(1, 2, 3, 4)
        favouriteNumbers.add(5)
        println(favouriteNumbers)

        favouriteNumbers.remove(5)
        println(favouriteNumbers)

        val setValue: Int? = favouriteNumbers.firstOrNull { number -> number > 2 }
        println(setValue ?: "No se ha encontrado un número válido")
    }
}