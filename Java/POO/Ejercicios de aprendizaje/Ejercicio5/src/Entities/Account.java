package Entities;

/**
 *
 * @author Krausser
 */
public class Account {

    private int accountNumber;
    private long dni;
    private double balance;
    private double interest;

    //Constructores
    public Account() {
    }

    public Account(int accountNumber, long dni, double balance, double interest) {
        this.accountNumber = accountNumber;
        this.dni = dni;
        this.balance = balance;
        this.interest = interest;
    }

    //Setter & Getter
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int AccountNumber) {
        this.accountNumber = AccountNumber;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

}
