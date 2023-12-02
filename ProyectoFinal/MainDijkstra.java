/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal;

import java.util.Arrays;

/**
 *
 * @author Familia Monares
 */
public class MainDijkstra {
    
    public static void main(String[] args) {
        Grafo_Matriz_Adyacencia grafo = new Grafo_Matriz_Adyacencia(10);
        grafo.agregarArista(1, 2, 4);
        grafo.agregarArista(1, 8, 8);
        grafo.agregarArista(2, 3, 8);
        grafo.agregarArista(2, 8, 11);
        grafo.agregarArista(3, 4, 7);
        grafo.agregarArista(3, 6, 4);
        grafo.agregarArista(3, 9, 2);
        grafo.agregarArista(4, 5, 9);
        grafo.agregarArista(4, 6, 14);
        grafo.agregarArista(5, 6, 10);
        grafo.agregarArista(6, 7, 2);
        grafo.agregarArista(7, 8, 1);
        grafo.agregarArista(7, 9, 6);
        grafo.agregarArista(8, 9, 7);
        
        System.out.println("Grafo:");
        grafo.imprimirGrafo();

        Dijkstra dijkstra = new Dijkstra();
        int[] distancias = dijkstra.ejecutarDijkstra(grafo, 1);

        // Crear un array de objetos que almacenen el índice del vértice y su distancia
        Integer[] verticesDistancias = new Integer[distancias.length - 2]; // Excluir nodos 0 y 1
        int count = 0;
        for (int i = 2; i < distancias.length; i++) { // Comenzar desde el índice 2
            verticesDistancias[count++] = i;
        }

        // Ordenar el array según las distancias
        Arrays.sort(verticesDistancias, (v1, v2) -> Integer.compare(distancias[v1], distancias[v2]));

        System.out.println("\nDistancias minimas desde el vertice 1 (Dijkstra):");
        for (int i : verticesDistancias) {
            System.out.println("Nodo " + i + ": " + distancias[i]);
        }
    }
}
