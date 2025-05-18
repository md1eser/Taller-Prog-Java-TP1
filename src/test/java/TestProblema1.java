public class TestProblema1 {
    public static void main(String[] args) {
        Problema1 p = new Problema1(5);
        String texto = "Hola MundoA, hola mundoA, hola mundoB, hola mundoB, hola mundoB, hola mundob, hola mundoC, hola mundoC, hola mundoC, hola mundoD";
        String resultado = p.buscarPalabraMasRepetida(texto);
        System.out.println(resultado);    
    }
}
