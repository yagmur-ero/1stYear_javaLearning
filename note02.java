 import java.util.Scanner;

// This program checks if the user is old enough to get a driver's license.

public class note02{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to get a driver's license.");
        } else {
            System.out.println("You are not old enough to get a driver's license.");
        }

        input.close();
    }
} 
