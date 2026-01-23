package TreinoJavaIniciante;

public class Exercicio12 {
    public static void main(String[] args) {

        String [][] turmaAluno = new String [2][4];
        turmaAluno[0][0] = "Turma A";
        turmaAluno[0][1] = "Catarina";
        turmaAluno[0][2] = "Vinicius";
        turmaAluno[0][3] = "Linda";

        turmaAluno[1][0] = "Turma B";
        turmaAluno[1][1] = "Lottinha";
        turmaAluno[1][2] = "Horus";
        turmaAluno[1][3] = "Taz";

        System.out.println(turmaAluno[0][3]);
        System.out.println(turmaAluno[0][1]);

        for(int j = 0; j < turmaAluno[0].length; j++) {
            System.out.println(turmaAluno[0][j]);
        }
    }
}