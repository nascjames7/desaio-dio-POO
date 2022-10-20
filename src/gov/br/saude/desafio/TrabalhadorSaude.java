package gov.br.saude.desafio;

import java.time.LocalDate;

public class TrabalhadorSaude extends Pessoa{

    private String registro;
    public TrabalhadorSaude(String cpf, String nome, LocalDate dataNascimento, String registro) {
        super(cpf, nome, dataNascimento);
        this.registro = registro;
    }
}
