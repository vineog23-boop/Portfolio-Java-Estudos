package TreinoJavaIniciante;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 números inteiros: ");

        int x,y,z;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();

        if (x > y && x > z) {
            System.out.println("O maior valor escolido pertence ao número x, que é = " + x);
        }

         else if (y > z) {
            System.out.println("O maior valor escolhido pertence ao número y,que é = " + y);
        }
         else {
             System.out.println("O maior valor escolhido pertence ao número z, que é = " + z);
        }




        sc.close();
    }
}
