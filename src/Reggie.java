import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Get a SSN from the user using the specified pattern
        String ssn = SafeInput.getRegExString(in, "Enter your SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("You entered SSN: " + ssn);

        // Get a UC Student M number using the specified pattern
        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number (M######## or m########)", "^(M|m)\\d{8}$");
        System.out.println("You entered UC Student M number: " + mNumber);

        // Get a menu choice using the specified pattern
        String menuChoice = SafeInput.getRegExString(in, "Enter your menu choice (Open(O)/Save(S)/View(V)/Quit(Q))", "^[OoSsVvQq]$");
        System.out.println("You entered menu choice: " + menuChoice);
    }
}
