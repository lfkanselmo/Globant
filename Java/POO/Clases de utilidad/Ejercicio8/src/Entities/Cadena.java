package Entities;

/**
 *
 * @author Krausser
 */
public class Cadena {

    private String sentence;
    private int longer;

    public Cadena() {
    }

    public Cadena(String sentence) {
        this.sentence = sentence;
        this.longer = sentence.length();
    }

    public String getSentence() {
        return sentence;
    }

    public int getLonger() {
        return longer;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
        this.longer = sentence.length();
    }

    @Override
    public String toString() {
        return "Cadena{" + "sentence=" + sentence + ", longer=" + longer + '}';
    }

    

}
