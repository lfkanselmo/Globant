package Services;

import Entities.Vehicle;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class VehicleService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Vehicle vehicle = new Vehicle();
    private String type;
    
    //Getter && Setter

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getType() {
        return type;
    }
    

    //Metodo para crear el vehiculo
    public void newVehicle() {

        //solicitar tipo
        boolean correctType = true;
        do {
            System.out.println("Ingrese el tipo de vehiculo");
            System.out.println("car");
            System.out.println("bicycle");
            System.out.println("moto");
            String typeV = read.nextLine().toLowerCase();
            System.out.println();

            //Comprobación tipo correcto
            if (typeV.equals("car") || typeV.equals("moto") || typeV.equals("bicycle")) {
                vehicle.setType(typeV);
                correctType = true;
            } else {
                System.out.println("Tipo ingresado invalido. Intente de nuevo");
                System.out.println();
                correctType = false;
            }

        } while (correctType == false);
        type = vehicle.getType();

        //solicitar marca
        System.out.println("Ingrese la marca");
        vehicle.setBrand(read.nextLine());
        System.out.println();

        //solicitar modelo
        System.out.println("Ingrese el modelo");
        vehicle.setModel(read.nextLine());
        System.out.println();

        //soliciar año
        System.out.println("Ingrese el año");
        vehicle.setYear(read.nextInt());
        System.out.println();

    }

    //Metodo para moverse, retorna distancia recorrida según el tiempo
    public int move(int seconds) {

        switch (type) {
            case "car":
                return seconds * 3;
            case "moto":
                return seconds * 2;
            case "bicycle":
                return seconds * 1;
        }

        return 0;

    }

    //Metodo para frenar, devuelde distancia después de frenar según el tipo de vehiculo
    public int brake() {

        switch (type) {
            case "car":
                return 2;
            case "moto":
                return 2;
            case "bicycle":
                return 0;
        }

        return 0;
    }
    
    //metodo para calcular la distancia final recorrida
    public int totalDistance(int seconds){
        return move(seconds) + brake();
    }
}
