
public class Problema3 {
  
    public boolean estaOrdenado(Node raiz) {
        return estaOrdenado(raiz, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean estaOrdenado(Node nodo, int min, int max) {
        if (nodo == null) {
            return true;
        }
        if (nodo.getData() <= min || nodo.getData() >= max) {
            return false;
        }
        return estaOrdenado(nodo.getLeft(), min, nodo.getData()) &&
               estaOrdenado(nodo.getRight(), nodo.getData(), max);
    }
    
}    
