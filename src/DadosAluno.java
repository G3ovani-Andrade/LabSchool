import java.util.ArrayList;
import java.util.Scanner;

public class DadosAluno {
    private ArrayList<Aluno> aluno = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        this.aluno.add(aluno);
    }

    public void removerAluno(Scanner scanner) {
        int escolha = listarEscolherAluno(scanner);
        this.aluno.remove(aluno.get(escolha));
    }

    public void listarAluno() {
        for (int i = 1; i <= aluno.size(); i++) {
            System.out.println(i + " - " + aluno.get(i - 1).getNome());
        }
    }
    public int listarEscolherAluno(Scanner scanner) {
        for (int i = 1; i <= aluno.size(); i++) {
            System.out.println(i + " - " + aluno.get(i - 1).getNome());
        }
        System.out.print("Escolha uma opção: ");
        int escolha = Integer.parseInt(scanner.nextLine());
        return escolha - 1;
    }
    public void criarAluno(Scanner scanner) {
        System.out.println("Criar conta de aluno:");
        System.out.print  ("Nome: ");
        String nome = scanner.nextLine();
        System.out.print  ("Idade: ");
        int idade = Integer.parseInt(scanner.nextLine());
        System.out.println("Novo aluno criado");

        adicionarAluno(new Aluno(nome,idade));
    }

    public ArrayList<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(ArrayList<Aluno> aluno) {
        this.aluno = aluno;
    }
}
