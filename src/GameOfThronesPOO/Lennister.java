package GameOfThronesPOO;

public class Lennister extends Personagem implements Combatente{
    int saldoMoedas;

    public Lennister(String nome, int honra, String casa, String regiao, String caracteristicaPrincipal, int saldoMoedas) {
        super(nome, honra, casa, regiao, caracteristicaPrincipal);
        this.saldoMoedas = saldoMoedas;
    }

    @Override
    public void declararLealdade() {
        System.out.println(
                String.format("🦁 Lealdade:\n"
                + "💭 %s diz:\"Um lennister sempre paga suas dívidas.\"", nome) );

    }



    @Override
    public void exibirStatus() {
        System.out.println(
                String.format("📊Status Atual:\n" +
                        "Moedas de Ouro %d%n" +
                        "🧭Honra %d", saldoMoedas , honra)
        );

    }


    //  interface implementada
    @Override
    public void atacar() {
        System.out.println(String.format("⚔️ Sou %s, combatente das Terras Ocidentais.\n" +
                                "💰 Meu ouro é meu maior poder.", nome) );
    }
}



