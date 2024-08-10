# Ejercicios de Threads, Streams & Lambdas

Este repositorio contiene ejercicios prácticos diseñados para reforzar los conceptos de **Threads**, **Streams** y **Lambdas** en Java.

## Threads

1. **Mostrar los números del 1 al 20 con un retardo de 3 segundos entre cada número.**

2. **Generar un `Thread` o una implementación de `Runnable` que:**
   - Imprima números pares (del 1 al 10) y calcule la suma.
   - Lance junto a otro `Thread` o `Runnable` que imprima números impares (del 1 al 10) y calcule la suma.
   - Cada `Thread` muestra la suma resultante cuando finaliza.
   - Utilice las pausas necesarias para que se observe el paralelismo.

## Streams & Lambdas

### Definición de la clase `Alumno`:

```java
public class Alumno {
    int id;
    String dni;
    String nombre;
    String apellido;
    String curso;
    double nota;
    int edad;
} 
```
## Ejercicios

Cree una lista y cargue un número considerable de alumnos (15 o más) con valores al azar.

**Realice las siguientes operaciones utilizando Streams y Lambdas:**
   
- a) Muestre todos los alumnos de la lista.

- b) Muestre todos los alumnos ordenados de menor a mayor por edad.

- c) Muestre aquellos alumnos cuyo nombre empieza con un carácter dado.
(Elija el carácter en base a la lista de nombres utilizada.)

- d) Sume la edad de todos los alumnos.

- e) Obtenga un mapa donde la clave sea la nota y el valor sea una lista de alumnos que tienen esa nota.




