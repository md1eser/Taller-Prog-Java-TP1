package Problema5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Laberinto {
	
	private char[][] mapa;
	private Posicion entrada;
	
	public Laberinto(char[][] mapa) {
		this.mapa = mapa;
        for (int i = 0; i < this.mapa.length; i++) {
            for (int j = 0; j < this.mapa[i].length; j++) {
                if (this.mapa[i][j] == 'E') {
                    this.entrada = new Posicion(i,j, this.mapa[i][j]);
                }
            }
        }
	}
	
	public boolean dentroDelMapa(int fila, int columna) {
        return fila >= 0 && fila < this.mapa.length && columna >= 0 && columna < this.mapa[0].length;
	}
	
	public Posicion getSalidaPortal(Posicion portal) {
		
		if (!portal.esPortal()) {
			return null;
		}
		
        for (int i = 0; i < this.mapa.length; i++) {
            for (int j = 0; j < this.mapa[i].length; j++) {
            	char v = this.mapa[i][j];            	
            	Posicion pos = new Posicion(i, j, v);
            	//System.out.println(pos + " " +  portal + " " + v + " " + ((portal != pos)));
                if ( (portal.getValor() == v) && (!portal.equals(pos)) ) {
                    return pos;
                }
            }
        }

        return null;
	}
	
	
	public List<Posicion> getAdyacentes(Posicion posicion) {
		
        List<Posicion> adyacentes = new ArrayList<>();
        int fila = posicion.getFila();
        int columna = posicion.getColumna();
        int[][] movimientos = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // detectar portales
        if (posicion.esPortal()) {
        	Posicion salida = this.getSalidaPortal(posicion);
        	
        	if (salida != null) {
        		adyacentes.add(salida);
        	}
        }
        
                
        for (int[] movimiento : movimientos) {
            int i = fila + movimiento[0];
            int j = columna + movimiento[1];            
            
            
            if (this.dentroDelMapa(i, j)) {
               adyacentes.add(new Posicion(i, j, mapa[i][j]));
            }
        }
        
        /*
        System.out.println();
        System.out.println(posicion);
        for (Posicion p : adyacentes) {
        	System.out.println("adyacente: " + p);
        }
        */
        return adyacentes;
	}
	


	public Posicion getEntrada(){
		return this.entrada;
    }
	
}
