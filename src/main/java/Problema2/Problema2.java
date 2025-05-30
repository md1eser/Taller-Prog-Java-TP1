package Problema2;

public class Problema2 {

	private int cotaInf;
	private int cotaSup;
	

	public Problema2() {
		this.cotaInf = 0;
		this.cotaSup = 90;
	}
	
	
	public long fibonacci(int n) {
		/*
		 * La estrategia es bastante simple, el usuario deberia llamar
		 * al método fibonacci(n) donde se chequea que el entero pedido esta
		 * en el rango [0,90] una única vez, y luego se cálcula usando
		 * un método auxiliar privado el valor fibonacci recursivamente
		 * siguiendo:
		 * 	  - fib(0) = fib(1) = 1
		 * 	  - fib(n) = fib(n-1) + fib(n-2)
		 * 
		 * Nota interesante:
		 * Inicialmente la función retornaba un entero pero
		 * cuando hicimos las pruebas con los límites fib(90) que es
		 * el valor 2.880.067.194.370.816.120, y lo int en java tienen el
		 * rango de 2.147.483.647 que es claramente menor. Entonces
		 * probamos con long que representa un mayor rango,
		 * especificamente hasta 9.223.372.036.854.775.807.
		 * 
		 * Opcionalmente para lo que se pide de fib(1000) se deberia
		 * encontrar un tipo de dato correcto, pero fib(1000) no entraría
		 * en ningún dato primitivo como se pide en la consigna. 
		 * Se deberia usar BigInteger en el caso que se permitan datos no primitivos.
		 */
		if  ( !(n <= this.cotaSup) || !(n >= this.cotaInf) ) {
			throw new IllegalArgumentException("Debe ser un entero mayor o igual a 0 y menor igual a 90.");
		};
	    long fib_anterior = 1;
	    long fib_actual = 1;
		
		if (n <= 1) return fib_actual;

		// calculamos iterativamente fib(n) > fib(1)
	    for (int posicion = 2; posicion <= n; posicion++) {
	        long sig = fib_anterior + fib_actual;
	        // actualizamos los valores
	        fib_anterior = fib_actual;
	        fib_actual = sig;
	    }

	    return fib_actual;
	}
}
