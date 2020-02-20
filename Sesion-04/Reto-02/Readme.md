## Titulo del Ejemplo 

### OBJETIVO 

- Lo que esperamos que el alumno aprenda 

#### REQUISITOS 

1. Lo necesario para desarrollar el ejemplo o el Reto 

#### DESARROLLO

1. Crear la clase International para viajes internacionales, contemplar que ahora el usuario proporciona el nombre del País y la Ciudadd

<details>
	<summary>Respuesta</summary>

La clase con los métodos implementados de Travel quedarían así: 

```kotlin
class International(override val country: String, override val city: String) : Travel() {
    override fun quotePrice(numDays: Int) {

    }

    override fun getPrice(numDays: Int): Int {
    }
}
```

</details>

2. Existe un miembro en la clase **Travel** que a pesar de ser abstracta, podría ser idéntica tanto en *National* como en *International*, ¿Cuál es? descúbrela, agrega el cuerpo en la clase abstracta y elimínala de sus hijos.


<details>
	<summary>Respuesta</summary>

el método para cotizar implementado en National, se puede usar también en International, por lo tanto sustituir el método abstracto de **Travel** por:

```kotlin
    fun quotePrice(numDays: Int) {
        val price = getPrice(numDays)
        if(price==0){ //si no existe tarifa para esa ciudad, notificamos al usuario
            println("Lo sentimos, no hacemos viajes a esta ciudad")
        } else{
            println("Tu viaje a $city cuesta \$$price") //notificamos el precio al usuario
        }
    }
```

Borrar sus definiciones tanto en **National** como en **International**

</details>

3. Debemos establecer los impuestos por país, y las ciudades a donde viajar:

* Alemania tiene el 16% del precio total como impuesto y las ciudades disponibles son:
	* Munich
	* Berlín
	* Francfort

* Chile cobra únicamente el 5% como impuesto y sus ciudades son:
	* Santiago
	* Valparaíso
* Canadá cobra el 10% de impuesto y las ciudades a visitar son:
	* Vancouver
	* Ottawa
	* Montreal
	



