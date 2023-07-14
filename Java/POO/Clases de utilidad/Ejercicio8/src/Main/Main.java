package Main;

import Entities.Cadena;
import Services.CadenaService;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        //creación objeto de servicio cadena
        CadenaService sentence = new CadenaService();
        System.out.println("Ingresa frase: ");
        sentence.newCadena(read.nextLine());

        System.out.println("La cantidad de vocales: " + sentence.showVocals());
        System.out.println("");
        System.out.println("Frase invertida:");
        sentence.invert();
        System.out.println("");
        sentence.repeatedTime("a");
        System.out.println("");
        System.out.println("Ingrese segunda frase: ");
        String sentence2 = read.nextLine();
        System.out.println("¿Tienen misma longitud?: " + sentence.lengthCompare(sentence2));
        System.out.println("Frases unidas:");
        sentence.addSentence(sentence2);
        System.out.println("");
        System.out.println("Ingrese caracter para reemplazar");
        sentence.replace(read.next());
        System.out.println("");
        System.out.println(sentence.getCadena().getSentence());
        System.out.println("");
        System.out.println("Ingrese caracter a buscar en la frase: ");
        String letter = read.next();
        System.out.println("¿La frase contiene el caracter?:" + sentence.contain(letter));

    }

}
