package gov.br.saude.desafio;

import java.time.LocalDate;
import java.time.Period;

public abstract class Pessoa {

    private String cpf;
    private String nome;
    private LocalDate dataNascimento;

    public Pessoa(String cpf, String nome, LocalDate dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public int calcularIdade(){

        LocalDate today = LocalDate.now();
        LocalDate nascimento = this.getDataNascimento();
        Period periodo = Period.between(nascimento,today);
        int idade = Integer.parseInt(String.valueOf(periodo.getYears()));
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


}
