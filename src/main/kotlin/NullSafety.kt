import java.lang.Exception
import kotlin.NullPointerException

class NullSafety {
    fun tryCatch() {
        var name: String? = null
        //println(name?.length)
        try {
            throw NullPointerException("Referencia nula")
        } catch (exception: NullPointerException) {
            println("Ha ocurrido un error")
        } finally {
            println("Finalmente ha ocurrido un error... Cerrando aplicación")
        }
        val firstValue = 10
        val secondValue = 0
        val result: Int = try {
            firstValue / secondValue
        } catch (exception: Exception) {
            0
        }
        println(result)
    }

    fun elvis() {
        var name: String? = null
        val nameLength: Int = name?.length ?: 0
        println(nameLength)
    }
}