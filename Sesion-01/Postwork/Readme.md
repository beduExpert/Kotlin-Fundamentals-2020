## Postwork

### OBJETIVO

- Resumir el contenido de esta sesión y comentar posibles aplicaciones del conocimiento adquirido para implementarlos en el proyecto final.

#### REQUISITOS

1. Abstraer el concepto de ciclos y condicionales
2. Manejar de forma básica el IDE 
3. aplicar variables y realizar operaciones sobre ellas

#### DESARROLLO

En esta primera parte del curso, debemos definir un proyecto con el que trabajemos las 8 sesiones. Este proyecto va ir tomando mayor complejidad conforme se vaya avanzando en nuevos temas, obteniendo herramientas que nos permitan realizar nuevas funcionalidades.

Para poder elegir el proyecto adecuado, hay que considerar ciertos factores:

* Se basa en una idea de proyecto existente.
* Soluciona un problema de la vida real.
* Se puede plantear como una aplicación móvil.
* Se limita a una simulación sencilla de la prestación de algún servicio o producto.

Algunos de los ejemplos podrían ser una lista de cosas por hacer, una aplicación de compra de productos en línea, un reproductor de audio, un catálogo de películas como IMDB, una agencia de viajes.

El proyecto será una simulación de alguna funcionalidad, pero no tiene por qué funcionar realmente: Si hacemos un reproductor de audio, podríamos simular la repdroducción con un mensaje en consola que diga: "Reproduciendo/pausado".

La línea de código ***println()*** nos será muy útil, pues así sucederá la mayor parte de la simulación, como mostrar el precio de un producto seleccionado al cliente, o imprimir un recibo de compra a un usuario. 

```kotlin
val productPrice = 200
val productPrice2 = 150

val amount = productPrice + productPrice2 // la suma del precio de unos productos
val tax = 1.16f //el porcentaje con impuestos 

val total = amount*tax; //valor total con impuestos sumados
```

##### Variables, tipos de datos y operadores

Está demás decir que ocuparemos bastantes variables en nuestro proyecto para tratar datos. Si creamos una tienda en línea, vamos a requerir guardar el nombre del usuario y la contraseña de nuestro cliente, que son Strings, para identificar la compra. Para un directorio de restaurantes, tendremos qué tener una lista de nombres de restaurantes con su dirección, y el precio promedio de una comida. Además, utilizaremos operadores aritméticos para la suma de cantidades para obtener el total a pagar, y quizá una multiplicación para aplicar un impuesto.

##### Condicionales y bucles

Los bucles optimizan el código de un archivo y controlan la forma de controlar series de datos. Se puede requerir crear un ciclo While cuando se requiera encontrar un dato en específico en una lista. Las condicionales, por otra parte, cubren la necesidad de tomar una decisión dependiendo del resultado de una operación. Si vamos a crear un login, requerimos verificar que el correo y la contraseña sean iguales a los registrados.

```kotlin
if(email=="kotlin@bedu.org" && password=="Kotlindesarrollo"){
        println("Inicio de sesión exitoso")
}
```

También para poder cobrar, requerimos verificar que nuestro saldo se suficiente para pagar un producto:

```kotlin
if(saldo>=precio){
        println("Artículo comprado")
        saldo-=precio
}
```

