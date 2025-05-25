package Problema2;

public class TestProblema2 {


    public static void main(String[] args) {
        testFib0();
        testFib1();
        testFib10();
        testFib90();
        testFibMenorQueCota();
        testFibMayorQueCota();

        System.out.println("Todos los tests pasaron correctamente.");
    }

    public static void testFib0() {
        Problema2 problema = new Problema2();
        long resultado = problema.fibonacci(0);
        assert resultado == 1 : "fib(0) debería ser 1, pero fue " + resultado;
    }

    public static void testFib1() {
        Problema2 problema = new Problema2();
        long resultado = problema.fibonacci(1);
        assert resultado == 1 : "fib(1) debería ser 1, pero fue " + resultado;
    }

    public static void testFib10() {
        Problema2 problema = new Problema2();
        long resultado = problema.fibonacci(10);
        assert resultado == 89 : "fib(10) debería ser 89, pero fue " + resultado;
    }

    public static void testFib90() {
        Problema2 problema = new Problema2();
        long esperado = 2880067194370816120L;
        long resultado = problema.fibonacci(90);
        assert resultado == esperado : "fib(90) debería ser " + esperado + ", pero fue " + resultado;
    }

    public static void testFibMenorQueCota() {
        Problema2 problema = new Problema2();
        boolean lanzo = false;
        try {
            problema.fibonacci(-1);
        } catch (IllegalArgumentException e) {
            lanzo = true;
        }
        assert lanzo : "fib(-1) debería lanzar IllegalArgumentException";
    }

    public static void testFibMayorQueCota() {
        Problema2 problema = new Problema2();
        boolean lanzo = false;
        try {
            problema.fibonacci(91);
        } catch (IllegalArgumentException e) {
            lanzo = true;
        }
        assert lanzo : "fib(91) debería lanzar IllegalArgumentException";
    }
}
