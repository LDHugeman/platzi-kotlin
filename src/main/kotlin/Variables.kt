const val PI = 3.1416

class Variables {
    fun variables() {
        var money = 10
        println(money)
        money = 5
        println(money)
        val name1 = "María"
        println(name1)
        println(PI)

        val boolean = true
        val longNumber = 3L
        val double: Double = 2.7182
        val float: Float = 1.1f

        val firstValue = 20
        val secondValue = 10
        val thirdValue = firstValue - secondValue
        println(thirdValue)

        val lastName = "Vetri"
        val name2 = "Giuseppe"
        val completeName = "$name2 $lastName"
        println(completeName)
    }

}