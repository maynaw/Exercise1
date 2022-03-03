package com.company;

public class DreiHlber {
    public static void main(String[] args) {
        int Zahl=5;
        dreiHalber(Zahl);
    }

    public static void dreiHalber(int Zahl) {
        int result = Zahl % 3;
        if (result == 0) {
            System.out.println("The number is dreihalber");
        } else System.out.println("The mumber is no dreihalber");
    }
}
