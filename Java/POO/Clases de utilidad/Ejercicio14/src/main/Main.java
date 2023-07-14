package main;

import services.PhoneService;

/**
 *
 * @author Krausser
 */
public class Main {

    public static void main(String[] args) {
        PhoneService phone1 = new PhoneService();

        phone1.newPhone();

        System.out.println(phone1.getPhone().toString());
    }

}
