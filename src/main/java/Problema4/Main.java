package Problema4;
public class Main {

    public static void main(String[] args) {
        testCasoBasico();
        testCaso1();
        testCaso2();
        testCaso3();
        testSinFotos();
        testMultiplesFotosValidas();
        testConDistanciasAlBorde();
        testRangoFueraDeLimite();
        testFotoAnidada();
        testCadenaVacia();

        System.out.println("✔ Todos los tests pasaron correctamente.");
    }

    // todo los testCasoi son las pruebas que se muestran en el enunciado mismo
    private static void testCaso1() {
        char[] input = "afaea".toCharArray();
        int X = 1;
        int Y = 2;
        int resultado = new Problema4().calcularFotosArtisticas(input, X, Y);
        assert resultado == 1: "Fallo testCaso1, se esperaba 1 pero fue " + resultado;
    }
    

    private static void testCaso2() {
        char[] input = "afaea".toCharArray();
        int X = 2;
        int Y = 3;
        int resultado = new Problema4().calcularFotosArtisticas(input, X, Y);
        assert resultado == 0: "Fallo testCaso2, se esperaba 0 pero fue " + resultado;
    }
    
    private static void testCaso3() {
        char[] input = ".feaaf.e".toCharArray();
        int X = 1;
        int Y = 3;
        int resultado = new Problema4().calcularFotosArtisticas(input, X, Y);
        assert resultado == 3: "Fallo testCaso3, se esperaba 3 pero fue " + resultado;
    }
    
    
    
    // otros
    private static void testCasoBasico() {
        char[] input = "faefaefaefae".toCharArray();
        int resultado = new Problema4().calcularFotosArtisticas(input, 1, 100);
        assert resultado == 24 : "Fallo testCasoBasico, se esperaba 1 pero fue " + resultado;
    }

    private static void testSinFotos() {
        char[] input = "xxxxfxxaaxxexxx".toCharArray();
        int resultado = new Problema4().calcularFotosArtisticas(input, 2, 3);
        assert resultado == 0 : "Fallo testSinFotos, se esperaba 0 pero fue " + resultado;
    }

    private static void testMultiplesFotosValidas() {
        char[] input = "fae....aa....eaf".toCharArray();
        int resultado = new Problema4().calcularFotosArtisticas(input, 1, 3);
        assert resultado == 2 : "Fallo testMultiplesFotosValidas, se esperaba 2 pero fue " + resultado;
    }

    private static void testConDistanciasAlBorde() {
        char[] input = "fae".toCharArray();
        int resultado = new Problema4().calcularFotosArtisticas(input, 0, 2);
        assert resultado == 1 : "Fallo testConDistanciasAlBorde, se esperaba 1 pero fue " + resultado;
    }

    private static void testRangoFueraDeLimite() {
        char[] input = "fae".toCharArray();
        int resultado = new Problema4().calcularFotosArtisticas(input, 2, 3);
        assert resultado == 0 : "Fallo testRangoFueraDeLimite, se esperaba 0 pero fue " + resultado;
    }

    private static void testFotoAnidada() {
        char[] input = "faefae".toCharArray();
        int resultado = new Problema4().calcularFotosArtisticas(input, 1, 2);
        assert resultado == 2 : "Fallo testFotoAnidada, se esperaba 2 pero fue " + resultado;
    }

    private static void testCadenaVacia() {
        char[] input = "".toCharArray();
        int resultado = new Problema4().calcularFotosArtisticas(input, 1, 2);
        assert resultado == 0 : "Fallo testCadenaVacia, se esperaba 0 pero fue " + resultado;
    }
}
