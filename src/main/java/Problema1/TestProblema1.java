package Problema1;
public class TestProblema1 {
    public static void main(String[] args) {
        Problema1 p = new Problema1(4);
    
        String texto = "Hola, esto es una prueba. Esto es solo una prueba! ¿Hola? Prueba... hola. y prueba.";

        String resultado = p.buscarPalabraMasRepetida(texto);
        //System.out.println("Resultado devuelto: " + resultado);

        // Caso 3: Palabras en mayúsculas y minúsculas
        String texto3 = "Casa casa CASA cAsA casa!";
        String resultado3 = p.buscarPalabraMasRepetida(texto3);

        //System.out.println("Caso 3 (esperado: casa): " + p.buscarPalabraMasRepetida(texto3));

        // Caso 4: Empate — se queda con la primera que alcanza el máximo
        String texto4 = "luna sol luna sol luna sol";
        String resultado4 = p.buscarPalabraMasRepetida(texto4);

        //System.out.println("Caso 4 (esperado: luna): " + p.buscarPalabraMasRepetida(texto4));

        // Caso 5: Ninguna palabra alcanza el mínimo largo
        String texto5 = "yo tú él";
        String resultado5 = p.buscarPalabraMasRepetida(texto5);

        //System.out.println("Caso 5 (esperado: \"\"): " + p.buscarPalabraMasRepetida(texto5));

        // Caso 6: Palabra final sin separador
        String texto6 = "prueba final prueba prueba prueba";
        String resultado6 = p.buscarPalabraMasRepetida(texto6);

        //System.out.println("Caso 6 (esperado: prueba): " + p.buscarPalabraMasRepetida(texto6));

    }    
}

