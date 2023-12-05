package ProyectoFinal;

import java.io.*;
import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

public class Mapa {
    private int V; //vértices
    private int[][] matrizAdy; // Matriz de adyacencia
    private Nodo[] vertex;

    public Mapa(int v) {
        V = v;
        matrizAdy = new int[V][V];
        vertex = new Nodo[V];
    }

    public void agregarBodega(int id, String name, double lt, double ln) {
        vertex[id] = new Bodega(id, name, lt, ln);
    }

    public void agregarTienda(int id, String name, double lt, double ln) {
        vertex[id] = new Tienda(id, name, lt, ln);
    }

    // Método para agregar una arista al grafo
    public void agregarArista(int origen, int destino, int peso) {
        if (vertex[origen] != null && vertex[destino] != null) {
            matrizAdy[origen][destino] = peso;
            matrizAdy[destino][origen] = peso; // Si es no dirigido
        } else {
            System.out.println("Los nodos que desea conectar no existen en la base de datos");
        }
    }

    // Método para imprimir el grafo
    public void imprimirGrafo() {
        for (int i = 0; i < vertex.length; ++i) {
            System.out.println("\nLista de adyacencia del vértice " + i + " (" + vertex[i].name + ")");
            for (int j = 0; j < vertex.length; ++j) {
                if (matrizAdy[i][j] != 0) {
                    System.out.println(" -> " + j + " (peso: " + matrizAdy[i][j] + ")");
                }
            }
        }
    }

    // Algoritmo de Dijkstra
    public int[] dijkstra(int nodoOrigen) {
        boolean[] visitado = new boolean[V];
        int[] distancias = new int[V];
        Arrays.fill(distancias, Integer.MAX_VALUE);
        distancias[nodoOrigen] = 0;

        for (int count = 0; count < V - 1; count++) {
            int u = minimaDistancia(distancias, visitado);
            visitado[u] = true;

            for (int v = 0; v < V; v++) {
                if (!visitado[v] && matrizAdy[u][v] != 0 &&
                        distancias[u] != Integer.MAX_VALUE &&
                        distancias[u] + matrizAdy[u][v] < distancias[v]) {
                    distancias[v] = distancias[u] + matrizAdy[u][v];

                    if (matrizAdy[u][v] == 2) {
                        System.out.println("¡Las siguiente tienda necesita abastecerse!");
                        System.out.println(vertex[v].name);
                        System.out.println("Distancia desde la bodega " +vertex[u].name+": "+ calcDistance(vertex[u].latitude,vertex[u].longitude,vertex[v].latitude,vertex[v].longitude)+" Km");
                    }
                }
            }
        }
        return distancias;
    }


    private int minimaDistancia(int[] distancias, boolean[] visitado) {
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < V; v++) {
            if (!visitado[v] && distancias[v] <= min) {
                min = distancias[v];
                min_index = v;
            }
        }
        return min_index;
    }

    // Método para imprimir el recorrido de Dijkstra
    public void imprimirRecorridoDijkstra(int[] distancias, int nodoInicial) {
        System.out.println("Recorrido y pesos del algoritmo de Dijkstra desde el nodo " + nodoInicial + ":");
        for (int i = 0; i < distancias.length; i++) {
            if (distancias[i] != Integer.MAX_VALUE) {
                System.out.print("De " + nodoInicial + " a " + i + ": ");

                if (distancias[i] == 0) {
                    System.out.println("Peso: 0 (mismo nodo)");
                } else {
                    System.out.println("Peso: " + distancias[i]);
                }
            } else {
                System.out.println("No hay camino de " + nodoInicial + " a " + i);
            }
        }
    }

    public void actualizarAristasConectadas(int vertice, int nuevoPeso) {
        for (int i = 0; i < matrizAdy.length; i++) {
            if (matrizAdy[vertice][i] != 0 || matrizAdy[i][vertice] != 0) {
                // Actualiza el peso de las aristas desde y hacia el vértice
                matrizAdy[vertice][i] = nuevoPeso;
                matrizAdy[i][vertice] = nuevoPeso;
            }
        }
    }
    //Metodo para calcular la distancia de un lugar a otro usando la formula del semiverseno
    public double calcDistance(double L1, double LN1, double L2, double LN2) {
        double radL1= L1 * 3.1416/180;
        double radL2= L2 * 3.1416/180;
        double radLN1= LN1 * 3.1416/180;
        double radLN2= LN2 * 3.1416/180;

        return (2*6371)*Math.asin(Math.sqrt(Math.pow(Math.sin((radL2-radL1)/2),2)+Math.cos(radL1)*Math.cos(radL2)*Math.pow((radLN2-radLN1)/2,2)));
    }
    public void pedidoTienda(int id){
        // Cast para poder usar los metodos de la clase Tienda ya que el vector es de clase Nodo c:
        ((Tienda) vertex[id]).hacerPedido();
        // Luego solo actualizo todas las aristas conectadas a ese vertice Tienda para indicar necesita un pedido
        actualizarAristasConectadas(id,2);
    }

}


