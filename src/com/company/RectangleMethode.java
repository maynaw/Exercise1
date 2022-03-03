package com.company;

public class RectangleMethode {
    public static void main(String[] args) {
        // declare variables - not initealized
        int width;
        int length;

// declare & initialize circumference by calling the method that calculates the circumference
        int circumference;
        circumference = calculateCircumference(2, 3);
        // see the result of the above in the console
        System.out.println(circumference   );

        //print out a new calculation with new values
        // without declaring and initializing a variable that saves the new circumference
        System.out.println(calculateCircumference(4, 7));

        // initialize the variable declared on top of the class with values
        width = 9;
        length = 89;
        // calculate the circumference with the variables
        // save the circum
        circumference = calculateCircumference(width, length);
        System.out.println(circumference);

    }
    public static int calculateCircumference (int width, int length){
        int circumference;
        circumference = 2 * (width + length);
        return circumference;
    }
    public static int calculateCircumferenceShort (int width, int length) {
        return 2 * (width + length);
    }

    }
