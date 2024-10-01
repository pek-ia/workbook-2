package com.pluralsight.logic;

public class LogicExamples {

    public static void main(String[] args) {
        System.out.println("Hello");

        double area = 10 / 3;           //  integer division
        double remainder = 10.0 % 3.0;  //  floating point modulo (remainder)

        area = (double) 10 / 3;         //  fp division

        System.out.println( area );
        System.out.println( remainder );

        // Arithmetic operators
        //  +  -  /  *  %
        // Increment/decrement operators - PREFIX and POSTFIX versions
        //  ++  --

        area = area + 1;
        System.out.println(area);  // what value prints here?

        area ++;    // postfix increment
        System.out.println(area);

        System.out.println(++ area);  // what value prints here?

        System.out.println(++ area + area ++ + remainder ++);  // what value prints here?

        System.out.println(area);       // what value prints here?
        System.out.println(remainder);  // what value prints here?

        float x = (float) remainder;
        System.out.println(x);   // what value prints here?

        float y = 7.99f;
        System.out.println(y);  // what value prints here?

        double z = 8.33f;
        System.out.println(z);  // what value prints here?

        System.out.printf("%.2f\n", z);
        System.out.println(z);  // what value prints here?

    }
}
