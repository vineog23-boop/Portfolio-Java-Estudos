package TreinoJavaIniciante;

import java.util.Arrays;

public class Exercicio9 {
     public static void main(String[] args) {
        int numeroDeAcertos = 37;
        // ternarios

        String aprovacaoVestibular = ( numeroDeAcertos > 60) ? "O numero de acertos para passar em ADS é suficiente, aprovado" : "O número de acertos para passar em ADS é muito baixo, reprovado";
        System.out.println(aprovacaoVestibular);

        /*Arrays - criacao do array com o metodo new
        *tipoVariavel [] = new tipoVariavel [quanntidade de items]
         */

        String[] listaVestibulares = new String [5];
        listaVestibulares[0] = "Unicamp";
        listaVestibulares[1] = "Unesp";
        listaVestibulares[2] = "FUVEST";
        listaVestibulares[3] = "ENEM";
        listaVestibulares[4] = "UEL";

        System.out.println(listaVestibulares [1]);
         System.out.println(listaVestibulares[2]);

         /*( Arrays - criacao do array a partir da listagem dos itens
          *tipoVariavel[] nomeVariavel = {lista de itens do array}
          */

        String[] cursos = {"lista de cursos:", "fisica","matematica","ads"};
        System.out.println(Arrays.toString(cursos));
         System.out.println(cursos[1]);

    }
}
