package com.company;

import javax.print.DocFlavor;

public class Rectangle {
    public static void main(String[] args) {
        int width = 3;
        int length = 4;
        int circumference;
        int area;
        System.out.println("circumference =" + (width+length)*2  );
        System.out.println("area =" + width*length);

        //gleich Übungen aber mit methode

        circumference = calculateCircumference( 2, 3);
        System.out.println(circumference);
        System.out.println(calculateCircumference( 4, 7));

        width = 9;
        length = 89;
        circumference = calculateCircumference(width, length);
        System.out.println(circumference);
    }
public static int calculateCircumference ( int width, int length){
        int circumference;
        circumference = 2*(width+length);
        return circumference;
}
public static int calculateCircumferenceShort (int width, int length){
        return 2*(width + length);
}
}
