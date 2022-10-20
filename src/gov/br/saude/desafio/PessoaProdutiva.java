package gov.br.saude.desafio;

import java.time.LocalDate;

public class PessoaProdutiva extends Pessoa{

    private String pis;
    public PessoaProdutiva(String cpf, String nome, LocalDate dataNascimento, String pis) {
        super(cpf, nome, dataNascimento);
        this.pis = pis;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }
}
