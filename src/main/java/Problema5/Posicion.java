package Problema5;

import java.util.Objects;

public class Posicion implements Cloneable {
    private int fila;
    private int columna;
    private char valor;


    @Override
	public int hashCode() {
		return Objects.hash(columna, fila, valor);
	}

    @Override
    public Posicion clone() {
        try {
            return (Posicion) super.clone(); // Copia superficial de los campos primitivos
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // No debería ocurrir ya que implementamos Cloneable
        }
    }
    

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila && valor == other.valor;
	}


	public String toString() {
    	return "(fila=" + this.fila + " , columna=" + this.columna + ", valor=" + this.valor + ")";
    }
    
    
    public Posicion(int fila, int columna, char valor) {
        this.valor = valor;
        this.fila = fila;
        this.columna = columna;
    }
    public int getFila() {
        return fila;
    }
    public int getColumna() {
        return columna;
    }
    
    public char getValor() {
        return this.valor;
    }
    
    public boolean esPared() {
		return this.valor == '#';
	}
    
    public boolean esPortal() {
    	return !(this.esFinal() || this.esEntrada()) && (Character.isLetter(valor));
    }
    
    public boolean esFinal() {
        return valor == 'S';
    }
    public boolean esEntrada() {
        return valor == 'E';
    }
}