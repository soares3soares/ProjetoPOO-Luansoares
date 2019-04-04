package ProjetoCarro;

public class Carro {

    //Atributos
    String modelo, cor, marca, chassi;
    int ano, marchaAtual, quantMarchas, numPortas;
    double velMaxima, velAtual, volCombustivel;
    boolean teto, cambioAuto;

    public String getModelo(){ return modelo;}

    public void setModelo (String modelo) {this.modelo = modelo;}

    public String getCor() {return cor;}

    public void setCor (String cor){this.cor = cor;}

    public String getMarca(){return marca;}

    public void setMarca(String marca){this.marca = marca;}

    public String getChassi () { return chassi; }

    public void setChassi (String chassi) {this.chassi = chassi;}

    public int getAno() {return ano;}

    public void setAno (int ano) {this.ano = ano;}

    public int getquantMarchas () {return quantMarchas;}

    public void setquantMarchas (int quantMarchas) {this.quantMarchas = quantMarchas;}

    public int getmarchaAtual () {return marchaAtual;}

    public void setmarchaAtual (int marchaAtual) {this.marchaAtual = marchaAtual;}

    public int getnumPortas () {return numPortas;}

    public void setnumPortas (int numPortas) {this.numPortas = numPortas;}

    public double getvelMaxima () {return velMaxima;}

    public void setvelMaxima (double velMaxima) {this.velMaxima = velMaxima;}

    public double getvelAtual () {return velAtual;}

    public void setvelAtual (double velAtual) {this.velAtual = velAtual;}

    public double getvolCombustivel () {return volCombustivel;}

    public void setvolCombustivel (double volCombustivel) {this.volCombustivel = volCombustivel;}

    public boolean isteto () {return teto;}

    public void setteto (boolean teto) {this.teto = teto;}

    public boolean iscambioAuto () {return cambioAuto;}

    public void setcambioAuto (boolean cambioAuto) {this.cambioAuto = cambioAuto;}

    public Proprietario getProprietario () {return Proprietario;}

    public void setProprietario (Proprietario Proprietario) {this.Proprietario = Proprietario;}

    Proprietario proprietario;

    //método

    void acelera () { velAtual += ; }

    void freiar () { velAtual = 0:}

    void trocaMarcha (int novaMarcha){
        if (novaMarcha > quantMarcha){
            System.err.println("Marcha Errada!");
        }else {
            marchaAtual = novaMarcha;

        }
    }//fim if

    void redMarcha () { marchaAtual -= 1;}




}
