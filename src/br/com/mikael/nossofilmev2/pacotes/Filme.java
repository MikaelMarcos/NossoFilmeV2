public class Filme {
    String nome;
    int anoDeLancamento;
    int duracaoMinutos;
    boolean incluidoNoPlano;
    double avaliacao;
    private double somaDasAvaliacoes=0;
    private int totalAvaliacoes;

    int gettotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public void exibeFilme() {
        System.out.println("Ano de lançamento: "+ anoDeLancamento);
        System.out.println("Nome do filme: "+ nome);
        System.out.println("Avaliação: " + somaDasAvaliacoes);
    }
    /*
        public double avalia(double nota){
            avaliacao = nota;
            return avaliacao;
        }
    */
    public void avalia(double nota){
        somaDasAvaliacoes+=nota;
        totalAvaliacoes++;
    }

    public double pegamedia(){
        return somaDasAvaliacoes/totalAvaliacoes;
    }
}


