package ProjetoCarro;

public class Proprietario {

    String nome, nascimento, rua, bairro, cidade, estado, complemento;
    int cpf, rg, cep;


    public Proprietario (String nome, int cpf) {

        this.nome = nome;
        this.cpf = cpf;

    }

    public String getNome(){return nome;}

    public void setNome (String nome) {this.nome = nome;}

    public String getNascimento () {return nascimento;}

    public void setNascimento (String nascimento){this.nascimento = nascimento;}

    public String getRua () {return rua;}

    public void setRua (String rua) {this.rua = rua;}

    public String getBairro () {return bairro;}

    public void setbairro (String bairro) {this.bairro = bairro;}

    public String getcidade () {return cidade;}

    public void setCidade (String cidade) {this.cidade = cidade;}

    public String getEstado () {return estado;}

    public void setEstado (String estado) {this.estado = estado;}

    public String getcomplemento () {return complemento;}

    public void setComplemento (String complemento) {this.complemento = complemento;}

    public int getcpf () {return cpf;}

    public void setcpf (int cpf) {this.cpf = cpf;}

    public int getRg () {return rg;}

    public void setRg (int rg) {this.rg = rg;}

    public int getCep () {return cep;}

    public void setCep (int cep) {this.cep = cep;}



}


