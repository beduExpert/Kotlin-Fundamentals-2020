import kotlin.math.pow

const val PI = 3.1416f
const val PHI = 1.618f

fun main (){ // en versiones de kotlin anteriores a la 1.3, la función recibe el valor args: Array<String> como parámetro
    val radius= 4f
    val area = circleArea(radius)
    println("el área del círculo es: $area")

    printName("Daniel Coutiño")
    printAge(15)

    println(getPi())

    printPhi()
}

fun circleArea(radius:Float): Float{
    return PI*radius.pow(2)
}

fun printName(name: String){
    println("Mi nombre es $name")
}

fun printAge(age: Int): Unit{
    println("Tengo $age años")
}

fun getPi(): Float{
    return PI
}

fun printPhi(){
    println("El número áureo vale $PHI")
}



