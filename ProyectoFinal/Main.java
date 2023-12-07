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
        Mapa test = new Mapa(30);
        //Creando Vertices
        test.agregarTienda(0,"D1 San Francisco",7.13690234359114, -73.12474284101859,"Cl. 14 #21-64, Bucaramanga, Santander");
        test.agregarTienda(1,"D1 Quebrada Seca",7.125666513364962, -73.1280011563992,"Av. Quebrada Seca # 27 - 65, Centro, Bucaramanga, Santander");
        test.agregarTienda(2,"D1 Comuna 4 Occidental",7.128221539367881, -73.12559789708668,"Cra. 19 # 23 - 11, Comuna 4 Occidental, Bucaramanga, Santander");
        test.agregarTienda(3,"D1 Antonia Santos",7.128051204744243, -73.11924642604652,"Cl. 32 #26-28, Antonia Santos, Bucaramanga, Santander");
        test.agregarTienda(4,"D1 Campo Hermoso",7.111698786250063, -73.13589757985453,"Cl. 45 # 0-120, Bucaramanga, Santander");
        test.agregarTienda(5,"D1 Parque Romero",7.117490334463149, -73.1283444791581,"Cra. 12 #42-40, García Rovira, Bucaramanga, Santander");
        test.agregarTienda(6,"D1 Bolivar",7.120045406028048, -73.1202763943233,"Cra. 21 #42-2 a 42-60, Bolívar, Bucaramanga, Santander");
        test.agregarTienda(7,"D1 Nuevo Sotomayor",7.121218113240643, -73.11530164277659,"Cra. 27 #48-08, Bucaramanga, Santander");
        test.agregarTienda(8,"D1 Parque Industrial Provincia de Soto",7.086488127372701, -73.13927270541201,"Cl. 70 #1643, Girón, Bucaramanga, Santander");
        test.agregarTienda(9,"D1 Calle 104",7.081499463977145, -73.12456558552407,"Calle 104");
        //Giron
        test.agregarTienda(10,"D1 Rotonda Ecologica Giron",7.07541396208971, -73.17191345909004,"Cl. 43, Girón, Santander");
        test.agregarTienda(11,"D1 Poblado",7.075057137538, -73.16982684696877,"Cra. 26 #40-39, Girón, Santander");
        test.agregarTienda(12,"D1 Giron Casco Antiguo",7.070116836868725, -73.16896854007146,"Cl 31 #2518, Girón, Santander");
        test.agregarTienda(13,"D1 Plaza de Mercado Central Giron",7.066045150713296, -73.16839112375932,"Carrera 23A Cerca de la Plaza de Mercado Central");
        test.agregarTienda(14,"D1 Los Caneyes Girón",7.064013954141033, -73.16849579161729,"Cl. 25 #21b196, Girón, Santander");
        test.agregarTienda(15,"D1 Aldea Alta Giron",7.067991743062864, -73.17574002315365,"Jardines de la aldea, Cl. 35 #32, Girón, Santander");
        test.agregarTienda(16,"D1 Puerto Madero",7.060789227664431, -73.15995561994649,"Cra. 13 #13c-26, Girón, Santander");
        test.agregarTienda(17,"D1 Anillo Vial",7.065759588323641, -73.14619749245858,"45A, Girón, Santander");
        test.agregarTienda(18,"D1 Autopista Florida Blanca",7.092342266056531, -73.10940603731488,"AUT FLORIDA # 86-30, Bucaramanga, Santander");
        test.agregarTienda(19,"D1 Calle 56",7.1112961300812385, -73.1192464855789,"Cl. 56 # 17 B - 36, Bucaramanga, Santander");
        test.agregarTienda(20,"D1 Cabecera del llano",7.114532595340103, -73.10843181867267,"Cra. 35 #5416, Cabecera del llano, Bucaramanga, Santander");
        test.agregarTienda(21,"D1 Parque Romero",7.115935215297062, -73.12854721887815,"Cra. 12 #42-40, García Rovira, Bucaramanga, Santander");
        test.agregarTienda(22,"D1 Bavaria",7.154287312867747, -73.13450574819765,"Cl. 17 Nte. #12-85, Bucaramanga, Santander");
        //Bodegas
        test.agregarBodega(23,"Central de Distribución Santander Tiendas D1",7.064399755467621, -73.15351181001611,"Anillo Vial");
        test.agregarBodega(24,"Centro Abastos",7.105027497363102, -73.16856545348182,"Via Giron, Bucaramanga, Santander");
        //Bodegas Inventadas
        test.agregarBodega(25,"Centro de Distribuicion Real de Minas",7.106907927780776, -73.12183889898195,"Cl. 61 #8 - 78, Bucaramanga, Santander");
        test.agregarBodega(26,"Centro La Flora",7.10971857049189, -73.1076768353708,"La Presentación, Carrera 36 detrás del colegio La Merced y, Bucaramanga, Santander");
        test.agregarBodega(27,"Centro de Distribuicion Los Niños",7.126241395132037, -73.11857733294542,"Cl. 32, Antonia Santos, Bucaramanga, Santander");
        test.agregarBodega(28,"Centro de Distribuicon Parque Giron Central",7.069267683486947, -73.16964952077737,"Cl 31, Casco Antiguo, Girón, Santander");
        test.agregarBodega(29,"Centro de Distribuicion Cristal Alto",7.077444562873143, -73.11817461637523,"Carrera 19A");
        //Creando Aristas ID 23
        test.agregarArista(23,0,1);
        test.agregarArista(23,1,1);
        test.agregarArista(23,2,1);
        test.agregarArista(23,3,1);
        test.agregarArista(23,4,1);
        test.agregarArista(23,5,1);
        test.agregarArista(23,6,1);
        test.agregarArista(23,7,1);
        test.agregarArista(23,8,1);
        test.agregarArista(23,9,1);
        test.agregarArista(23,10,1);
        test.agregarArista(23,11,1);
        test.agregarArista(23,12,1);
        test.agregarArista(23,13,1);
        test.agregarArista(23,14,1);
        test.agregarArista(23,15,1);
        test.agregarArista(23,16,1);
        test.agregarArista(23,17,1);
        test.agregarArista(23,18,1);
        test.agregarArista(23,19,1);
        test.agregarArista(23,20,1);
        test.agregarArista(23,21,1);
        test.agregarArista(23,22,1);
        //Creando Aristas ID 24
        test.agregarArista(24,0,1);
        test.agregarArista(24,1,1);
        test.agregarArista(24,2,1);
        test.agregarArista(24,3,1);
        test.agregarArista(24,4,1);
        test.agregarArista(24,5,1);
        test.agregarArista(24,6,1);
        test.agregarArista(24,7,1);
        test.agregarArista(24,8,1);
        test.agregarArista(24,9,1);
        test.agregarArista(24,10,1);
        test.agregarArista(24,11,1);
        test.agregarArista(24,12,1);
        test.agregarArista(24,13,1);
        test.agregarArista(24,14,1);
        test.agregarArista(24,15,1);
        test.agregarArista(24,16,1);
        test.agregarArista(24,17,1);
        test.agregarArista(24,18,1);
        test.agregarArista(24,19,1);
        test.agregarArista(24,20,1);
        test.agregarArista(24,21,1);
        test.agregarArista(24,22,1);
        //Creando Aristas ID 25
        test.agregarArista(25,0,1);
        test.agregarArista(25,1,1);
        test.agregarArista(25,2,1);
        test.agregarArista(25,3,1);
        test.agregarArista(25,4,1);
        test.agregarArista(25,5,1);
        test.agregarArista(25,6,1);
        test.agregarArista(25,7,1);
        test.agregarArista(25,8,1);
        test.agregarArista(25,9,1);
        test.agregarArista(25,10,1);
        test.agregarArista(25,11,1);
        test.agregarArista(25,12,1);
        test.agregarArista(25,13,1);
        test.agregarArista(25,14,1);
        test.agregarArista(25,15,1);
        test.agregarArista(25,16,1);
        test.agregarArista(25,17,1);
        test.agregarArista(25,18,1);
        test.agregarArista(25,19,1);
        test.agregarArista(25,20,1);
        test.agregarArista(25,21,1);
        test.agregarArista(25,22,1);
        //Creando Aristas ID 26
        test.agregarArista(26,0,1);
        test.agregarArista(26,1,1);
        test.agregarArista(26,2,1);
        test.agregarArista(26,3,1);
        test.agregarArista(26,4,1);
        test.agregarArista(26,5,1);
        test.agregarArista(26,6,1);
        test.agregarArista(26,7,1);
        test.agregarArista(26,8,1);
        test.agregarArista(26,9,1);
        test.agregarArista(26,10,1);
        test.agregarArista(26,11,1);
        test.agregarArista(26,12,1);
        test.agregarArista(26,13,1);
        test.agregarArista(26,14,1);
        test.agregarArista(26,15,1);
        test.agregarArista(26,16,1);
        test.agregarArista(26,17,1);
        test.agregarArista(26,18,1);
        test.agregarArista(26,19,1);
        test.agregarArista(26,20,1);
        test.agregarArista(26,21,1);
        test.agregarArista(26,22,1);
        //Creando Aristas ID 27
        test.agregarArista(27,0,1);
        test.agregarArista(27,1,1);
        test.agregarArista(27,2,1);
        test.agregarArista(27,3,1);
        test.agregarArista(27,4,1);
        test.agregarArista(27,5,1);
        test.agregarArista(27,6,1);
        test.agregarArista(27,7,1);
        test.agregarArista(27,8,1);
        test.agregarArista(27,9,1);
        test.agregarArista(27,10,1);
        test.agregarArista(27,11,1);
        test.agregarArista(27,12,1);
        test.agregarArista(27,13,1);
        test.agregarArista(27,14,1);
        test.agregarArista(27,15,1);
        test.agregarArista(27,16,1);
        test.agregarArista(27,17,1);
        test.agregarArista(27,18,1);
        test.agregarArista(27,19,1);
        test.agregarArista(27,20,1);
        test.agregarArista(27,21,1);
        test.agregarArista(27,22,1);
        //Creando Aristas ID 28
        test.agregarArista(28,0,1);
        test.agregarArista(28,1,1);
        test.agregarArista(28,2,1);
        test.agregarArista(28,3,1);
        test.agregarArista(28,4,1);
        test.agregarArista(28,5,1);
        test.agregarArista(28,6,1);
        test.agregarArista(28,7,1);
        test.agregarArista(28,8,1);
        test.agregarArista(28,9,1);
        test.agregarArista(28,10,1);
        test.agregarArista(28,11,1);
        test.agregarArista(28,12,1);
        test.agregarArista(28,13,1);
        test.agregarArista(28,14,1);
        test.agregarArista(28,15,1);
        test.agregarArista(28,16,1);
        test.agregarArista(28,17,1);
        test.agregarArista(28,18,1);
        test.agregarArista(28,19,1);
        test.agregarArista(28,20,1);
        test.agregarArista(28,21,1);
        test.agregarArista(28,22,1);
        //Creando Aristas ID 29
        test.agregarArista(29,0,1);
        test.agregarArista(29,1,1);
        test.agregarArista(29,2,1);
        test.agregarArista(29,3,1);
        test.agregarArista(29,4,1);
        test.agregarArista(29,5,1);
        test.agregarArista(29,6,1);
        test.agregarArista(29,7,1);
        test.agregarArista(29,8,1);
        test.agregarArista(29,9,1);
        test.agregarArista(29,10,1);
        test.agregarArista(29,11,1);
        test.agregarArista(29,12,1);
        test.agregarArista(29,13,1);
        test.agregarArista(29,14,1);
        test.agregarArista(29,15,1);
        test.agregarArista(29,16,1);
        test.agregarArista(29,17,1);
        test.agregarArista(29,18,1);
        test.agregarArista(29,19,1);
        test.agregarArista(29,20,1);
        test.agregarArista(29,21,1);
        test.agregarArista(29,22,1);


        test.imprimirGrafo();
        System.out.println("--------------------------------Metodo de Dijkstra--------------------------------");
        System.out.println("Peso=1 (No necesita abastecimiento), Peso = 2 (Necesita abastecimiento) ");
        test.imprimirRecorridoDijkstra(test.dijkstra(29),29);
        test.pedidoTienda(1);
        test.pedidoTienda (12);
        test.pedidoTienda (16);
        test.imprimirRecorridoDijkstra(test.dijkstra(29),29 );
        test.aceptarPedido();
        test.imprimirRecorridoDijkstra(test.dijkstra(29),29 );

    }
}
