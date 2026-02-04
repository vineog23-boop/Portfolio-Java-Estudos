package GameOfThronesPOO;

public class Main {
    public static void main(String[] args) {


        System.out.println("Starks\n");

        // Criaçao Padrao  de Objetos - Utilizando Construtores

        Starks jonSnow = new Starks (
                "Jon Snow",
                100,
                "Starks",
                "do Norte",
                "Um lider nato",
                "Ghost" );

        jonSnow.atacar();
        jonSnow.exibirStatus();
        jonSnow.declararLealdade();

        System.out.println( "------------ \\ ----------------");

        System.out.println("Lennisters\n");


        Lennister james = new Lennister (
                "James",
                0,
                "Lennisters",
                "das Terras Ocidentais",
                "traidor",
                75);



        james.atacar();
        james.exibirStatus();
        james.declararLealdade();


        System.out.println("---------- \\ -----------------");
        System.out.println("Targaryen\n" );

        Targaryen daemon = new Targaryen ("Daemon",
                5,
                "Targaryen",
                "Essos",
                "anti-heroi",
                false,
                0);

        daemon.atacar();
        daemon.exibirStatus();
        daemon.declararLealdade();



    }
}
