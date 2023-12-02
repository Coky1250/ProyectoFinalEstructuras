/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal;

/**
 *
 * @author Nicolás
 */
public class Grafo_Matriz_Adyacencia {
    public int V; // número de vértices
    public int A; // número de aristas
    public int[][] matrizAdyacencia;

    public Grafo_Matriz_Adyacencia(int nodos) {
        this.V = nodos;
        this.A = 0;
        this.matrizAdyacencia = new int[nodos][nodos];
    }

    public void agregarArista(int u, int v, int peso) {
        matrizAdyacencia[u][v] = peso;
        matrizAdyacencia[v][u] = peso; // no dirigido
        A++;
    }
    
    public void imprimirGrafo() {
        for (int v = 1; v < V; v++) {
            System.out.print("Fila " + v + ": ");
            for (int w = 1; w < V; w++) {
                System.out.print(matrizAdyacencia[v][w] + " ");
            }
            System.out.println("");
        }
    }
    
}