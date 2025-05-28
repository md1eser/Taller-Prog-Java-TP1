package Problema2;

import java.math.BigInteger;

public class Problema2Extension {

	private int cotaInf;


	public Problema2Extension() {
		this.cotaInf = 0;
	}
	
	
	public BigInteger fibonacci(int n) {
		if  (n < this.cotaInf)  {
			throw new IllegalArgumentException("Debe ser un entero mayor o igual a 0");
		};
	    BigInteger fib_anterior = BigInteger.ONE;
	    BigInteger fib_actual = BigInteger.ONE;
		
		if (n <= 1) return fib_actual;

		// calculamos iterativamente fib(n) > fib(1)
	    for (int posicion = 2; posicion <= n; posicion++) {
			BigInteger sig = fib_anterior.add(fib_actual);
			fib_anterior = fib_actual;
			fib_actual = sig;
	    }

	    return fib_actual;
	}

}
