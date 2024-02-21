import java.util.ArrayList;

public class DadosCurso {
    private ArrayList<Curso> cursos = new ArrayList<>();

    public void removerCurso() {
        int escolha = listarEscolherCurso();
        this.cursos.remove(cursos.get(escolha));
    }

    public void listarCursos() {
        for (Curso curso : cursos) {
            System.out.println(cursos.indexOf(curso) + " - " + curso.getNomeCurso());
        }
    }

    public int listarEscolherCurso() {
        listarCursos();
        System.out.print("Escolha uma opção: ");
        int escolha = ScannerUtil.nextInt();
        return escolha;
    }

    public void adicionarCurso(Curso nomeCurso) {

        this.cursos.add(nomeCurso);
    }

    public void criarCurso() {
        System.out.println("Criar novo Curso:");
        System.out.print("Nome do Curso: ");
        String nomeCurso = ScannerUtil.nextLine();

        System.out.println("Novo curso criado");

        adicionarCurso(new Curso(nomeCurso));
    }
    public void escolherCurso (Aluno aluno) {
        listarCursos();
        System.out.println("Escolha um curso pelo número:");
        int escolha = ScannerUtil.nextInt();

        if (escolha > 0 && escolha <= cursos.size()) {
            Curso cursoEscolhido = cursos.get(escolha);
            aluno.escolherCurso(cursoEscolhido);
            System.out.println(aluno.getNome() + "agora está matriculado em " + cursoEscolhido.getNomeCurso());
        } else {
            System.out.println("Escolha inválida.");
        }
    }
}
