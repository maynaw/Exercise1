package com.company;

public class Discount  {
    public static void main(String[] args) {
        //On the bus you receive a discount if you are a senior citizen, a dog or a student.
        boolean isSenior = true;
        boolean isDog = false;
        boolean isStudent = false;
        System.out.println("On this bus you get a discount: " + (isSenior || isDog || isStudent));

        //In a bookshop you receive a discount if you buy more than 2 non-fiction books and at least one fiction book.
        int nonFiction = 3;
        int fiction = 2;
        System.out.println("On this bookshop I get a discount: " + (nonFiction >= 2 && fiction >0));

        //In a grocery shop you get a discount if you buy one drink, but only if it is not alcoholic.
        int alkoholic = 1;
        int nonAlkoholic = 3;
        int drink = 3;
        System.out.println("For thise grocery haul you get a discount: " + (drink !=1) );

    }
}
