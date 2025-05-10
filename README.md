# Trabajo Práctico 1 - Taller de Programación Java

Este proyecto contiene la resolución de problemas del primer trabajo práctico.

## Integrantes

* Pedro Jossi
* Martin Dieser 


## Requisitos

- Java (JDK 8 o superior)
- Maven instalado (`mvn -v` para verificar)

### Estructura 


* `Problema<i>.java`,  ubicados dentro de `src/main/java` contiene el código fuente. 

* `Problema<i>Test.java`. ubicados dentro de `/test` contiene los casos de prueba para la solución propuesta.

donde `<i>` representa el número del problema correspondiente

### Compilar el proyecto:

```bash
mvn compile
```

### Correr los tests:

```bash
mvn test -Dtest=Problema*Test
```




