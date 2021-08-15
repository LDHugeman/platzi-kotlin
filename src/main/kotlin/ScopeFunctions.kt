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
        val mobiles = mutableListOf("Google Pixel 2XL", "Google Pixel4a", "Huawei Redmi 9", "Xiaomi mi a3")
            .run {
                removeIf { mobile -> mobile.contains("Google") }
                this
            }
        println(mobiles)
    }

    fun apply() {
        val mobiles = mutableListOf("Google Pixel 2XL", "Google Pixel4a", "Huawei Redmi 9", "Xiaomi mi a3")
            .apply {
                removeIf { mobile -> mobile.contains("Google") }
            }
        println(mobiles)

        val colours: MutableList<String>? = null
        colours?.apply {
            println("Nuestros colores son $this")
            println("La cantidad de colores es $size")
        }
    }

    fun also() {
        val mobiles = mutableListOf("Google Pixel 2XL", "Google Pixel4a", "Huawei Redmi 9", "Xiaomi mi a3")
            .also { list ->
                println("El valor original de la lista es $list")
                list.removeAt(0)
            }.asReversed()
        println(mobiles)
    }
}