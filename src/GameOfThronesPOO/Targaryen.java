package GameOfThronesPOO;

public class Targaryen extends Personagem implements Combatente{
    boolean maeDosDragoes;
    int numeroDragoes;


    public Targaryen(String nome, int honra, String casa, String regiaoContinente, String caracteristicaPrincipal, boolean maeDosDragoes,int numeroDragoes) {
        super(nome, honra, casa, regiaoContinente, caracteristicaPrincipal);
        this.maeDosDragoes = maeDosDragoes;
        this.numeroDragoes = numeroDragoes;
    }





    @Override
    public void declararLealdade() {
        System.out.println(
                String.format("🐉 Lealdade:\n" +
                                "🔥 %s proclama: \"Fogo e Sangue!\"", nome));
    }

    @Override
    public void exibirStatus() {
        System.out.println(
                String.format("📊 Status atual:\n" + "🐲 Dragões: %d\n" + "🧭 Honra: %d", numeroDragoes, honra)
        );
    }

    @Override
    public void atacar() {
        System.out.println(
                String.format("🔥 %s ataca montado em seus dragões.\n" +
                                "🐲 O fogo consome tudo no campo de batalha.", nome)
        );
    }



}








