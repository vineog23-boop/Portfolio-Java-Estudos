
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.println("Give the first number:");

        int numero1 = Integer.valueOf(scanner.nextLine());
     
        System.out.println("Give the second number:");

        int numero2 = Integer.valueOf(scanner.nextLine());
    
        System.out.println("Give the third number:");
    
        int numero3 = Integer.valueOf(scanner.nextLine());
     
        double resultado = (double) (numero1 + numero2 + numero3) / 3;
    
        System.out.println("The average is " + resultado);
    

    }
}
