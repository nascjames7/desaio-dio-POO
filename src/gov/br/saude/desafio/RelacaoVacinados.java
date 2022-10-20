package gov.br.saude.desafio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RelacaoVacinados {

    private RegistroVacina[] vac;
    private int indiceProximoVacinado;


    public RelacaoVacinados(int indiceProximoVac) {

        this.vac = new RegistroVacina[100];
        this.indiceProximoVacinado = 0;
    }

    //Adiciona um registro de vacina.
    public void adicionarRegistro (RegistroVacina vacinado){

        this.vac[this.indiceProximoVacinado] = vacinado;
        this.indiceProximoVacinado++;

    }

    //Calcula o total de vacinados acima de uma determinada idade, desde que tenha tomado as 2 doses.
    public double totalVacinadosAcimade (int idade){

        int totalVacinados = 0;

        for(int i = 0; i < this.indiceProximoVacinado; i++){

            if((idade < this.vac[i].getPessoaVacinada().calcularIdade())
                    && (this.vac[i].getDose() == 2)){

                totalVacinados++;
            }

        }
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        System.out.printf("\nTotal de vacinados acima de %d anos: %d", idade, totalVacinados);
        return totalVacinados;
    }

    //Lista as pessoas que não tomaram a segunda dose.
    public void listarPessoasQueNaoTomaram2aDose (){

        //Imprime a primeira linha da tabela.
        System.out.printf("\n\tCPF\t\t\t|\t\t\tNome\t\t\t|\tIdade\t|\tData Indicada p/ 2ª Dose\t\n");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");

        //Definição do contador de cpf no array.
        int qtdRegistrosComMesmoCpf = 0;

        //Laço para impressão da lista de pessoas que não tomaram a segunda dose.
        for(int i = 0; i < this.indiceProximoVacinado; i++){
            for(int j = 0; j < this.indiceProximoVacinado; j++){

                //Condição para impressão dos registros:
                //Não ser registro de segunda dose e ser impresso apenas uma vez de acordo com o cpf (chave).
                if(this.vac[i].getPessoaVacinada().getCpf().equals(this.vac[j].getPessoaVacinada().getCpf())
                        && (this.vac[i].getDose() != 2)){

                    //Incrementa o contador.
                    qtdRegistrosComMesmoCpf++;
                }
            }

            //Condição para impressão de registro:
            //Não ter cpf repetido e não ser registro de 2ª dose.
            if((qtdRegistrosComMesmoCpf != 2) && (this.vac[i].getDose() != 2)){

                //Acrescenta 21 dias a data da vacinação da primeira dose.
                LocalDate diaAtualizado = this.vac[i].getDataVacinacao().plusDays(21);

                //Imprime data alterada para o formato dd-MMM-YYYY.
                DateTimeFormatter meuFormatador =
                        DateTimeFormatter.ofPattern("dd/MM/YYYY");
                String dataFormatada = meuFormatador.format(diaAtualizado);

                //Imprime os dados daqueles que não tomaram a segunda dose.
                System.out.printf("%-16s|\t%15s\t\t\t|\t%5d\t|\t%15s\n", this.vac[i].getPessoaVacinada().getCpf(),
                        this.vac[i].getPessoaVacinada().getNome(), this.vac[i].getPessoaVacinada().calcularIdade(),
                        dataFormatada);

                //Retorna o contador ao valor nulo.
                qtdRegistrosComMesmoCpf = 0;
            }
        }
    }

    //Calcula o total de pessoas que não tomaram a segunda dose.
    public void totalDePessoasQueNaoTomaram2aDose (){

        //Definição de variáveis.
        int totalPessoasTomaram2aDose = 0;
        int totalPessoasCadastrados = 0;

        //Laço para calcular o numero de pessoas que tomaram a primeira ou segunda dose.
        for(int i = 0; i < this.indiceProximoVacinado; i++){
            //Implementa condição de ter tomado a primeira dose.
            if((this.vac[i].getDose() == 1)){

                totalPessoasCadastrados++;
            }
        }
        //Laço para calcular o numero de pessoas que tomaram a segunda dose.
        for(int i = 0; i < this.indiceProximoVacinado; i++){
            //Implementa condição de ter tomado a segunda dose.
            if((this.vac[i].getDose() == 2)){

                totalPessoasTomaram2aDose++;
            }

        }
        //Definição de variável que armazena o total de pessoas que não tomaram a segunda dose.
        int totalPessoasNaoVacinados2aDose = (totalPessoasCadastrados - totalPessoasTomaram2aDose);

        System.out.printf("\nTotal de vacinados que não tomaram a 2ª dose: %d", totalPessoasNaoVacinados2aDose);
    }

    //Calcula o total de pessoas que tomaram a segunda dose.
    public void totalPessoasVacinadasQueTomaram2aDose (){

        int totalPessoasVacinadasQueTomaram2aDose = 0;

        for(int i = 0; i < this.indiceProximoVacinado; i++){

            if((this.vac[i].getDose() == 2)){

                totalPessoasVacinadasQueTomaram2aDose++;
            }
        }
        System.out.printf("\nTotal de vacinados que tomaram a 2ª dose: %d", totalPessoasVacinadasQueTomaram2aDose);
    }
}
