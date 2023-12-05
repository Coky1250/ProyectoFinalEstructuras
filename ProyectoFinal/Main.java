/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal;
/**
 *
 * @author J
 */
public class Main {
    public static void main(String[] args) {
        Mapa test = new Mapa(3);
        //Creando Vertices
        test.agregarTienda(0,"D1 San Alonso",1,2);
        test.agregarTienda(1,"D1 San Francisco",1,2);
        test.agregarBodega(2,"Bodega el mas barato",1,2);
        //Creando Aristas
        test.agregarArista(2,1,1);
        test.agregarArista(2,0,1);

        test.imprimirGrafo();
        System.out.println("--------------------------------Metodo de Dijkstra--------------------------------");
        System.out.println("Peso=1 (No necesita abastecimiento), Peso = 2 (Necesita abastecimiento) ");
        test.imprimirRecorridoDijkstra(test.dijkstra(2),2);
        test.pedidoTienda(1);
        test.imprimirRecorridoDijkstra(test.dijkstra(2),2 );

    }
}
