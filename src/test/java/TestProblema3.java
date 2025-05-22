public class TestProblema3 {
    public static void main(String[] args) {
        Problema3 problema = new Problema3();

        // Caso 1: Árbol ordenadno (debe devolver true)
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
        System.out.println("Caso 1 (debe devolver true): " + resultado1);

        // Caso 2: Árbol NO ordenadno (debe devolver false)
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
        n5b.setRight(new Node(12)); // inválido: 12 > 10, pero está en el subárbol izquierdo
        n15b.setLeft(new Node(6));  // inválido: 6 < 10, pero está en el subárbol derecho

        boolean resultado2 = problema.estaOrdenado(raiz2);
        System.out.println("Caso 2 (debe devolver false): " + resultado2);
    }
}
