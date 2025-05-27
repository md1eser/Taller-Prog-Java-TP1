package Problema5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problema5 {

    
    public int solucion(char[][] mapa){
    	Laberinto lab = new Laberinto(mapa);
    	ArrayList<Camino> caminos = new ArrayList<Camino>();
    	Camino camino = new Camino(lab.getEntrada());
       
    	this.backtracking(lab, caminos, camino);
        //System.out.println(caminos);
        if (caminos.isEmpty()) {
        	return -1;
        }
        
        int minimo = Integer.MAX_VALUE;
        for (Camino c : caminos) {
        	if (minimo > c.getLongitud()) {
        		minimo = c.getLongitud();
        	}
        }
        return minimo;
    }

    public void backtracking(Laberinto lab, ArrayList<Camino> caminos, Camino caminoActual) {
    	// te devuelve un camino si existe ó null si no hay caminos a la salida
    	
    	//System.out.println("essalida: " + caminoActual.llegoSalida());
    	
    	if (caminoActual.llegoSalida()) {
    		caminos.add(caminoActual.clone());
    		return;
    	}
    	
        for (Posicion p : lab.getAdyacentes( caminoActual.getUltimaPosicion() )) {

        	if (caminoActual.addPaso(p)) {
        		backtracking(lab, caminos, caminoActual);
            	caminoActual.retroceder();
        	}
        }

    }

}
