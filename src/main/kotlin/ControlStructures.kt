class ControlStructures {
    fun controlStructureIf() {
        val name = "Li"

        if (name.isNotEmpty()) {
            println("El largo de nuestra variable nombre es ${name.length}")
        } else {
            println("Error, la variable está vacía")
        }

        val message: String = if (name.length > 4) {
            "Tu nombre es largo"
        } else if (name.isEmpty()) {
            "El nombre está vacío"
        } else {
            "Tienes un nombre corto"
        }
        println(message)
    }

    fun controlStructureWhen() {
        val colourName = "Carmesí"
        when (colourName) {
            "Amarillo" -> println("El amarillo es el color de la alegría")
            "Rojo", "Carmesí" -> println("El rojo simboliza el calor")
            else -> println("Error. No tengo información del color")
        }

        val code = 404
        when (code) {
            in 200..299 -> println("Todo ha ido bien")
            in 400..500 -> println("Algo ha fallado")
            else -> println("Código descocido, algo ha fallado.")
        }

        val shoeSize = 45
        val message = when (shoeSize) {
            41, 43 -> "Tenemos disponible"
            42, 44 -> "Casi no nos quedan!"
            45 -> "Lo siento no tenemos disponible"
            else -> "Estos zapatos solo vienen en tallas 41,42,43,44 y 45"
        }
        println(message)
    }
}