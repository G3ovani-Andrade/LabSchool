public class Professor extends Funcionario{
    private int idade;

    public Professor(String nome, int idade, int tempoCargo,float salario) {
        super(nome, salario, tempoCargo);
        this.idade = idade;
    }

    @Override
    public String toString() {
        return super.toString() + "\nIdade: " + idade + " anos";
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
