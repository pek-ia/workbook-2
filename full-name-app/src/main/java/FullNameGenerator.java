import java.util.Scanner;

public class FullNameGenerator {

    static Scanner s;

    public static void main(String[] args) {

        s = new Scanner(System.in);

        System.out.println("Hello user!");
        System.out.println("I'm a computer.  What is your name?  I'll ask you one piece at a time:");

        String firstName = getUserInputWithPrompt("What is your first name? ");
        String middleName = getUserInputWithPrompt("What is your middle name? ");
        String lastName = getUserInputWithPrompt("What is your last name? ");
        String suffix = getUserInputWithPrompt("What is your suffix name? ");

        String fullName = "";

        fullName = firstName + " " + (middleName.isBlank()?"":" ") + lastName + " " + suffix;

        System.out.println("Thank you, " + fullName);

    }

    public static String getUserInputWithPrompt(String prompt){
        System.out.print(prompt);
        return s.nextLine();
    }


}
