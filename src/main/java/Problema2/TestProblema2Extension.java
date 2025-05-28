package Problema2;

import java.math.BigInteger;

public class TestProblema2Extension {

    public static void main(String[] args) {
        testFib0();
        testFib90();
        testFibMenorQueCota();
        testFibNumeroGrande();

        System.out.println("Todos los tests de Problema2Extension pasaron correctamente.");
    }

    public static void testFib0() {
        Problema2Extension problema = new Problema2Extension();
        BigInteger resultado = problema.fibonacci(0);
        assert resultado.equals(BigInteger.ONE) : "fib(0) debería ser 1, pero fue " + resultado;
    }

    public static void testFib90() {
        Problema2Extension problema = new Problema2Extension();
        BigInteger esperado = new BigInteger("2880067194370816120");
        BigInteger resultado = problema.fibonacci(90);
        assert resultado.equals(esperado) : "fib(90) debería ser " + esperado + ", pero fue " + resultado;
    }

    public static void testFibMenorQueCota() {
        Problema2Extension problema = new Problema2Extension();
        boolean lanzo = false;
        try {
            problema.fibonacci(-1);
        } catch (IllegalArgumentException e) {
            lanzo = true;
        }
        assert lanzo : "fib(-1) debería lanzar IllegalArgumentException";
    }

    public static void testFibNumeroGrande() {
        Problema2Extension problema = new Problema2Extension();
        BigInteger esperado = new BigInteger("573147844013817084101"); // F(100)
        BigInteger resultado = problema.fibonacci(100);
        assert resultado.equals(esperado) : "fib(100) debería ser " + esperado + ", pero fue " + resultado;
    }


}