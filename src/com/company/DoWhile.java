package com.company;

public class DoWhile {

    public static void main(String[] args) {
        // write your code here
        countToAHundred(1);

    }

    public static void countToAHundred(int from) {
        do {
            System.out.println(from);
            from++;
        } while (from < 100);
    }
    public static void countToAHundredInclusive(int from) {
        do {
            System.out.println(from);
            from++;
        } while (from < 100);
    }
}
