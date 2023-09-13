/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boat_rental.models;

import java.time.LocalDate;

/**
 *
 * @author Krausser
 */
public class Rental {
    private String nameClient;
    private String idClient;
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private Boat boat;
    private Integer dock;
    private Double priceRent;

    public Rental(String nameClient, String idClient, LocalDate rentalDate, LocalDate returnDate, Boat boat, Integer dock) {
        this.nameClient = nameClient;
        this.idClient = idClient;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.boat = boat;
        this.dock = dock;
        this.priceRent = boat.calc(rentalDate, returnDate);
    }   
}
