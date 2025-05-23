import java.util.ArrayList;
import java.util.List;

public class Problema5 {

    public class Laberinto{
        private Integer filas;
        private Integer columnas;
        private Posicion[][] matriz;

        public Laberinto(long filas, long columnas) {
            this.filas = filas;
            this.columnas = columnas;
        }
        public void llenarLaberinto(char[][] datos) {
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    matriz[i][j] = new matriz(i, j, datos[i][j]);
                }
            }
        }
        public ArrayList<Posicion> getFila(int nroFila){
            ArrayList<Posicion> fila = new ArrayList<Posicion>();
            for (int i = 0; i < matriz.length; i++) {
                fila.add(matriz[nroFila][i]);
            }
            return fila;
        }
    }
    public class Posicion {
        private int fila;
        private int columna;
        private char valor;

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
        public boolean esFinal() {
            return valor == 'S';
        }
        public boolean esEntrada() {
            return valor == 'E';
        }
    }

    Integer masCorto =0;

    
    private Posicion encontrarEntrada(char[][] laberinto){
        for (int i = 0; i < laberinto.length; i++) {
            for (int j = 0; j < laberinto[i].length; j++) {
                if (laberinto[i][j] == 'E') {
                    return new Posicion(i,j, laberinto[i][j]);
                }
            }
        }
    }

    public int solucion(char[][] laberinto){
        Posicion entrada = encontrarEntrada(laberinto);
        
         camino(laberinto, entrada, new ArrayList<Posicion>());
    }

    public int caminos(char[][] laberinto, Posicion pos, List<Posicion> camino) {
        if(pos.esEntrada()){
            camino.add(pos);
        }
        for (Posicion p : this.getPosiblesMovimientos(laberinto, pos)) {
            camino.add(p);

            if(p.esFinal()){
                if (masCorto > camino.size()) {
                    masCorto = camino.size();
                    camino.clear();
                }
            }
            else{
                caminos(laberinto, p, camino);
            }
            
        }
        camino.removeLast();

    }

    public List<Posicion> getPosiblesMovimientos(char[][] laberinto, Posicion pos) {
        List<Posicion> posibles = new ArrayList<Posicion>();
        int fila = pos.getFila();
        int columna = pos.getColumna();

        if (fila < laberinto.length) {
            posibles.add(new Posicion(fila, columna, laberinto[fila][columna]));
        }
        if (fila < laberinto.length - 1 && laberinto[fila + 1][columna] != 'X') {
            posibles.add(new Posicion(fila + 1, columna, laberinto[fila + 1][columna]));
        }
        if (columna > 0 && laberinto[fila][columna - 1] != 'X') {
            posibles.add(new Posicion(fila, columna - 1, laberinto[fila][columna - 1]));
        }
        if (columna < laberinto[0].length - 1 && laberinto[fila][columna + 1] != 'X') {
            posibles.add(new Posicion(fila, columna + 1, laberinto[fila][columna + 1]));
        }

        return posibles;
    }
}
