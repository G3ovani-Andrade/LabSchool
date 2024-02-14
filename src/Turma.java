import java.util.List;

public class Turma {
    private String nomeTurma;
    private List<Aluno> listaAlunos;
    private int ano;
    private Curso curso;

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
