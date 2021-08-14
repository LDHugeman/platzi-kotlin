class Functions {
    fun functions() {
        val randomSentence = "En Platzi nunca paramos de aprender".randomCase()
        printSentence(randomSentence)
    }

    private fun printSentence(sentence: String): Unit {
        println("Tu frase es : $sentence")
    }

    private fun String.randomCase(): String {
        return when ((0..1).random()) {
            0 -> this.uppercase()
            else -> this.lowercase()
        }
        /*return if (randomNumber.rem(2)==0){
            sentence.uppercase()
        } else {
            sentence.lowercase()
        }*/
    }

    fun functionParameters() {
        printName(name = "Giuseppe", lastName = "Vetri")
    }

    private fun printName(name: String, lastName: String, secondLastName: String = "") {
        println("Mi nombre completo es $name $lastName")
    }

    fun lambdas() {
        val myLambda: (String) -> Int = { value -> value.length }
        println(myLambda("Hola Platzi"))

        val greetings = listOf("Hello", "Hola", "Ciao")
        val greetingsLength = greetings.map(myLambda)
        println(greetingsLength)
    }

    fun highOrderFunctions() {
        val initialValueLength = superFunction(initialValue = "Hola!", block = { value -> value.length })
        println(initialValueLength)

        println(inceptionFunction("Enrique")())
    }

    private fun superFunction(initialValue: String, block: (String) -> Int): Int {
        return block(initialValue)
    }

    private fun inceptionFunction(name: String): () -> String {
        return { "Hola desde la lambda $name" }
    }
}