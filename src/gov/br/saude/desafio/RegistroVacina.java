package gov.br.saude.desafio;

import java.time.LocalDate;

public class RegistroVacina {

    private String id;
    private LocalDate dataVacinacao;
    private String atendente;
    private int dose;
    private String local;
    private String grupo;
    private Vacina vacinaAplicada;
    private Pessoa pessoaVacinada;

    public RegistroVacina(String id, LocalDate dataVacinacao, String atendente, int dose, String local, String grupo, Vacina vacinaAplicada, Pessoa pessoaVacinada) {
        this.id = id;
        this.dataVacinacao = dataVacinacao;
        this.atendente = atendente;
        this.dose = dose;
        this.local = local;
        this.grupo = grupo;
        this.vacinaAplicada = vacinaAplicada;
        this.pessoaVacinada = pessoaVacinada;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDataVacinacao() {
        return dataVacinacao;
    }

    public void setDataVacinacao(LocalDate dataVacinacao) {
        this.dataVacinacao = dataVacinacao;
    }

    public String getAtendente() {
        return atendente;
    }

    public void setAtendente(String atendente) {
        this.atendente = atendente;
    }

    public int getDose() {
        return dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Vacina getVacinaAplicada() {
        return vacinaAplicada;
    }

    public void setVacinaAplicada(Vacina vacinaAplicada) {
        this.vacinaAplicada = vacinaAplicada;
    }

    public Pessoa getPessoaVacinada() {
        return pessoaVacinada;
    }

    public void setPessoaVacinada(Pessoa pessoaVacinada) {
        this.pessoaVacinada = pessoaVacinada;
    }

}
