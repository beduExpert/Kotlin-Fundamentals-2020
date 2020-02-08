## Variables y tipos de datos

### OBJETIVO 

- Comprobar ciertos tipos de datos asignados por defecto

#### REQUISITOS 

1. Haber terminado el [Ejemplo 2](Ejemplo-02) y [Ejemplo 3](Ejemplo-03)

#### DESARROLLO

##### Para un número decimal, qué tipo de dato se asigna por defecto? Imprimirlo

<details>

<summary>Respuesta</summary>

El tipo de dato por defecto es Long y lo comprobamos así:

```kotlin
 val decimal = 100.325
    println(decimal.javaClass.kotlin)
```

el resultado debe dar

>class kotlin.Double

</details>

##### La ecuación de la pendiente se obtiene por la siguiente expresión:

<img= src="ecuacion-pendiente.png" width="40%" />

Expresarla ahora con operadores:

<details>

<summary>Respuesta</summary
	
```kotlin
val m=(y2-y1)/(x2-x1) 
```
	
</details>

##### Resolver el valor de la pendiente, tomanto en cuenta que 

P1(4,3), P2(-3,-2)


<details>

<summary>Respuesta</summary
	
El resultado esperado sería:
m = (-2-3)/ (-3-4) = (-5)/(-7) = 5/7 = 0.714

El código es:
```kotlin
val y2 = -2
val y1 = 3
val x2 = -3
val x1 = 4

val m=(y2-y1)/(x2-x1)
println(m)
```


el resultado obtenido es

>0

</details>


##### Del ejercicio anterior, responder: ¿Por qué el resultado obtenido difiere del resultado esperado?

<details>

<summary>Respuesta</summary>
	
Por que la operación de Integers dan un como resultado otro Int, como el resultado es decimal, se redondea a 0.
	
</details>

##### Encontrar una solución para que se refleje el resultado


<details>

<summary>Respuesta</summary>
	
Una solución es declarar alguno de nuestras variables como flotante, por ejemplo:

```kotlin
val y2 = -2f
```
Al detectar un Float, el resultado se vuelve flotante.

>0.71428573
	
</details>




