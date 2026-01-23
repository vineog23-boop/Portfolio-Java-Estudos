package TreinoJavaIniciante;

import java.util.Scanner;
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;

        while(x<25){
            soma = soma  +  x;
            x= sc.nextInt();
        }
        System.out.println("Soma = "+soma);

        sc.close();


    }
}
