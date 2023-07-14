
package Main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        int day = 10, month = 9, year = 1992 - 1900;
        Date today = new Date();
        Date date = new Date(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        
        
        int yeatDiference = today.getYear() - date.getYear();
        System.out.println(sdf.format(today));
        System.out.println(sdf.format(date));
        System.out.println("Hay " + yeatDiference  + " años de diferencia entre ambas fechas");
        
    }
    
}
