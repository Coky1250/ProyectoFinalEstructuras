package ProyectoFinal;

import java.io.*;
import java.util.Scanner;
import java.time.LocalDate;

public class Tienda extends Nodo {

    public Tienda(int id, String storeName, double lt, double ln, String address) {
        super(id, storeName, lt, ln, address);
    }

    public void hacerPedido() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su pedido:");
        String pedido = scanner.nextLine();

        String nombreArchivo = "historial_pedidos_pendientes_tienda_" + this.id + ".txt"; // Nombre del archivo

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            writer.write("Pedido realizado en la fecha " + LocalDate.now() + ": " + pedido);
            writer.newLine();
            System.out.println("Pedido realizado con éxito. Se ha guardado en el historial.");
        } catch (IOException e) {
            System.out.println("Error al guardar el pedido: " + e.getMessage());
        }
    }

    public void mostrarHistorialPendientes() {
        String nombreArchivo = "historial_pedidos_pendientes_tienda_" + this.id + ".txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            System.out.println("Historial de pedidos pendientes de la tienda " + this.name + ":");
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public void mostrarHistorial() {
        String nombreArchivo = "historial_pedidos_tienda_" + this.id + ".txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            System.out.println("Historial de pedidos de la tienda " + this.name + ":");
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public void moverPendientestoHistorial() {
        String nombreArchivoOrigen = "historial_pedidos_pendientes_tienda_" + this.id + ".txt";
        String nombreArchivoDestino = "historial_pedidos_tienda_" + this.id + ".txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivoOrigen));
             BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivoDestino))) {

            String linea;
            while ((linea = reader.readLine()) != null) {
                // Escribir la línea en el archivo de destino
                writer.write(linea);
                writer.newLine(); // Agregar un salto de línea para separar las líneas en el archivo de destino
            }

            System.out.println("Contenido copiado exitosamente de " + nombreArchivoOrigen + " a " + nombreArchivoDestino);

            // Borrar el contenido del archivo original
            PrintWriter pw = new PrintWriter(nombreArchivoOrigen);
            pw.close();

            System.out.println("Contenido borrado del archivo " + nombreArchivoOrigen);
        } catch (IOException e) {
            System.out.println("Hubo un error al mover y borrar el contenido: " + e.getMessage());
        }
    }
    public String getPendientes(){
        String nombreArchivo = "historial_pedidos_pendientes_tienda_" + this.id + ".txt";
        StringBuilder contenido = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                contenido.append(linea).append("\n"); // Agrega la línea al contenido con un salto de línea
            }
            return contenido.toString(); // Devuelve el contenido como una cadena String
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}


