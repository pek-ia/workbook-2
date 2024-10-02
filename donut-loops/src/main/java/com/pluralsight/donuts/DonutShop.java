package com.pluralsight.donuts;

public class DonutShop {
    public static void main(String[] args) {

        Donut d = new Donut("Big Fluffy Donut with a cherry on top", 499, 3.99);
        Donut d2 = new Donut("Chocolate cake donut", 399, 1.99);

        System.out.println(d);
        printDonut(d);
        printDonutAsCSV(d);

        //printDonut(d2);

    }

    public static void printDonut(Donut d){
        System.out.println(d.getDescription());
        System.out.printf("  which costs $%.2f\n", d.getPrice());
    }

    public static void printDonutAsCSV(Donut d){
        System.out.print(d.getDescription());
        System.out.print(",");
        System.out.print(d.getCalories());
        System.out.print(",");
        System.out.println(d.getPrice());
    }
}
