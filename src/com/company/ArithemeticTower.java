package com.company;

public class ArithemeticTower {
    public static void main(String[] args) {
        int statvalue = 2;

        makeTower(statvalue);
    }

    public static void makeTower(int statvalue) {
        for (int i = 2; i < 10; i++) {
            System.out.println(statvalue + " * " + i);
            statvalue = statvalue * i;
        }
        for (int i = 2; i < 10; i++) {
            System.out.println(statvalue + " / " + i);
            statvalue = statvalue / i;
        }
    }
}