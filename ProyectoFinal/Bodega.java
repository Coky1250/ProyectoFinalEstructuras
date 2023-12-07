package ProyectoFinal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Bodega extends Nodo{

    public Bodega(int id, String storageName,double lt,double ln, String address){

        super(id, storageName,lt,ln, address);

    }
    public void aceptarPedido(int idstore, String storeName,String pedido){

        String nombreArchivo = "historial_pedidos_aceptados_bodega_" + this.id + ".txt"; // Nombre del archivo

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            writer.write("Pedido aceptado en la fecha " + LocalDate.now() + " a la tienda "+storeName+" con #id "+idstore+" :\n"+pedido);
            writer.newLine();
            System.out.println("Pedido aceptado con éxito. Se ha guardado en el historial.");
        } catch (IOException e) {
            System.out.println("Error al guardar el pedido: " + e.getMessage());
        }

    }
}
