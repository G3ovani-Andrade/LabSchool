import java.util.ArrayList;
import java.util.Scanner;

public class DadosTurma {
    private Scanner scanner;
    private ArrayList<Turma> turmas = new ArrayList<>();

    public DadosTurma(Scanner scanner) {
        this.scanner = scanner;
    }

    public void listarTurmas() {
        for (Turma turma : turmas) {
            System.out.println(turmas.indexOf(turma) + " - " + turma.getNomeTurma());
        }
    }

    public void adicionarTurma(Turma nomeTurma) {

        this.turmas.add(nomeTurma);
    }

    public void criarTurma() {
        System.out.println("Criar nova Turma:");
        System.out.print("Nome da Turma: ");
        String nomeTurma = scanner.nextLine();

        System.out.println("Nova turma criada");

        adicionarTurma(new Turma(nomeTurma));
    }
}
