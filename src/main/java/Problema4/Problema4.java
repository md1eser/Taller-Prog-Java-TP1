package Problema4;

import java.util.ArrayList;
import java.util.List;

public class Problema4 {

    public int calcularFotosArtisticas(char[] A, int X, int Y) {
    	/*
    	la estrategia es: 
    	por cada artista que encontrás
	      - buscás a la izquierda entre [X,Y] de distancia:
	          - si hay un fotógrafo -> lo guardás
	          - si hay un escenario -> lo guardás
	      - luego buscás a la derecha entre [X,Y] de distancia:
	          - si hay un escenario y antes guardaste un fotógrafo -> contás una solución
	          - si hay un fotógrafo y antes guardaste un escenario -> contás una solución
	      - solo se cuentan combinaciones ordenadas: f < a < e o e < a < f
	      - las dos distancias (f-a y a-e) deben estar dentro del rango [X,Y]
    	 */
    	
    	
        int n = A.length;
        int contador = 0;

        for (int i = 0; i < n; i++) {
            if (A[i] == 'a') {
                List<Integer> fotografosIzq = new ArrayList<>();
                List<Integer> escenariosIzq = new ArrayList<>();

                for (int j = Math.max(0, i - Y); j <= i - X; j++) {
                    if (A[j] == 'f') {
                        fotografosIzq.add(j);
                    } else if (A[j] == 'e') {
                        escenariosIzq.add(j);
                    }
                }

                for (int k = i + X; k <= Math.min(n - 1, i + Y); k++) {
                    if (A[k] == 'e') {
                        for (int posF : fotografosIzq) {
                            if (cumpleDistancias(posF, i, k, X, Y)) {
                                contador++;
                            }
                        }
                    } else if (A[k] == 'f') {
                        for (int posE : escenariosIzq) {
                            if (cumpleDistancias(posE, i, k, X, Y)) {
                                contador++;
                            }
                        }
                    }
                }
                
            }
        }
        return contador;
    }

    private boolean cumpleDistancias(int i1, int i2, int i3, int X, int Y) {
        int d1 = Math.abs(i2 - i1);
        int d2 = Math.abs(i3 - i2);
        return d1 >= X && d1 <= Y && d2 >= X && d2 <= Y;
    }
}
