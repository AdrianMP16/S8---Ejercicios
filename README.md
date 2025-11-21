Este proyecto es un programa en Java donde se registran diferentes dispositivos electrónicos, específicamente laptops y teléfonos.
La idea principal es practicar conceptos básicos de programación orientada a objetos.

¿Qué se hizo en el proyecto?

Se creó una clase padre llamada Dispositivo, que tiene los datos básicos:

marca

modelo

precio

Luego se hicieron dos clases hijas:

Laptop

Telefono

Cada una añade información extra, como la RAM o el sistema operativo.

También se creó una excepción personalizada llamada DatoInvalidoException, que se usa cuando el usuario ingresa datos incorrectos (como precio negativo o marca vacía).

En la clase Main, se hace un ArrayList donde se guardan los dispositivos y se muestran en pantalla.

Se aplica polimorfismo, porque cada clase hija muestra su información de una manera diferente.

¿Para qué sirve?

Sirve para practicar:

Herencia

Polimorfismo

Encapsulamiento

Manejo de errores

Manejo de listas

Ejecución

Al ejecutar el programa, se crean varios dispositivos (algunos correctos y otros que generan error), y luego se muestran todos los dispositivos registrados.
