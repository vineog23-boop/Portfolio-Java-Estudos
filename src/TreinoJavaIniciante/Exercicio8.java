package TreinoJavaIniciante;

import java.util.Scanner;

public class Exercicio8 {
    static void main(String[] args) {


        Scanner caixaUsuario =  new Scanner (System.in);

        System.out.println("Escolha um filme");
        System.out.println("Filme 1 - Crepusculo");
        System.out.println("Filme 2 - Harry Potter");
        System.out.println("Filme 3 - A Origem");
        System.out.println("Filme 4 - Um Ohar do Paraíso");
        System.out.println("Filme 5 - Ilha do Medo");

        int filmeEscolhido = caixaUsuario.nextInt();

        switch(filmeEscolhido){
            case 1:
                System.out.println("O usuario escolheu Crepusculo, ótimo para dias Hoa Hoa Hoa");
                break;

            case 2:
                System.out.println("O usuario escolheu Harry Potter,ótimo para maratonar com o namorado");
                break;

            case 3:
                System.out.println("O usuario escolheu A origem,é o filme preferido do Vinicius");
                break;

                case 4:
                    System.out.println("O usuario escolheu Um olhar do Paraíso, esse é certeza que voce vai chorar");
                    break;

                    case 5:
                        System.out.println("O usuario escolheu Ilha do Medo, O leo atuou demais");
                        break;

                        default:
                            System.out.println("O usuario escolheu um filme invalido,tente novamente");


        }

        caixaUsuario.close();
    }
}
