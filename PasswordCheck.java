import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalAttempts = 3;
        boolean accessGranted = false;

        for(int i = 0; i < totalAttempts; ++i) {
            System.out.println("Enter your password: ");
            String password = input.nextLine();
            if (password.equals("*Password*")) {
                System.out.println("Password entered correctly.");
                accessGranted = true;
                break;
            }

            int remaining = totalAttempts - 1 - i;
            System.out.println("Wrong password!!! Remainig rights: " + remaining);
        }

        if (!accessGranted) {
            System.out.println("Access denied.");
        }

        input.close();
    }
    
}
