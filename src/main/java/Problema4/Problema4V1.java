package Problema4;

import java.util.ArrayList;

public class Problema4V1 {

	class Solucion {
		int f, a, e;

		public Solucion(int f, int a, int e) {
			this.f = f;
			this.a = a;
			this.e = e;
		}

		@Override
		public String toString() {
			return "(" + f + ", " + a + ", " + e + ")";
		}
	}
	
	
	public int calcularFotosArtisticasV1(char[] A, int X, int Y) {
		// este método no se usa fue el primer intento al pensar el problema
		ArrayList<Integer> indicesFotografos = new ArrayList<>();
		ArrayList<Integer> indicesArtistas = new ArrayList<>();
		ArrayList<Integer> indicesEscenarios = new ArrayList<>();

		for (int i = 0; i < A.length; i++) {
			if (A[i] == 'f') indicesFotografos.add(i);
			else if (A[i] == 'a') indicesArtistas.add(i);
			else if (A[i] == 'e') indicesEscenarios.add(i);
		}

		ArrayList<Solucion> soluciones = new ArrayList<>();

		for (int pos_f : indicesFotografos) {
			for (int pos_a : indicesArtistas) {
				for (int pos_e : indicesEscenarios) {

					boolean creciente = (pos_f < pos_a) && (pos_a < pos_e);
					boolean decreciente = (pos_f > pos_a) && (pos_a > pos_e);

					int dist_fa = Math.abs(pos_f - pos_a);
					int dist_ae = Math.abs(pos_a - pos_e);
					boolean rango = (dist_fa >= X && dist_fa <= Y) && (dist_ae >= X && dist_ae <= Y);

					if (rango && (creciente || decreciente)) {
						soluciones.add(new Solucion(pos_f, pos_a, pos_e));
					}
				}
			}
		}

		return soluciones.size();

	}
}
