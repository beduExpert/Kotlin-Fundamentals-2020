## Getters, Setters y modificadores de acceso

### OBJETIVO

- Personalizar comportamiento al asignar u obtener atributos de una clase
- Conocer los modificadores que permiten controlar la visibilización de un objeto

#### REQUISITOS

1. Haber cursado los temas anteriores en este módulo

#### DESARROLLO

##### Modificadores de acceso (Visibility modifiers)

Cuando hablamos de atributos en una clase, caeremos en cuenta de que algunas requieren algún mayor nivel de seguridad que otras. Por lo tanto, en kotlin como en la mayoría de los lenguajes de programación existen los modificadores de acceso, que determinan desde dónde podemos acceder a nuestras variables y métodos. Kotlin cuenta con los siguientes modificadores de acceso:

* **private:** Que es accesible solo dentro de la clase que lo contiene.
* **protected:** Sólo se tiene accceso dentro de la clase y por medio de las clases que heredan de este.
* **internal:** Accesible entre módulos (una serie de archivos compilados en conjunto).
* **public:** Como su nombre lo indica, da acceso a toda entidad que desee llamarlo.
    
Cabe señalar que los modificadores no se limitan a Programación orientada objetos, sino que aplican a archivos, funciones, variables, etc. Sin embargo, es un tema que va de la mano con POO.

Public es el modificador por defecto, eso hace que declararlo sea redundante. Hemos visto  previamente el uso de valores públicos en el  [Reto 1](Reto-01#desarrollo), cuando consultamos desde *main.kt* el estado del coche. 

```kotlin
 println("El coche está prendido? ${miVehiculo.encendido}")
    miVehiculo.encender()
    println("El coche está prendido? ${miVehiculo.encendido}")
```

Podemos acceder sin ningún problema al atributo. 

Ahora imaginemos un ejemplo de uso para *private*. En *Super Mario Bros*, Mario tiene diferentes efectos cuando colisiona con un *Super Mushroom*, con un *goomba*, con una *Fire Flower* .

| Objeto a colisionar |    Efecto    |
| ------------------- | ------------ |
|   Super Mushroom    |  Super Mario |
|   Fire Flower       |  Fire Mario  |
|       Goomba        |  Quitar vida |


Definiremos dos atributos: 

* **state:** definirá el estado de mario (mario pequeño, super mario, mario fuego)
* **lives:** la cantidad de vidas

estos atributos deben ser privados, de lo contrario cualquiera podrá ponerse vidas infinitas y volverse fire Mario.

crearemos un método para restar una vida cuando mueres, y tampoco puede ser manipulado por otra entidad porque  uno no controla la muerte direcctamente, sino los eventos que lo provocan.

Por último, crearemos un colisionador para detectar que en cuanto toques un objeto, tenga el efecto de la tabla.

```kotlin
class Mario(var vidas: Int =3){ //vamos a dejar setear el número de vidas al iniciar el objeto Mario

    init {
        println("It's a me! Mario!") //vamos a hacer que Mario se presente al construirlo!
    }

    private var state = "small" //mario es pequeño al iniciar el juego
    private var lives = 3 //uno empieza el juego con tres vidas

    //resta una vida al jugador
    private fun die(){
        lives--
        println("Haz perdido una vida!")
    }

    //el modificador public es redundante
    //en función del objeto colisionante, se ejecuta un evento
    public fun collision(collisionObj: String){
        when(collisionObj){
            "Goomba" -> die()
                "Super Mushroom" -> state = "Super mario"
            "Fire flower" -> state = "Fire mario"
            else -> println("Objeto desconocido ¡no pasa nada!")

        }
    }
}
```

¡Muy bien! ahora vamos a instanciar nuestra clase en la función *main* y hacemos que mario colisione con un objeto no definido

```kotlin
import clases.Mario

fun main(){

    var mario = Mario()

    mario.collision("Pipe")

}
````

> Objeto desconocido ¡no pasa nada!


Ahora, agregamos otra colisión con un *Goomba*:

```kotlin
    mario.collision("Goomba")
```

> Haz perdido una vida!

##### Modificadores de acceso (Visibility modifiers)



