package Problema5;

public class TestProblema5 {

    public static void main(String[] args) {
		
		Problema5 prob = new Problema5();
		
		char[][] mapa1 = {
		        {'E', '.'},
		        {'#', 'S'}
		};
		

		System.out.println(prob.solucion(mapa1)); // respuesta correcta 2
		
		
		char[][] mapa2 = {
		        {'E', '#', '.'},
		        {'.', '#', 'S'},
		        {'.', '.', '.'}
		};
		
		System.out.println(prob.solucion(mapa2)); // respuesta correcta 5
		
		
		char[][] mapa4 = {
		        {'E', '.', '.'},
		        {'.', '.', '.'},
		        {'.', '.', 'S'}
		};
		
		System.out.println(prob.solucion(mapa4)); // respuesta correcta 4
		
		
		// caso de todo pared
		char[][] mapa3 = {
		        {'E', '#', '.'},
		        {'.', '#', '.'},
		        {'.', '#', 'S'}
		};
		
		System.out.println(prob.solucion(mapa3)); // respuesta correcta -1
		
		char[][] mapa5 = {
		        {'E', '.', 'S'},
		        {'.', '.', '.'},
		        {'.', '.', 'S'}
		};
		
		System.out.println(prob.solucion(mapa5)); // respuesta correcta 2
		
		
		
		char[][] mapa6 = {
		        {'E', '#', 'a'},
		        {'.', '#', '.'},
		        {'a', '#', 'S'}
		};
		
		System.out.println(prob.solucion(mapa6)); // respuesta correcta 5
		
		
		char[][] mapa7 = {
		        {'E', '#', 'a', 'b'},
		        {'.', '#', '#', '#'},
		        {'a', '#', 'b', 'S'}
		};
		
		
		
		System.out.println(prob.solucion(mapa7)); // respuesta correcta 6
		
		char[][] mapa8 = {
			    {'E', '.', '#', '.', 'b'},
			    {'.', '#', '.', '.', '.'},
			    {'.', '#', '#', '#', 'a'},
			    {'.', '#', '#', '#', '#'},
			    {'.', '.', '.', '#', 'b'},
			    {'.', '.', '.', '#', '.'},
			    {'.', '.', 'a', '#', 'S'},
			};
		
		System.out.println(prob.solucion(mapa8)); // respuesta correcta 14

		
		char[][] mapa9 = {
			    {'S', '.', 'b', '#', 'b'},
			    {'#', '#', '#', '#', 'a'},
			    {'.', '.', 'E', '#', '#'},
			    {'c', '#', '#', '.', 'c'},
			    {'#', 'a', '.', '.', '.'}
			};
		
		System.out.println(prob.solucion(mapa9)); // respuesta correcta 13

	}
    
    
    
	
}
