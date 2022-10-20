package gov.br.saude.desafio;

import java.time.LocalDate;

public class Idoso extends Pessoa{

    private String beneficio;
    public Idoso(String cpf, String nome, LocalDate dataNascimento, String beneficio) {
        super(cpf, nome, dataNascimento);
        this.beneficio = beneficio;
    }

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }


}
