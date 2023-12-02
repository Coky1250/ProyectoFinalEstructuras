/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Dijkstra {

    public int[] ejecutarDijkstra(Grafo_Matriz_Adyacencia grafo, int inicio) {
        int V = grafo.V;
        int[][] matrizAdyacencia = grafo.matrizAdyacencia;

        int[] distancias = new int[V];
        Arrays.fill(distancias, Integer.MAX_VALUE / 2); // Evitar desbordamiento
        distancias[inicio] = 0;

        PriorityQueue<Integer> colaPrioridadVertices = new PriorityQueue<>(Comparator.comparingInt(v -> distancias[v]));

        // Utilizar una clase Wrapper para almacenar tanto el vértice como su distancia
        class VerticeDistancia {
            int vertice;
            int distancia;

            VerticeDistancia(int vertice, int distancia) {
                this.vertice = vertice;
                this.distancia = distancia;
            }
        }

        colaPrioridadVertices.offer(inicio);

        while (!colaPrioridadVertices.isEmpty()) {
            int u = colaPrioridadVertices.poll();

            for (int v = 0; v < V; v++) {
                if (matrizAdyacencia[u][v] > 0) { // Verificar si hay arco
                    int nuevaDistancia = distancias[u] + matrizAdyacencia[u][v];
                    if (nuevaDistancia < distancias[v]) {
                        distancias[v] = nuevaDistancia;
                        colaPrioridadVertices.offer(v);
                    }
                }
            }
        }

        return distancias;
    }
}