package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    /**
     * main is the method that requests the user's name
     * @param args
     */
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Scanner scanner = new Scanner(System.in);

        String message = "Yikes Stripes!";
        System.out.println(message);

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 0; i < message.length() ; i++) {
            System.out.println( message.charAt(i) );
        }

        for (int i = message.length() - 1; i >=0 ; i--) {
            System.out.println( message.charAt(i) );
        }

        String first = getStringInput(scanner, "Enter your first name: ");
        String middle = getStringInput(scanner, "Enter your middle name or initial: ");
        String last = getStringInput(scanner, "Enter your last name: ");
        String title = getStringInput(scanner, "Enter your title: ");

        System.out.println(first + middle + last + title);

        if ( middle.length() == 1 ) middle = middle + ".";

        if ( ! title.isEmpty() ) title = ", " + title;

        System.out.println(first + " " + middle + " " + last + title);




    }

    public static String getStringInput(Scanner scanner, String prompt){
        System.out.print(prompt);
        String input = scanner.nextLine();
        return input;
    }
}