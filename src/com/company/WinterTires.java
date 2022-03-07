package com.company;

public class WinterTires {
    public static void main(String[] args) {
        int temperature = 10;
        boolean slipperyRoad = false;
        boolean winterTire = needWinterTires( temperature, slipperyRoad);

    }

    public static boolean needWinterTires(int temperature, boolean slipperyRoad) {
        boolean winterTire;
        if (temperature < 10 || slipperyRoad == true) {
             winterTire = true;
            System.out.println("Winter Tires should be used");
        } else if (temperature < 4) {
             winterTire = true;
            System.out.println("Winter Tires should be used");
        } else {
             winterTire = false;
            System.out.println("Winter Tires should not be used");
        }
        return winterTire;
    }


    }