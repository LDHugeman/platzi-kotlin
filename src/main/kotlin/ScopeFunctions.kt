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

    fun with() {
        val colours = listOf("Azul", "Amarillo", "Rojo")
        with(colours) {
            println("Nuestros colores son $this")
            println("Esta lista tiene una cantidad de colores de $size")
        }
    }

    fun run() {
        val mobile = mutableListOf("Google Pixe 2XL", "Google Pixel4a", "Huawei Redmi 9", "Xiaomi mi a3")
            .run {
                removeIf { mobile -> mobile.contains("Google") }
                this
            }
        println(mobile)
    }
}