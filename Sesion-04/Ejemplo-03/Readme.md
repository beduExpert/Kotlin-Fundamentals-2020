## Data class y Companion object

### OBJETIVO

- Definir clases para mantener una estructura de datos
- Crear un miembro propio de una clase y no de un objeto

#### REQUISITOS

1. Mantener datos en una clase
2. Requerir la inicialización de una variable constante 

#### DESARROLLO

##### Data class

Un Data class es una clase que tiene como único objetivo es cargar información en una clase a través de su constructor, sin poder definir métodos para modificar o eliminar sus datos.

Su definición y declaración sucede a través del constructor de la clase, pero con el modificador **data**.
```kotlin
data class Movie(
    val name: String,
    val gender: String,
    val duration: Double
)
```
Anteriormente declaramos una clase de datos de una película. Vamos a crear la primera clase de datos, que guardará datos de la película *Scary movie*.

```kotlin
    //declaración
    val scaryMovie = Movie("Scary movie", "Comedia", 88.27)
    //impresión
    println(scaryMovie)
```

la impresión de una data class se ve así:

> Movie(name=Scary movie, gender=Comedia, duration=88.27)

Si queremos obtener la propeidad de un objetoen pesona:

``` 

//imprimir una propiedad en específico
    println(scaryMovie.name)
    
