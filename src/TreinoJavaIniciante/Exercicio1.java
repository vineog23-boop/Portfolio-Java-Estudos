package TreinoJavaIniciante;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio1{

     public static void main(String[] args){
         Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double medidaLargura;
        double medidaComprimento;
        double valorMetro;

        medidaLargura = sc.nextDouble();
        medidaComprimento = sc.nextDouble();
        valorMetro = sc.nextDouble();


        double areaTotal = medidaLargura * medidaComprimento;
        double valorTotal= areaTotal * valorMetro;

        System.out.printf("Area = %.2f ", areaTotal);
        System.out.printf("Preco = %.2f", valorTotal);

         sc.close();
    }
}