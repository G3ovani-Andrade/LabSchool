import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nomeTurma;
    private List<Aluno> listaAlunos = new ArrayList<>();
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

    public Turma(String nomeTurma, Curso curso) {
        this.nomeTurma = nomeTurma;
        this.curso = curso;
    }

    public void listarAlunosTurma() {
        System.out.println("Lista de Alunos - " + this.curso.getNomeCurso() + "-" + this.nomeTurma);
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }
    }

    public Aluno listarEscolherAlunosTurma() {
        for (Aluno aluno : listaAlunos) {
            System.out.println(listaAlunos.indexOf(aluno) + " - " + aluno.getNome());
        }
        System.out.print("Escolha uma opção: ");
        int escolha = ScannerUtil.nextInt();
        return listaAlunos.get(escolha);
    }

    @Override
    public String toString() {
        return "Nome da Turma: " + nomeTurma + "\nListaAlunos: " + listaAlunos + "\nAno: " + ano + "\nCurso: " + curso;
    }

    public void adicionarAluno(Aluno novoAluno) {
        listaAlunos.add(novoAluno);
    }

    public void removerAluno(Aluno aluno){
        listaAlunos.remove(aluno);
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
}
