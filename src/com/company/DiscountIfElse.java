package com.company;

public class DiscountIfElse {
    public static void main(String[] args) {
        //On the bus you receive a dischount if you are a ssenior citizen, adog or astudent.
        boolean isDog = false;
        boolean isSenior = true;
        boolean isStudent = true;
        double ticketPrice = 2.5;
        double discount = getBusDiscount(ticketPrice, isDog, isSenior, isStudent);

        System.out.println("I save:" + discount + "€ for my " + ticketPrice + "€ ticket.");
    }

    public static double getBusDiscount (double ticketPrice, boolean isDog, boolean isSenior, boolean isStudent){
      double discount;
        if (isDog) {
            discount = ticketPrice * 0.2;
        } else if (isSenior) {
            discount = ticketPrice * 0.15;
        } else if (isStudent) {
            discount = ticketPrice * 0.1;
        } else {
            discount = 0;
        }
        return discount;
    }
}