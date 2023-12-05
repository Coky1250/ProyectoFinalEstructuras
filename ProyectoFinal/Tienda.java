package ProyectoFinal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Tienda extends Nodo{

    public Tienda(int id, String storeName, double lt,double ln) {
     super(id, storeName,lt,ln);
    }
    public void hacerPedido() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su pedido:");
        String pedido = scanner.nextLine();

        String nombreArchivo = "historial_pedidos_tienda_" + this.id + ".txt"; // Nombre del archivo

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            writer.write("Pedido realizado en " + this.name + ": " + pedido);
            writer.newLine();
            System.out.println("Pedido realizado con éxito. Se ha guardado en el historial.");
        } catch (IOException e) {
            System.out.println("Error al guardar el pedido: " + e.getMessage());
        }
    }

}
