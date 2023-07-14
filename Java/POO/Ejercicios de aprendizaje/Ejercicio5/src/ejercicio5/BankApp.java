package ejercicio5;

import Entities.Account;
import Services.ServiceAccount;

/**
 *
 * @author Krausser
 */
public class BankApp {

    public static void main(String[] args) {
        ServiceAccount sa = new ServiceAccount();
        Account a = sa.newAccount();

        //Agregar dinero
        sa.getMoney(a, 20000);

        //retirar dinero
        sa.withdraw(a, 100);

        //Extracción rápida
        sa.quickWithdraw(a);

        //Consulta de saldo
        sa.showBalance(a);

        //Consulta de datos
        sa.showAccountData(a);

    }

}
