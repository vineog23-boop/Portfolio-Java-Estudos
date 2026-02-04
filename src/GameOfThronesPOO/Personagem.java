package GameOfThronesPOO;

public abstract class Personagem {

    //Classe Abstrata - Nao pode ser Instanciada
    String nome;
    int honra;
    String casa;
    String regiaoContinente;
    String caracteristicaPrincipal;


    /* Construtor geral: o this aponta para a instância atual do objeto,
     permitindo diferenciar atributos da classe dos parâmetros do construtor */
    public Personagem(String nome, int honra, String casa, String regiaoContinente, String caracteristicaPrincipal) {
        this.nome = nome;
        this.honra = honra;
        this.casa = casa;
        this.regiaoContinente = regiaoContinente;
        this.caracteristicaPrincipal = caracteristicaPrincipal;
    }


   //Métodos Abstratos (sem corpo,sao definidos nas classes sub classes)
    public abstract void declararLealdade ();

    public abstract void exibirStatus();





}

