package TreinoJavaIniciante;

public class Exercicio11 {
    static void main() {

        String[] timesFutebolSp = new String [6];
        timesFutebolSp[0] = "Ponte Preta";
        timesFutebolSp[1] = "RedBull BR";
        timesFutebolSp[2] = "Palmeiras";
        timesFutebolSp[3] = "Corinthians";
        timesFutebolSp[4] = "Santos";
        timesFutebolSp[5] = "Sao Paulo";

        for (int i = 0; i <6 ; i++) {
            System.out.println(timesFutebolSp[i]);
        }

        timesFutebolSp[0] = "Mirassol";
        for (int i = 0; i < 6; i++) {
            System.out.println(timesFutebolSp[i]);

        }


    }
}
