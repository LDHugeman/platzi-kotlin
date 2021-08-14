class ScopeFunctions {
    fun let() {
        var name: String? = null
        name?.let { value ->
            println("El nombre no es nulo, es $value")
        }
        name = "Giuseppe"
        name.let { value ->
            println("El nombre no es nulo, es $value")
        }
    }
}