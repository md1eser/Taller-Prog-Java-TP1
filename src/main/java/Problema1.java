
import java.util.HashMap;
import java.util.Map;

public class Problema1 {
    private int largoMIN;

    public Problema1(int largoMIN) {
        this.largoMIN = largoMIN;
    }

    public String buscarPalabraMasRepetida(String texto) {
        String[] palabras = texto.split("[^a-zA-Z]+");//split separa el string texto con el delimitador. el caracter ^ niega lo que sigue, en este caso los caracteres de letras a-z y A-Z. Por lo tanto, se separa el texto en palabras.
        Map<String, Integer> contador = new HashMap<>();
        for (String p : palabras) {
            p = p.toLowerCase();//para que no sea sensible a mayúsculas
            if (p.length() >= largoMIN) {//se hace la verificación de que la palabra sea mayor o igual al largo mínimo
                contador.put(p, contador.getOrDefault(p, 0) + 1); //si todavía no estaba, agrega la palabra al mapa. Si ya estaba, suma 1 a la cantidad de veces que se repitió (sobreescribiendo el valor).
            }
        }
        String palabraMasRepetida = null;
        int maxRepeticiones = 0;
        for (Map.Entry<String, Integer> elemento : contador.entrySet()) {   //recorre el mapa de palabras y busca la que más se repitió
            if (elemento.getValue() > maxRepeticiones) {
                maxRepeticiones = elemento.getValue();
                palabraMasRepetida = elemento.getKey();
            }
        }

        if (palabraMasRepetida == null) {
            return "No se encontraron palabras con longitud mayor o igual a " + largoMIN;
        }
        if (maxRepeticiones == 1) {
            return "No se encontraron palabras repetidas con longitud mayor o igual a " + largoMIN;
        }
        return "La palabra más repetida es: " + palabraMasRepetida + " y se repite " + maxRepeticiones + " veces";
    }



    public static void main(String[] args) {
        Problema1 p = new Problema1(5);
        String texto = "Hola MundoA, hola mundoA, hola mundoB, hola mundoB, hola mundoB, hola mundob, hola mundoC, hola mundoC, hola mundoC, hola mundoD";
        String resultado = p.buscarPalabraMasRepetida(texto);
        System.out.println(resultado);    
    }

}