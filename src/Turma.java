import java.util.List;

public class Turma {
    private String nomeTurma;
    private List<Aluno> listaAlunos;
    private int ano;
    private Curso curso;

    public Turma(String nomeTurma, List<Aluno> listaAlunos, int ano, Curso curso) {
        this.nomeTurma = nomeTurma;
        this.listaAlunos = listaAlunos;
        this.ano = ano;
        this.curso = curso;
    }

    public Turma() {
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void listarAlunos() {
        System.out.println("Lista de Alunos - " + this.curso.getNomeCurso() + "-" + this.nomeTurma);
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }
    }

    public void adicionarAluno(Aluno novoAluno) {
        listaAlunos.add(novoAluno);
    }

    public void removerAluno(Aluno aluno){
        listaAlunos.remove(aluno);
    }


}
