import java.lang.Exception
import java.lang.NumberFormatException

fun main(){
    try {
        val v = "bedu.org"
        v.toInt()
    } catch(e:NumberFormatException) {
        println("No se pudo convertir, hubo un error: $e")
        e.printStackTrace()

    } finally {
        println("Proceso terminado")
    }

    val possibleNumber = "bedu.org"
    val a: Int? = try { possibleNumber.toInt() } catch (e: NumberFormatException) { null }

    println("El numero convertido es: $a")
}