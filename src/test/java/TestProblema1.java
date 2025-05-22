public class TestProblema1 {
    public static void main(String[] args) {
        Problema1 p = new Problema1(4);
    
        String texto = "Hola, esto es una prueba. Esto es solo una prueba! ¿Hola? Prueba... hola. y prueba";

        String resultado = p.buscarPalabraMasRepetida(texto);
        //System.out.println("Resultado devuelto: " + resultado);
    }    
}

