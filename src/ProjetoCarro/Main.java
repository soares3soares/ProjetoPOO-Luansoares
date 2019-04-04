package ProjetoCarro;

public class Main {

    public static void main (String args[]){
        proprietario proprietario = new Proprietario("Soares", 117);
        proprietario.nome = "Luan Soares";
        proprietario.bairro = Murinin;
        proprietario.cep = 68795555;
        proprietario.cidade = "Benevides";
        proprietario.complemento = "ap. A710";
        proprietario.cpf = 999.555.666.222-10;
        proprietario.rua = "Santa Maria";
        proprietario.rg = 5544887;
        proprietario.estado = "Pará";
        proprietario.nascimento = "13/06/1888";

        Carro carro = new Carro ();
        carro.proprietario = proprietario;
        carro.numPortas = 5;
        carro.quantMarchas = 6;
        carro.velAtual = 20;
        carro.marchaAtual = 2;
        carro.modelo = A3;
        carro.ano = 2006;
        carro.cambioAuto = false;
        carro.cor = "Preto";
        carro.marca = "Audi";
        carro.teto = false;
        carro.velMaxima = 210;
        carro.volCombustivel = 48;

        System.out.println(carro.velAtual);
        carro.acelera();
        carro.acelear();
        carro.freiar();
        Sytem.out.println(carro.velAtual);

        Sytem.out.println(carro.marchaAtual);
        carro.trocaMarcha (novaMarcha: 20);
        System.out.println(carro.marchaAtual);
        System.out.println(carro.proprietario.nome);

    }


}
