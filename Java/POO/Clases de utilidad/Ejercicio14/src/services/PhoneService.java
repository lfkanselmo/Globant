package services;

import entities.Phone;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class PhoneService {
    
    private Phone phone = new Phone();
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public Phone getPhone() {
        return phone;
    }
    
    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    //Metodo para crear nuevo teléfono
    public void newPhone() {
        boolean pass = true;

        //ingreso de la marca
        System.out.println("Ingrese la marca del teléfono");
        phone.setMarca(read.nextLine());

        //ingreso del modelo
        System.out.println("Ingrese el modelo");
        phone.setModelo(read.nextLine());

        //ingreso de precio
        System.out.println("Ingrese el precio del teléfono");
        do {
            phone.setPrecio(read.nextDouble());
            pass = validation(phone.getPrecio());
            
        } while (pass == false);

        //ingreso de cantidad de memoria ram
        System.out.println("Ingrese la cantidad de memoria RAM");
        do {
            phone.setRam(read.nextInt());
            pass = validation((double) (phone.getRam()));
        } while (pass == false);

        //Ingreso del almacenamiento
        System.out.println("Ingrese la cantidad de almacenamiento");
        do {
            phone.setAlmacenamiento(read.nextInt());
            pass = validation(phone.getAlmacenamiento());
        } while (pass == false);

        //Ingrese el codigo
        System.out.println("Ingrese el codigo");
        addCode(phone.getCodigo());
        
    }

    //Metodo para comprobar cantidades positivas
    public boolean validation(double number) {
        if (number > 0) {
            return true;
        } else {
            System.out.println("Valor ingresado no valido. Intente de nuevo");
            return false;
        }
    }

    //Metodo para ingresar el codigo de un telefono
    public void addCode(int[] codigo) {
        int dig;
        for (int i = 0; i < codigo.length; i++) {
            System.out.println("Ingrese posición " + (i + 1) + " del codigo: ");
            dig = read.nextInt();
            if (dig < 0 || dig > 9) {
                System.out.println("Digito no válido, debe ser un número de 1-9. Intente de nuevo");
                i--;
            }
        }
    }
    
}
