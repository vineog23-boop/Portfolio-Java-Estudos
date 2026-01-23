package TreinoJavaIniciante;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio4 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorHora = sc.nextDouble();
        double salario = horasTrabalhadas *valorHora;

        System.out.println("Numéro Funcionario = " + numeroFuncionario);
        System.out.println ("Salario = U$" + salario);

    }
}