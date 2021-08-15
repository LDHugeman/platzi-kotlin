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
}