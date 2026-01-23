
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.println("Give the first number:");
        int numero1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int numero2 = Integer.valueOf(scanner.nextLine());

        int resultado = numero1 + numero2;

        System.out.println("The sum of the numbers is " + resultado);





    }
}
