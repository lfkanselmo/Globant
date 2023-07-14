package Main;

import Services.VehicleService;

/**
 *
 * @author Krausser
 */
public class Main {

    public static void main(String[] args) {
        VehicleService v1 = new VehicleService();
        VehicleService v2 = new VehicleService();
        VehicleService v3 = new VehicleService();

        //Creación de vehiculos
        v1.newVehicle();
        v2.newVehicle();
        v3.newVehicle();

        //avance de vehiculos en 5, 10 y 60 segundos
        showAvance(v1);
        showAvance(v2);
        showAvance(v3);

        //distancia recorrida al moverse 5 minutos y luego frenar
        int t = 60 * 5;
        furthest(v1, v2, v3, t);

    }

    //Metodo para mostrar el avance dependiendo del tiempo
    public static void showAvance(VehicleService v) {
        System.out.println();
        System.out.println("El vehiculo tipo " + v.getType() + " avanzó " + v.move(5) + " metros en " + 5 + " segundos");
        System.out.println("El vehiculo tipo " + v.getType() + " avanzó " + v.move(10) + " metros en " + 10 + " segundos");
        System.out.println("El vehiculo tipo " + v.getType() + " avanzó " + v.move(60) + " metros en " + 60 + " segundos");
        System.out.println();
    }

    //Metodo para mostrar el que más avanzó
    public static void furthest(VehicleService v1, VehicleService v2, VehicleService v3, int t) {
        int d1 = v1.totalDistance(t);
        int d2 = v2.totalDistance(t);
        int d3 = v3.totalDistance(t);

        //comprobar cuál es la mayor distancia
        if (d2 > d1 && d2 > d3) {
            System.out.println("El vehiculo que llegó más lejos fue: ");
            System.out.println(v2.getVehicle().toString());
            System.out.println("Y recorrió " + d2 + " metros");
        } else if (d3 > d1 && d3 > d2) {
            System.out.println("El vehiculo que llegó más lejos fue: ");
            System.out.println(v3.getVehicle().toString());
            System.out.println("Y recorrió " + d3 + " metros");
        } else {
            System.out.println("El vehiculo que llegó más lejos fue: ");
            System.out.println(v1.getVehicle().toString());
            System.out.println("Y recorrió " + d1 + " metros");
        }
    }
}
