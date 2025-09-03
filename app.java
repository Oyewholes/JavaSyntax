//package ten;

import java.util.Scanner;

public class app {
	public static void main(String [] args) {
		
//		String characterName = "Tom";
//		int characterAge = 40;
//		
//		System.out.println("There was once a man named " + characterName );
//		System.out.println("He was " + characterAge + " years old. He really liked");
//		System.out.println("the name name "+ characterName +" but didn't like being 30");
//		System.out.println("Most of his friends were also " + characterAge);
//		
//		
//		String phrase = "To be or not to be";
//		System.out.println(phrase);
//		
//		
//		String word = "Giraffe Academy";
//		System.out.println(word.toUpperCase());
//		System.out.println(word.contains("Academy"));
//		System.out.println(word.contains("dog"));
//		System.out.println(word.charAt(2));
//		System.out.println(word.substring(0, phrase.indexOf(" ")) );
		
//		Scanner keyboardInput  = new Scanner(System.in);
//		System.out.print("Enter your name: ");
//		String name =keyboardInput.nextLine();
//		System.out.println("Hello " + name + "!") ;
		
		// Scanner keyboardInput = new Scanner(System.in);
		// System.out.print("Enter in the first Number: ");
		// double num1 = keyboardInput.nextDouble();
		// System.out.print("Enter in the Second Number: ");
		// double num2 = keyboardInput.nextDouble();
		// System.out.println(num2 + num1);

        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int sum;
        int product;
        int difference;
        int division;

        System.out.print("Enter first integer");
        number1 = input.nextInt();

        System.out.print("Enter second integer");
        number2 = input.nextInt();

        sum = number1 + number2;
        product = number1 * number2;
        difference = number1 - number2;
        division = number1/number2;
        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Product is %d%n", product);
        System.out.printf("Difference is %d%n", difference);
        System.out.printf("Division is %d%n", division);
	}

}
