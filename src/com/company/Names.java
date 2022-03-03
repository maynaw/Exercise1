package com.company;

public class Names {
    public static void main(String[] args) {

        String firstname = "Jane";
        String lastname = "Doe";
        System.out.println(" The full name is " + firstname + " " + lastname);

        //gleich Übungen aber mit methode
         firstname = "Jane";
        lastname = "Doe";

        System.out.println(" The full name is " + firstname + " " + lastname);
        System.out.println("methode:" + makeFullName (firstname, lastname));
        System.out.println(makeFullName("Grace", "Hopper"));

    }
    public static String makeFullName (String firstname, String lastname) {
        return firstname + " " + lastname;
    }
}
