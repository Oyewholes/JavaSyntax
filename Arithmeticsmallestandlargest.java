import java.util.Scanner;
public class Arithmeticsmallestandlargest
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;

        int smallest;
        int largest;

        System.out.println("Enter first integer");
        number1 = input.nextInt();
        System.out.println("Enter second integer");
        number2 = input.nextInt();
        System.out.println("Enter third integer");
        number3 = input.nextInt();

        int sum = number1 + number2 + number3;
        int average = (number1 + number2 + number3) / sum;
        int product = number1 * number2 * number3;
        smallest = number1;
        if (number2 < smallest)
        {
            smallest = number2;

        }
        if (number3 < smallest)
        {
            smallest = number3;

        }

        largest = number1;
        if (number2 > largest)
        {

            largest = number2;

        }
        if (number3 > largest)
        {

            largest = number3;

        }


        System.out.printf("sum is %d%n", sum);
        System.out.printf("average is %d%n", average);
        System.out.printf("product is %d%n", product);
        System.out.printf("largest is %d%n", largest);
        System.out.printf("smallest is %d%n", smallest);

    }
}