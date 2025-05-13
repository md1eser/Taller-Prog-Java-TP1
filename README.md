# Trabajo Práctico 1 - Taller de Programación Java

Este proyecto contiene la resolución de problemas del primer trabajo práctico.

## Integrantes

* Pedro Jossi
* Martin Dieser 


## Requisitos

- Java (JDK 8 o superior)
- Maven instalado (`mvn -v` para verificar)

- Pom.xml configurado en Java 21 

### Estructura 

taller-java/
├── pom.xml               ← Archivo de configuración de Maven.
└── src/
    ├── main/
    │   └── java/
    │       ├── Problema1.java   ← Código fuente de los problemas resueltos.
    │       └── Problema2.java
    └── test/
        └── java/
            ├── TestProblema1.java   ← Clase de prueba para Problema1.
            └── TestProblema2.java   ← Clase de prueba para Problema2.


### Compilar el proyecto:

```bash
mvn compile
```

### Correr los tests:

Para ejecutar una clase de prueba, usa el siguiente comando, reemplazando TestProblema1 por el nombre de la clase que quieras ejecutar:
(Ejecuta el método main de la clase)

```bash
mvn exec:java -DmainClass=TestProblema1
```




