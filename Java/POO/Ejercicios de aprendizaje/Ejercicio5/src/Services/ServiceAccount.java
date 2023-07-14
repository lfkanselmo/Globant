package Services;

import Entities.Account;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class ServiceAccount {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    //Constructores
    public ServiceAccount() {
    }

    //Metodo para crear una nueva cuenta pidiendo los valores
    public Account newAccount() {
        System.out.println("Ingrese el DNI del cliente: ");
        int dni = read.nextInt();
        System.out.println("");

        System.out.println("Ingrese el saldo inicial: ");
        double balance = read.nextDouble();
        System.out.println("");

        System.out.println("Ingrese el número de cuenta: ");
        int accountNumber = read.nextInt();
        System.out.println("");

        System.out.println("Ingrese el interés: ");
        double interest = read.nextDouble();
        System.out.println("");

        return new Account(accountNumber, dni, balance, interest);
    }

    //Metodo para ingresar dinero al saldo
    public void getMoney(Account ac, double money) {
        double balance = ac.getBalance();
        ac.setBalance(balance + money);
    }

    //Metodo para retirar dinero del saldo
    public void withdraw(Account ac, double money) {
        double balance = ac.getBalance();

        //comprobar el dinero disponible
        if (balance < money) {
            System.out.println("Dinero en cuenta insuficiente. Disponible en cuenta: $" + balance);
            ac.setBalance(0);
        } else {
            ac.setBalance(balance - money);
        }
    }

    //Metodo para extracción rápida, permite retirar el 20% de lo que hay en el saldo
    public void quickWithdraw(Account ac) {
        double balance = ac.getBalance();
        if (balance != 0) {
            double twentyPorcent = balance * 0.2;
            ac.setBalance(balance - twentyPorcent);
            System.out.println("Valor del retiro: $" + twentyPorcent);
        } else {
            System.out.println("Saldo insuficiente. Disponible en cuenta: $" + balance);
        }
    }

    //Metodo consultar saldo
    public void showBalance(Account ac) {
        System.out.println("El saldo disponible es: $" + ac.getBalance());
    }

    //Metodo consultar datos
    public void showAccountData(Account ac) {
        System.out.println("DNI: " + ac.getDni());
        System.out.println("Número cuenta: " + ac.getAccountNumber());
    }
}
