package ProjetoClinica;

public class Clinica {

    public static void main (String args []){

        Paciente paciente = new Paciente();
        paciente.nome = "Adelson Ribeiro";
        paciente.cpf ="45188877710";
        paciente.endereço = "Santa Catarina";
        paciente.sus = "959579885643";

        Medico medico = new Medico();
        medico.nome = "Fabricio Teixeira";
        medico.especialidade = "Urulogista";
        medico.crm = "8985465213";

        AtendementoMedico atendimentoMedico = new AtendimentoMedico();
        atendimentoMedico.consulta = "12/05/2019";
        atendimentoMedico.paciente = paciente;
        atendimento.medico = medico;




    }




}