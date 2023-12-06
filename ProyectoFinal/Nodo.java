package ProyectoFinal;

public class Nodo {
 protected int id;
 protected String name;
 protected String address;
 protected double latitude;
 protected double longitude;
    Nodo(int id, String name, double latitude, double longitude, String address) {
     this.id = id;
     this.name = name;
     this.latitude = latitude;
     this.longitude = longitude;
     this.address = address;
    }
}
