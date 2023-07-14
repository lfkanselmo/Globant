
import Services.CursoServicio;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        CursoServicio cs = new CursoServicio();
        System.out.println("Ingrese la cantida de cursos profe: ");
        cs.cursosProfe(leer.nextInt());
        System.out.println();
        
        
    }
    
    
}
