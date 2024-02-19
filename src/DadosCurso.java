import java.util.ArrayList;
import java.util.Scanner;

public class DadosCurso {
    private Scanner scanner;
    private ArrayList<Curso> cursos = new ArrayList<>();

    public DadosCurso(Scanner scanner) {
        this.scanner = scanner;
    }

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
        int escolha = scanner.nextInt();
        return escolha;
    }

}
