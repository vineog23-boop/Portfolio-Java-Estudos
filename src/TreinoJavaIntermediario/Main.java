package TreinoJavaIntermediario;

public class Main {
    static void main(String[] args) {

        // criando objeto carro1 (famoso meu audao)

        Carros veiculo1 = new Carros();
        veiculo1.fabricante = "Audi";
        veiculo1.nomeCarro = "Audi R8";
        veiculo1.modelo = "Super Esportivo Coupe";
        veiculo1.cor = "Cinza";
        veiculo1.anoDoCarro = 2024;
        veiculo1.usado = false;
        veiculo1.preco = 1000000.00;

        String menssagemSaudacao = veiculo1.Saudacao();
        System.out.println(menssagemSaudacao);

        System.out.println("O modelo selecionado é : "+ veiculo1.modelo);
        veiculo1.Oferta();

        Carros veiculo2 = new Carros();
        veiculo2.fabricante = "Ferrari";
        veiculo2.nomeCarro = "Ferrari F8 Tributo";
        veiculo2.modelo = "Super Esportivo";
        veiculo2.cor = "Vermelho Corsa";
        veiculo2.anoDoCarro = 2021;
        veiculo2.usado = true;
        veiculo2.preco = 4200000.00;

        String menssagemSaudacao2 = veiculo2.Saudacao();
        System.out.println(menssagemSaudacao2);
        System.out.println("O carro selecionado é : " + veiculo2.nomeCarro);
        veiculo2.Oferta();




        }
    }

