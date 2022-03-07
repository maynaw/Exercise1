package com.company;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] schachtel = new int[]{3, 5, 7, 11, 13, 17,};

        printArray(schachtel);
        containsNumber(3, schachtel);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static boolean containsNumber(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (number == number) {
                return true;
            } else {
                return false;
            }

        }
        return false;
    }
}