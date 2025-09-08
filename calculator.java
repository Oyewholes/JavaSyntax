
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double num1 = keyboardInput.nextDouble();

        System.out.println("Enter an operator: ");
        String operator = keyboardInput.next();

        System.out.println("Enter another number: ");
        double num2 = keyboardInput.nextDouble();
    
        if (operator.equals("+")) {
            System.out.println(num1 + num2);
        } else if (operator.equals("-")) {
            System.out.println(num1 - num2);
        } else if (operator.equals("*")) {
            System.out.println(num1 * num2);
        } else if (operator.equals("/")) {
            if (num2 != 0) {
                System.out.println(num1 / num2);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Error: Invalid operator.");
        }
    }
}
