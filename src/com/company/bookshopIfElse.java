package com.company;

public class bookshopIfElse {
    public static void main(String[] args) {

        //In a bookshop you receive a discount if you buy more than 2 non-fiction books and at least one fiction book.
        int fiction = 3;
        int nonFiction = 2;
        boolean discount = getBookDiscount(fiction, nonFiction);
        System.out.println("do I get discount " + discount);
    }

    public static boolean getBookDiscount(int fiction, int nonFiction) {
        boolean discount;
        if (nonFiction > 2 && fiction >= 1) {
            discount = true;
        } else {
            discount = false;
        }
        return discount;
    }
}

