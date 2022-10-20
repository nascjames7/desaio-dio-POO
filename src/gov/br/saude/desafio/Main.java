package gov.br.saude.desafio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        Vacina v1 = new Vacina(12, "CORONAVAC", "21121234");
        Vacina v2 = new Vacina(25, "OXFORD", "52251234");

        //Uso de Polimosfismo para instanciar pessoas.
        Pessoa p1 = new Idoso("0333787383", "José Maria", LocalDate.of(1955, 1, 12),"45617897" );
        Pessoa p2 = new PessoaProdutiva("3830333787", "Maria José", LocalDate.of(1993, 5, 4), "786451515");
        Pessoa p3 = new Idoso("7870333383", "José Silva", LocalDate.of(1950, 10, 30), "74617894");
        Pessoa p4 = new TrabalhadorSaude("0377883303", "Laura Paixão", LocalDate.of(1980, 6, 25),"54615");
        Pessoa p5 = new Idoso("3787303383", "Maria Silva", LocalDate.of(1956, 2, 7), "856164531");

        RegistroVacina rv1 = new RegistroVacina("5123879", LocalDate.of(2021, 4, 22), "Milena Barros", 1, "DRIVE THRU GERALDAO", "IDOSOS", v2, p1);
        RegistroVacina rv2 = new RegistroVacina("6234587", LocalDate.of(2021, 9, 5), "Ester Cavalcante", 1, "DRIVE THRU PARQUE DE EXPOSIÇÃO", "TRABALHADORES DA SAÚDE", v1, p4);
        RegistroVacina rv3 = new RegistroVacina("1489635", LocalDate.of(2021, 4, 25), "Arthur Maia", 1, "DRIVE THRU - UFRPE - UNIVERSIDADE FEDERAL", "IDOSOS", v2, p2);
        RegistroVacina rv4 = new RegistroVacina("5123879", LocalDate.of(2021, 4, 24), "Jailson Daniel", 1, "DRIVE THRU GERALDAO", "IDOSOS", v1, p3);
        RegistroVacina rv5 = new RegistroVacina("2789652", LocalDate.of(2021, 4, 30), "Henrique Santos", 1, "CENTRO DE VACINAÇÃO COMPAZ ARIANO SUASSUNA", "OUTRAS PRIORIDADES", v2, p5);
        RegistroVacina rv6 = new RegistroVacina("7289546", LocalDate.of(2021, 9, 26), "Sara Francisca", 2, "DRIVE THRU ARRUDA", "TRABALHADORES DA SAÚDE", v1, p4);

        RelacaoVacinados relac = new RelacaoVacinados(5);

        relac.adicionarRegistro(rv1);
        relac.adicionarRegistro(rv2);
        relac.adicionarRegistro(rv3);
        relac.adicionarRegistro(rv4);
        relac.adicionarRegistro(rv5);
        relac.adicionarRegistro(rv6);

        p1.calcularIdade();
        p2.calcularIdade();
        p3.calcularIdade();
        p4.calcularIdade();
        p5.calcularIdade();

        relac.listarPessoasQueNaoTomaram2aDose();
        relac.totalVacinadosAcimade(30);
        relac.totalDePessoasQueNaoTomaram2aDose();
        relac.totalPessoasVacinadasQueTomaram2aDose();

    }
}
