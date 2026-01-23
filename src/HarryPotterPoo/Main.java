package HarryPotterPoo;

public class Main {
    public static void main(String[] args) {

        Pessoa hagrid = new Pessoa();
        hagrid.nome = "Rúbeo Hagrid";
        hagrid.familia = "Hagrid";
        hagrid.idade = 75;
        hagrid.funcao = "Guardiao das Chaves e das Terras";

        Pessoa Filch = new Pessoa();
        Filch.nome = "Argo Filch";
        Filch.familia = "Filch";
        Filch.idade = 45;
        Filch.funcao = "Zelador";



        Mago voldemort = new Mago();
        voldemort.nome = "Tom Servollo Riddle";
        voldemort.familia = "Riddle's";
        voldemort.idade = 68;
        voldemort.funcao = "Lord das Trevas";
        voldemort.nivelMagico = 90;
        voldemort.varinha ="Teixo";




        Estudante harryPotter = new Estudante();
        harryPotter.nome = "Harry Potter";
        harryPotter.casa ="Grifinoria";
        harryPotter.familia = "Potters";
        harryPotter.idade = 14;
        harryPotter.anoEscolar = "Quarto Ano";
        harryPotter.nivelMagico = 40;
        harryPotter.varinha = "Azevinho";


        Estudante dracoMalfoy = new Estudante();
        dracoMalfoy.nome = "Draco Malfoy";
        dracoMalfoy.casa ="Sonserina";
        dracoMalfoy.familia = "Malfoy's";
        dracoMalfoy.idade = 14;
        dracoMalfoy.anoEscolar = "Quarto Ano";
        dracoMalfoy.nivelMagico = 40;
        dracoMalfoy.varinha = "Pilriteiro ";

        Estudante cedricoDigorry = new Estudante();
        cedricoDigorry.nome = "Cedrico Digorry";
        cedricoDigorry.casa ="Lufa-Lufa";
        cedricoDigorry.familia = "Digorry";
        cedricoDigorry.idade = 17;
        cedricoDigorry.anoEscolar = "Sétimo Ano";
        cedricoDigorry.nivelMagico = 55;
        cedricoDigorry.varinha = "Freixo ";

        Professor snape = new Professor();
        snape.nome = "Severus Snape";
        snape.casa ="Sonserina";
        snape.familia = "Snape";
        snape.idade = 34;
        snape.materiaLecionada = "Defesa Contra as Artes das Trevas";
        snape.nivelMagico = 80;
        snape.varinha = "Desconhecida";
        snape.ehDiretor = false;

        Professor dumbledore = new Professor();
        dumbledore.nome = "Albus Dumbledore";
        dumbledore.casa ="Grifinoria";
        dumbledore.familia = "Dumbledore";
        dumbledore.idade = 115;
        dumbledore.materiaLecionada = "Nenhuma";
        dumbledore.nivelMagico = 95;
        dumbledore.varinha = "Desconhecida";
        dumbledore.ehDiretor = true;









    }
}
