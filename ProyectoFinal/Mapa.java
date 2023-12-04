package ProyectoFinal;

import java.util.ArrayList;
import java.util.Arrays;

public class Mapa {
    private int V; //vértices
    private int[][] matrizAdy; // Matriz de adyacencia

    public Mapa(int v) {
        V = v;
        matrizAdy = new int[V][V];
    }

    // Método para agregar una arista al grafo
    public void agregarArista(int origen, int destino, int peso) {
        matrizAdy[origen][destino] = peso;
        matrizAdy[destino][origen] = peso; // Si es no dirigido
    }

    //Getters
    private ArrayList<int[]> obtenerAristas() {
        ArrayList<int[]> aristas = new ArrayList<>();
        for (int i = 0; i < V; ++i) {
            for (int j = i + 1; j < V; ++j) {
                if (matrizAdy[i][j] != 0) {
                    aristas.add(new int[]{i, j, matrizAdy[i][j]});
                }
            }
        }
        return aristas;
    }

    // Método para imprimir el grafo
    public void imprimirGrafo() {
        for (int i = 0; i < V; ++i) {
            System.out.println("\nLista de adyacencia del vértice " + i);
            for (int j = 0; j < V; ++j) {
                if (matrizAdy[i][j] != 0) {
                    System.out.println(" -> " + j + " (peso: " + matrizAdy[i][j] + ")");
                }
            }
        }
    }



    //Algorimo de dijkstra para calcular que tiendas necesitan abastecimiento (1 = Necesita , 0 = No necesita)
    public int[] dijkstra(int nodoOrigen) {
        boolean[] visitado = new boolean[V];
        int[] distancias = new int[V];
        Arrays.fill(distancias, Integer.MAX_VALUE);
        distancias[nodoOrigen] = 0;

        dijkstraRecursivo(nodoOrigen, visitado, distancias);

        return distancias;
    }

    private void dijkstraRecursivo(int nodoActual, boolean[] visitado, int[] distancias) {
        visitado[nodoActual] = true;

        for (int v = 0; v < V; v++) {
            if (!visitado[v] && matrizAdy[nodoActual][v] != 0 &&
                    distancias[nodoActual] != Integer.MAX_VALUE &&
                    distancias[nodoActual] + matrizAdy[nodoActual][v] < distancias[v]) {
                distancias[v] = distancias[nodoActual] + matrizAdy[nodoActual][v];
            }
        }

        int nodoSiguiente = obtenerNodoSiguiente(distancias, visitado);
        if (nodoSiguiente != -1) {
            dijkstraRecursivo(nodoSiguiente, visitado, distancias);
        }
    }

    private int obtenerNodoSiguiente(int[] distancias, boolean[] visitado) {
        int nodoSiguiente = -1;
        int distanciaMinima = Integer.MAX_VALUE;

        for (int v = 0; v < V; v++) {
            if (!visitado[v] && distancias[v] < distanciaMinima) {
                nodoSiguiente = v;
                distanciaMinima = distancias[v];
            }
        }

        return nodoSiguiente;
    }

    // Método para imprimir el árbol recubridor minimo
    public void imprimirArbol(ArrayList<int[]> aristasArbol) {
        System.out.println("Aristas del árbol recubridor minimo:");
        for (int[] edge : aristasArbol) {
            System.out.println("Arista: " + edge[0] + " - " + edge[1] + ", Peso: " + edge[2]);
        }
    }

    //Metodo para imprimir el reccorido de Dijkstra
    public void imprimirRecorridoDijkstra(int[] distancias, int nodoInicial) {
        System.out.println("Recorrido y pesos del algoritmo de Dijkstra desde el nodo " + nodoInicial + ":");
        for (int i = 0; i < distancias.length; i++) {
            if (distancias[i] != Integer.MAX_VALUE) {
                System.out.println("De " + nodoInicial + " a " + i + ", Peso: " + distancias[i]);
            } else {
                System.out.println("No hay camino de " + nodoInicial + " a " + i);
            }
        }
    }
}
