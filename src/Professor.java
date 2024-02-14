public class Professor extends Funcionario{
    private int idade;
    private int tempoTrabalho;

    public Professor(String nome, int idade, int tempoTrabalho,float salario) {
        super(nome, salario);
        this.idade = idade;
        this.tempoTrabalho = tempoTrabalho;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTempoTrabalho() {
        return tempoTrabalho;
    }

    public void setTempoTrabalho(int tempoTrabalho) {
        this.tempoTrabalho = tempoTrabalho;
    }
}
