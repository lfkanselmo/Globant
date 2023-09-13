/*
 */
package boat_rental.models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Krausser
 */
public class Boat {
    private String registration;
    private Integer eslora;
    private Integer yearFabric;

    public Boat() {
    }
    
    

    public Boat(String registration, Integer eslora, Integer yearFabric) {
        this.registration = registration;
        this.eslora = eslora;
        this.yearFabric = yearFabric;
    }
    
    

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getYearFabric() {
        return yearFabric;
    }

    public void setYearFabric(Integer yearFabric) {
        this.yearFabric = yearFabric;
    }
    
    //Calculate price rent
    public Double calc(LocalDate init, LocalDate finish){        
        long days = ChronoUnit.DAYS.between(init, finish);
        Integer mod = getEslora() * 10;
        return (double) days * (double) mod;              
    }
    
            
}
