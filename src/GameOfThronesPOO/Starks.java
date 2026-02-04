package GameOfThronesPOO;

public class Starks extends Personagem implements Combatente {
String nomeLobo;

/*Construtores nas classes filhas - utilizao o this em referencia aos atributos dsa propria classe e o super pra instancia do pai
    */
    public Starks (String nome, int honra, String casa, String regiao, String caracteristicaPrincipal,String nomeLobo ) {
        super(nome, honra, casa, regiao, caracteristicaPrincipal);
        this.nomeLobo = nomeLobo;
    }


    @Override
    public void declararLealdade() {
        System.out.println(
                "🛡️ Lealdade: \n" + "🧭 Honra acima de tudo.\n" + "❄️ O Norte não esquece.");
    }

    @Override
    public void exibirStatus() {
        System.out.println(
                String.format("📊 Status atual: \n" + "🧭 Honra: %d\n" + "🐺 Companheiro: %s",
                        honra, nomeLobo)
        );
    }

    public void atacar() {
        System.out.println(
                String.format("⚔️ Sou %s, combatente do Norte.\n" + "🗡️ Minha espada faz justiça.", nome)
        );
    }

}





