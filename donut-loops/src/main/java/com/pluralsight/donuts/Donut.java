package com.pluralsight.donuts;

public class Donut {
    private String description;
    private int calories;
    private double price;

    public Donut(String description, int calories, double price) {
        this.description = description;
        this.calories = calories;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(description);
        sb.append(" has ").append(calories).append(" calories");
        return sb.toString();
    }
}
