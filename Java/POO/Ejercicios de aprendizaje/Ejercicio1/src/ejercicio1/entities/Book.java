
package ejercicio1.entities;

/**
 *
 * @author Krausser
 */
public class Book {
    private int sibn;
    private String title;
    private String autor;
    private int pages;

    public Book() {
    }

    public Book(int sibn, String title, String autor, int pages) {
        this.sibn = sibn;
        this.title = title;
        this.autor = autor;
        this.pages = pages;
    }

    public int getSibn() {
        return sibn;
    }

    public void setSibn(int sibn) {
        this.sibn = sibn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" + "sibn=" + sibn + ", title=" + title + ", autor=" + autor + ", pages=" + pages + '}';
    }
    
    
}
