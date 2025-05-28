package Problema1;
public class TestProblema1 {
    
    public static void main(String[] args) {
        testRepetido1();
        testRepetido2();
        testRepetido3();
        testRepetido4();
        testRepetido5();
        testRepetido6();
    }

    // Caso 1: Texto con puntuación variada
    public static void testRepetido1() {
        Problema1 p = new Problema1(4);
        String texto = "Hola, esto es una prueba. Esto es solo una prueba! ¿Hola? Prueba... hola. y prueba.";
        String resultado = p.buscarPalabraMasRepetida(texto);
        System.out.println("Test 1 (esperado: prueba): " + resultado);
    }

    // Caso 2: Mismo texto que el caso 1 para reproducibilidad
    public static void testRepetido2() {
        Problema1 p = new Problema1(4);
        String texto = "Hola, esto es una prueba. Esto es solo una prueba! ¿Hola? Prueba... hola. y prueba.";
        String resultado = p.buscarPalabraMasRepetida(texto);
        System.out.println("Test 2 (esperado: prueba): " + resultado);
    }

    // Caso 3: Palabras en mayúsculas y minúsculas
    public static void testRepetido3() {
        Problema1 p = new Problema1(4);
        String texto3 = "Casa casa CASA cAsA casa!";
        String resultado3 = p.buscarPalabraMasRepetida(texto3);
        System.out.println("Test 3 (esperado: casa): " + resultado3);
    }

    // Caso 4: Empate 
    public static void testRepetido4() {
        Problema1 p = new Problema1(4);
        String texto4 = "luna sol luna sol luna sol";
        String resultado4 = p.buscarPalabraMasRepetida(texto4);
        System.out.println("Test 4 (esperado: luna): " + resultado4);
    }

    // Caso 5: Ninguna palabra alcanza el mínimo largo
    public static void testRepetido5() {
        Problema1 p = new Problema1(4);
        String texto5 = "yo tú él";
        String resultado5 = p.buscarPalabraMasRepetida(texto5);
        System.out.println("Test 5 (esperado: \"\"): \"" + resultado5 + "\"");
    }

    // Caso 6: Palabra final sin separador
    public static void testRepetido6() {
        Problema1 p = new Problema1(4);
        String texto6 = "prueba final prueba prueba prueba";
        String resultado6 = p.buscarPalabraMasRepetida(texto6);
        System.out.println("Test 6 (esperado: prueba): " + resultado6);
    }   
}

