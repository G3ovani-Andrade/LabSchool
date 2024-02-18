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
}
