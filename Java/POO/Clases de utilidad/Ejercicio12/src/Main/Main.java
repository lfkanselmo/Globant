/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Services.PersonService;
import java.util.Date;

/**
 *
 * @author Krausser
 */
public class Main {
    public static void main(String[] args) {
        PersonService person = new PersonService();
        
        //crear persona
        person.newPerson();
       
        //mostrar persona
        person.showPerson();
        
        Date newDate = new Date(1942, 11, 4);
        System.out.println("¿es mayor la fecha de nacimiento a la ingresada?: " + person.smaller(newDate));
        
    }
    
}
