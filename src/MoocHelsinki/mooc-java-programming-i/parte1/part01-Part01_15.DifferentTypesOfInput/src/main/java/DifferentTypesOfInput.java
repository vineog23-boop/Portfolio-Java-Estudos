
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.println("Give a string:");
        
        String resposta1 = String.valueOf(scanner.nextLine());

        System.out.println("Give an integer:");

        int resposta2 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give a double:");

        double resposta3 = Double.valueOf(scanner.nextLine());

        System.out.println("Give a boolean:");

        boolean resposta4 = Boolean.valueOf(scanner.nextLine());


        System.out.println("You gave the string " + resposta1);
        System.out.println("You gave the integer " + resposta2);
        System.out.println("You gave the double " + resposta3);
        System.out.println("You gave the boolean " + resposta4);
        


        


    }
}
