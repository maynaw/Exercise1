package com.company;

import java.util.Scanner;

public class JavaUtilScanner {
    public static void main(String[] args) {

        Scanner sonstWie = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number = sonstWie.nextInt();
        int sum = 0;

        while (number > 0) {
            if (number == 2) {
                sum = sum * 2;
                System.out.println("Double Bonus!");
                System.out.println("Enter another number");
                number = sonstWie.nextInt();

                    }else if (number == 3){
                sum = sum *3;
                System.out.println("Tripple Bonus!");
                System.out.println("Enter another number:");
            }else if (number == 22){
                sum = sum / 2;
                System.out.println("Sum halved :( ");
                number = sonstWie.nextInt();
            }else {
                // sum = sum + number
                sum += number;
                System.out.println("Ener anothe number: ");
                number = sonstWie.nextInt();

            }

        }
        System.out.println("Your total sum is: " + sum);
        sonstWie.close();
    }
}
