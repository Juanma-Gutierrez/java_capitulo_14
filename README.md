# java_capitulo_14

Soluciones a los ejercicios del libro **Aprende Java con ejercicios** de Luis José Sánchez (_Edición 2019_).

Este libro está a la venta en <https://leanpub.com/aprendejava>

![image](https://user-images.githubusercontent.com/101201349/198890431-a5598843-2252-4e82-a764-bb1380121200.png)

## Listado de ejercicios

[Ejercicio 1](#ejercicio-1)
[Ejercicio 2](#ejercicio-2)
[Ejercicio 3](#ejercicio-3)

## Ejercicio 1

Realiza un programa que pida 6 números por teclado y nos diga cuál es el
máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
entero) el programa debe indicarlo y debe pedir de nuevo el número.

```
Ejemplo:
Por favor, introduzca el número 1: 123
Por favor, introduzca el número 2: abc
El dato introducido no es correcto.
Debe introducir un número entero. Por favor, introduzca el número 2: 80
Por favor, introduzca el número 3: 35
Por favor, introduzca el número 4: qwerty
El dato introducido no es correcto.
Debe introducir un número entero. Por favor, introduzca el número 4: zxcv
El dato introducido no es correcto.
Debe introducir un número entero. Por favor, introduzca el número 4: 42
Por favor, introduzca el número 5: 24
Por favor, introduzca el número 6: 36
El mayor número introducido es el 123
```

## Ejercicio 2

Modifica la clase Gato vista anteriormente añadiendo el método apareaCon.
Este método debe comprobar que los gatos son de distinto sexo, tras lo
cual, genera un nuevo gato. Por ejemplo, sería válido algo como Gato cria
= garfield.apareaCon(lisa). En caso de que los gatos sean del mismo sexo,
el método debe generar la excepción ExcepcionApareamientoImposible. Crea un
programa desde el que se pruebe el método.

## Ejercicio 3

Realiza un programa que genere una excepción de forma aleatoria de entre
las siguientes excepciones: NumberFormatException, IOException, FileNotFoundException,
IndexOutOfBoundsException y ArithmeticException.
