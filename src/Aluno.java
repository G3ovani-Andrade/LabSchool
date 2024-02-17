public class Aluno {
    private String nome;
    private int idade;
    private StatusMatricula statusMatricula;

    public Aluno() {
    }
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.statusMatricula = StatusMatricula.ATIVO;
    }

    public void ativarMatricula(){
        this.statusMatricula = StatusMatricula.ATIVO;
        System.out.println("Aluno Ativo");
    }

    public void trancarMatricula(){
        this.statusMatricula = StatusMatricula.TRANCADO;
        System.out.println("Matrícula do aluno trancada");
    }

    public void formarMatricula(){
        this.statusMatricula = StatusMatricula.FORMADO;
        System.out.println("Parabéns! Aluno formado!");
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade +
                "\nStatus da Matricula: " + statusMatricula;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
