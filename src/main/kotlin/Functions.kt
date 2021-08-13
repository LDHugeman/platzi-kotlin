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
}