class Loops {
    fun loopWhile() {
        var counter = 10
        while (counter > 0) {
            println("El valor de contador es $counter")
            counter--
        }
    }

    fun loopDoWhile() {
        do {
            println("Generando número aleatorio...")
            val randomNumber = (0..100).random()
            println("El número generado es $randomNumber")
        } while (randomNumber > 50)
    }

    fun loopFor() {
        val fruitList: List<String> = listOf("Manzana", "Pera", "Frambuesa", "Durazno")
        for (fruit in fruitList) {
            println("Hoy voy a comerme una fruta llamada $fruit")
        }

        /*fruitList.forEach { fruit ->
            run {
                println("Hoy voy a comerme una fruta llamada $fruit")
            }
        }*/

        fruitList.forEach { fruit -> println("Hoy voy a comerme una fruta que se llama $fruit") }
        val fruitsCharacters: List<Int> = fruitList.map { fruit -> fruit.length }
        //val fruitsCharacters: List<Int> = fruitList.map { fruit -> run { fruit.length } }
        println(fruitsCharacters)

        val filterList = fruitsCharacters.filter { fruitLength -> fruitLength > 5 }
        val filterList2 = fruitList.filter { fruit -> fruit.length > 5 }
        println("1 - $filterList")
        println("2 - $filterList2")
    }
}