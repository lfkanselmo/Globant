/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Cadena;

/**
 *
 * @author Krausser
 */
public class CadenaService {
    
    Cadena cadena = new Cadena();

    public Cadena getCadena() {
        return cadena;
    }
    
    
    
    //metodo para crear cadena
    public void newCadena(String sentence){
        cadena.setSentence(sentence);
    }
    //Metodo para mostrar la cantidad de vocales
    public int showVocals() {

        int counter = 0;

        //Recorrer la cadena para verificar si es vocal
        for (int i = 0; i < cadena.getSentence().length(); i++) {

            //Aumentar contador si es vocal
            switch (cadena.getSentence().substring(i, i + 1).toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
                    break;
                default:
                    break;
            }
        }

        return counter;
    }

    //Metodo para invertir la cadena
    public void invert() {
        String newSentence = "";

        //Agregar los caracteres de la cadena desde el último hasta el primero en una nueva cadena
        for (int i = cadena.getSentence().length() - 1; i >= 0; i--) {
            newSentence = newSentence.concat(cadena.getSentence().substring(i, i + 1));
        }

        System.out.println(newSentence);
    }

    //Metodo para ver cuántas veces se repite un caracter
    public void repeatedTime(String letter) {
        int counter = 0;

        //Contar cuántas veces está el caracter en la cadena
        for (int i = 0; i < cadena.getSentence().length(); i++) {
            if (cadena.getSentence().substring(i, i + 1).equals(letter)) {
                counter++;
            }
        }
        System.out.println("El caracter " + letter + " se repite " + counter + " veces.");
    }

    //Metodo para comparar longitudes de cadenas
    public boolean lengthCompare(String sentence) {
        return cadena.getLonger() == sentence.length();
    }

    //Metodo para unir frases
    public void addSentence(String sentence) {
        String newSentence = "";
        newSentence = this.cadena.getSentence().concat(sentence);
        System.out.println(newSentence);
    }

    //Metodo para reemplazar la letra "A" con valor ingresado por el usuario
    public void replace(String letter) {
        String newSentence = "";
        for (int i = 0; i < cadena.getSentence().length(); i++) {

            //Evaluar el cambio de letra
            switch (cadena.getSentence().substring(i, i + 1).toLowerCase()) {
                case "a":
                    newSentence = newSentence.concat(letter);
                    break;
                default:
                    newSentence = newSentence.concat(cadena.getSentence().substring(i, i + 1));
                    break;
            }
        }

        cadena.setSentence(newSentence);
    }

    //Metodo para comprobar si la frase contiene un caracter
    public boolean contain(String letter) {
        for (int i = 0; i < cadena.getSentence().length(); i++) {
            if (cadena.getSentence().substring(i, i + 1).equals(letter)) {
                return true;
            }
        }
        return false;
    }
}
