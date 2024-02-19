import java.util.ArrayList;
import java.util.Scanner;

public class DadosCurso {
    private Scanner scanner;
    private ArrayList<Curso> cursos = new ArrayList<>();

    public DadosCurso(Scanner scanner) {
        this.scanner = scanner;
    }

    public void listarCursos() {
        for (Curso curso : cursos) {
            System.out.println(cursos.indexOf(curso) + " - " + curso.getNomeCurso());
        }
    }

    public void adicionarCurso(Curso nomeCurso) {

        this.cursos.add(nomeCurso);
    }

    public void criarCurso() {
        System.out.println("Criar novo Curso:");
        System.out.print("Nome do Curso: ");
        String nomeCurso = scanner.nextLine();

        System.out.println("Novo curso criado");

        adicionarCurso(new Curso(nomeCurso));
    }
    public void escolherCurso (Aluno aluno) {
        listarCursos();
        System.out.println("Escolha um curso pelo númeto:");
        int escolha = scanner.nextInt();

        if (escolha > 0 && escolha <= cursos.size()) {
            Curso cursoEscolhido = cursos.get(escolha - 1);
            aluno.escolherCurso(cursoEscolhido);
            System.out.println(aluno.getNome() + "agora está matriculado em " + cursoEscolhido.getNomeCurso());

        } else {
            System.out.println("Escolha inválida.");
        }
    }
}
