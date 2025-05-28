package Problema3;

public class TestProblema3 {

    public static void main(String[] args) {
        testOrdenado();
        testNoOrdenado();
    }

    // Caso 1: Árbol ordenado (debe devolver true)
    public static void testOrdenado() {
        Problema3 problema = new Problema3();

        //          10
        //        /   \
        //       5     15
        //     /  \      \
        //    2    7     20
        Node raiz1 = new Node(10);
        Node n5 = new Node(5);
        Node n15 = new Node(15);
        raiz1.setLeft(n5);
        raiz1.setRight(n15);
        n5.setLeft(new Node(2));
        n5.setRight(new Node(7));
        n15.setRight(new Node(20));

        boolean resultado1 = problema.estaOrdenado(raiz1);
        System.out.println("Test 1 (esperado: true): " + resultado1);
    }

    // Caso 2: Árbol NO ordenado (debe devolver false)
    public static void testNoOrdenado() {
        Problema3 problema = new Problema3();

        //           10
        //        /     \
        //       5       15
        //     /  \     /
        //    2    12  6  
        Node raiz2 = new Node(10);
        Node n5b = new Node(5);
        Node n15b = new Node(15);
        raiz2.setLeft(n5b);
        raiz2.setRight(n15b);
        n5b.setLeft(new Node(2));
        n5b.setRight(new Node(12)); // inválido
        n15b.setLeft(new Node(6));  // inválido

        boolean resultado2 = problema.estaOrdenado(raiz2);
        System.out.println("Test 2 (esperado: false): " + resultado2);
    }
}
