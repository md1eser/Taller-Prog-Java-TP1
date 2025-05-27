package Problema5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Camino implements Cloneable {
	private List<Posicion> posiciones;
	
	public Camino(Posicion entrada) {
		this.posiciones = new ArrayList<Posicion>();
		this.addPaso(entrada);
	}

	
	private boolean esPasoValido(Posicion p) {
		//System.out.println(p);
		//System.out.println( !p.esPared() && !this.posiciones.contains(p));

		return !p.esPared() && !this.posiciones.contains(p);
		
	}
	
	@Override
	public String toString() {
		return "Camino [posiciones=" + posiciones + "]";
	}


	public void retroceder() {
		this.posiciones.removeLast();
	}
	
	public Posicion getUltimaPosicion() {
		return this.posiciones.getLast();
	}
	
	
	public boolean addPaso(Posicion p) {
		// se asume que el paso es adyacente
		if (this.esPasoValido(p)) {
			this.posiciones.add(p);
			return true;
		}
		return false;
	}
	
	public int getLongitud() {
		return this.posiciones.size() - 1; // se omite la entrada
	}

	public boolean llegoSalida() {
		return this.posiciones.getLast().esFinal();
	}
	
	
    @Override
    public Camino clone() {
        try {
            Camino copia = (Camino) super.clone(); // Copia superficial del Camino

            // Realizar la copia profunda de la lista 'posiciones'
            copia.posiciones = new ArrayList<>();
            for (Posicion posicion : this.posiciones) {
                copia.posiciones.add(posicion.clone()); // Llamamos al clone de Posicion para una copia profunda
            }

            return copia;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // No debería ocurrir ya que implementamos Cloneable
        }
    }
	
}
