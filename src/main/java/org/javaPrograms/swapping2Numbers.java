package org.javaPrograms;

public class swapping2Numbers {
    public static void main(String[] args) {
        int a = 10, b = 40;

        System.out.println("Before swapping values are:- " + a + " " + b);

        //Logic 1 - Using Third Variable
        /*

        int v = a;
        a=b;
        b=v;

        */

        //Logic 2 - use + & - without using third variable
        /*
        a = a + b; //10+30 = 40
        b = a - b; //40-30 = 10
        a = a - b; //40-10 = 30

        */

        // Logic 3 - Use * and / without using third variable
        // Here a & b values should not be zero

        /*

        a = a * b; //10*40 = 400
        b = a / b; //400/10 = 10
        a = a / b; //400/40 = 40

        */

        //Logic 4 - Single Statement
        //a=10 b=20

        b=a+b-(a=b);

        System.out.println("After swapping values are:- " + a + " " + b);
    }
}
