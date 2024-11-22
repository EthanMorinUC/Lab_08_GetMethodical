import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        /*
        Scanner in1 = new Scanner(System.in);
        String p1Test = "";
        p1Test = SafeInput.getNonZeroLenString(in1, "Enter your first name");
        */
        /*
        Scanner in2 = new Scanner(System.in);
        int numberTest = SafeInput.getInt(in2, "Enter any integer: ");
        System.out.println("You entered: " + numberTest);
        */
        /*
        Scanner in3 = new Scanner(System.in);
        double numberTest = SafeInput.getDouble(in3, "Enter any double value: ");
        System.out.println("You entered: " + numberTest);
        */
        /*
        Scanner in4 = new Scanner(System.in);
        int rangedIntTest = SafeInput.getRangedInt(in4, "Enter an integer within the range", 10, 20);
        System.out.println("You entered: " + rangedIntTest);
        */
        /*
        Scanner in5 = new Scanner(System.in);
        double rangedDoubleTest = SafeInput.getRangedDouble(in5, "Enter a double value within the range", 1.0, 10.0);
        System.out.println("You entered: " + rangedDoubleTest);
        */
        /*
        Scanner in6 = new Scanner(System.in);
        boolean confirm = SafeInput.getYNConfirm(in6, "Do you want to continue");
        System.out.println("Your response: " + (confirm ? "Yes" : "No"));
        */

        Scanner in7 = new Scanner(System.in);
        String regExString = SafeInput.getRegExString(in7, "Enter a string matching the pattern", "\\d{4}"); // Example pattern: exactly four digits System.out.println("You entered: " + regExString);
    }
}