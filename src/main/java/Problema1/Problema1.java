package Problema1;

import java.util.HashMap;
import java.util.Map;

public class Problema1 {
    private int largoMIN;

    public Problema1(int largoMIN) {
        this.largoMIN = largoMIN;
    }

    public String buscarPalabraMasRepetida(String texto) { 
    //realiza una recorrida por el texto mientas guarda las palabras en un mapa y busca la que más se repite.
    //considera que cualquier cosa que no sea una letra es un separador de palabras.
    //no diferencia mayusculas
        String palabra= "";
        String palabraMasRepetida = "";
        int maxRepeticiones = 0;
        Map<String,Integer> contador = new HashMap<>();
        for(int i=0; i < texto.length(); i++){
            char charActual = texto.charAt(i);
            if(!Character.isLetter(charActual)) {
                if (palabra.length() >= largoMIN){
                    contador.put(palabra, contador.getOrDefault(palabra,0) + 1);
                    if (contador.get(palabra) > maxRepeticiones){
                        maxRepeticiones = contador.get(palabra);
                        palabraMasRepetida = palabra;
                    }
                }
                palabra = "";
            }
            else {palabra = palabra + Character.toLowerCase(charActual);}   
        }

        // esta parte procesa la última palabra si el texto no termina en un separador
        if (palabra.length() >= largoMIN) {
            contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
            if (contador.get(palabra) > maxRepeticiones) {
                maxRepeticiones = contador.get(palabra);
                palabraMasRepetida = palabra;
            } 
        }
    
        System.out.println("Palabra (con más de " + largoMIN + " caracteres) mas repetida es: " + palabraMasRepetida +" con " + contador.get(palabraMasRepetida) + " repeticiones.");  
        return palabraMasRepetida;
    }
}