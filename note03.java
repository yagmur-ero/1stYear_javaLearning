import java.util.Scanner;
// This program performs basic arithmetic operations using switch-case.

public class note03 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.print("Choose operator (+,-,*,/) : ");
        char oper = input.next().charAt(0);

        switch(oper) {
            case '+':
                System.out.println("Result: "+(num1 + num2));
                break;
            case '-':
                System.out.println("Result: "+(num1 - num2));
                break;
            case '*':
                System.out.println("Result: "+(num1 * num2));
                break;
            case '/':
                if (num2!= 0) {
                    System.out.println("Result: "+(num2 / num1));
                }else{
                    System.out.println("Eror: Division by zero is not allowed.");
                }
                break;
                default:
                    System.out.println("Invalid operator. Please choose +, -, *, or /.");
        }
        input.close();
    }
    
}
