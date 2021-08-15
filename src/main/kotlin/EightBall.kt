const val AFFIRMATIVE_ANSWER = "✔"
const val NEGATIVE_ANSWER = "❌"
const val DOUBTFUL_ANSWER = "❓"

class EightBall {
    val answers = mapOf(
        "Sí" to AFFIRMATIVE_ANSWER,
        "Es cierto" to AFFIRMATIVE_ANSWER,
        "Totalmente" to AFFIRMATIVE_ANSWER,
        "Sin duda" to AFFIRMATIVE_ANSWER,
        "Pregunta en otro momento" to DOUBTFUL_ANSWER,
        "No puedo decirte en este momento" to DOUBTFUL_ANSWER,
        "Puede que si o puede que no" to DOUBTFUL_ANSWER,
        "No va a suceder" to NEGATIVE_ANSWER,
        "No cuentes con ello" to NEGATIVE_ANSWER,
        "Definitivamente no" to NEGATIVE_ANSWER,
        "No lo creo" to NEGATIVE_ANSWER,
    )

    fun eigthBall() {
        println("Hola soy tu bola 8 mágica creada en Kotlin. Cuál de estas opciones deseas realizar?")
        println("1. Realizar una pregunta")
        println("2. Revisar todas las respuestas")
        println("3. Salir")

        val enterValue = readLine()
        when (enterValue) {
            "1" -> makeQuestion()
            "2" -> showAnswers()
            "3" -> exit()
            else -> showError()
        }
    }

    private fun makeQuestion() {
        println("Qué pregunta deseas realizar?")
        readLine()
        println("Así que esa era tu pregunta... La respuesta a eso es:")
        val generatedAnswer = answers.keys.random()
        println(generatedAnswer)
    }

    private fun showAnswers() {
        println("Selecciona una opción")
        println("1. Revisar todas las respuestas")
        println("2. Revisar solo las respuestas afirmativas")
        println("3. Revisar solo las respuestas dudosas")
        println("4. Revisar solo las respuestas negativas")

        val enterValue = readLine()
        when (enterValue) {
            "1" -> showAnswersByType()
            "2" -> showAnswersByType(AFFIRMATIVE_ANSWER)
            "3" -> showAnswersByType(NEGATIVE_ANSWER)
            "4" -> showAnswersByType(DOUBTFUL_ANSWER)
            else -> println("Respuesta no válida. Adios.")
        }

    }

    private fun showAnswersByType(answerType: String = "TODOS") {
        when (answerType) {
            "TODOS" -> answers.keys.forEach { answer -> println(answer) }
            AFFIRMATIVE_ANSWER -> answers
                .filterValues { values -> values == AFFIRMATIVE_ANSWER }
                .also { positiveAnswers -> positiveAnswers.keys } //.run { println(keys) }
            NEGATIVE_ANSWER -> answers
                .filterValues { values -> values == NEGATIVE_ANSWER }
                .also { negativeAnswers -> negativeAnswers.keys }
            DOUBTFUL_ANSWER -> answers
                .filterValues { values -> values == DOUBTFUL_ANSWER }
                .also { doubtfulAnswers -> doubtfulAnswers.keys }
        }
    }

    private fun exit() {
        println("Hasta luego!")
    }

    private fun showError() {
        println("Vaya parece que has eligido una opción no válida, intenta de nuevo.")
    }

}