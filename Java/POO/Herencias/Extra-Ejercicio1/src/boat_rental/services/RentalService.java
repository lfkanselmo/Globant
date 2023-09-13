/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boat_rental.services;

import boat_rental.models.Boat;
import boat_rental.models.LuxuryYacht;
import boat_rental.models.Rental;
import boat_rental.models.Sailboat;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class RentalService {

    private Rental rental;
    Scanner read = new Scanner(System.in);
    static boolean exit;

    public void menu() {
        exit = true;
        System.out.println("****** CHOOSE YOUR BOAT ******");
        
        Boat boat;

        do {
            System.out.println("1. Normal boat");
            System.out.println("----- ESPECIAL BOATS -----");
            System.out.println("2. Sailboats");
            System.out.println("3. Luxury Yacht");
            String opc = read.next();
            
            switch (opc) {
                case "1":
                    boat = createBoat("boat");
                    rental = createRental(boat);
                    exit = false;
                    break;

                case "2":
                    boat = createBoat("sailboat");
                    rental = createRental(boat);
                    exit = false;
                    break;

                case "3":
                    boat = createBoat("yacht");
                    rental = createRental(boat);
                    exit = false;
                    break;

                default:
                    System.out.println("Option incorrect, try again");
                    exit = true;
                    break;
            }
        } while (exit);

    }
    
    //to create boats
    private Boat createBoat(String type){
        Boat boat;
        
        System.out.println("Insert registration number");
        String regis = read.next();
        System.out.println("Insert eslora");
        Integer eslo = read.nextInt();
        System.out.println("Insert year of fabricatión");
        Integer year = read.nextInt();
        
        if (type.equals("boat")) {
            boat = new Boat(regis, eslo, year);
        } else if(type.equals("sailboat")){
            System.out.println("Insert how many masts the sailboat has");
            Integer masts = read.nextInt();
            System.out.println("Insert CV of the sailboat");
            Double cv = read.nextDouble();
            boat = new Sailboat(masts,cv,regis,eslo,year);
        }else{
            System.out.println("Insert how many masts the yacht has");
            Integer masts = read.nextInt();
            System.out.println("Insert CV of the yacht");
            Double cv = read.nextDouble();
            System.out.println("Insert how many cabins the yacht has");
            Integer cabins = read.nextInt();
            boat = new LuxuryYacht(cabins, masts, cv, regis, eslo, year);
        }
        
        
        return boat;
    }

    private Rental createRental(Boat boat) {
        Rental rental;
        
        System.out.println("Enter the client's name");
        String name = read.nextLine();
        System.out.println("Enter the client's ID");
        String id = read.nextLine();
        System.out.println("Enter the date of rental with format: yyyy, MM, dd");
        String dateRn = read.nextLine();
        
        
        
        
        
        
        return rental;
        
    }
}
