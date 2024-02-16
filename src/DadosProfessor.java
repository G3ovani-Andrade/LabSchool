import java.util.ArrayList;
import java.util.Scanner;

public class DadosProfessor {
    private ArrayList<Professor> professor = new ArrayList<>();

    public void adicionarProfessor(Professor professor) {
        this.professor.add(professor);
    }

    public void removerProfessor(Scanner scanner) {
        int escolha = listarEscolherProfessor(scanner);
        this.professor.remove(professor.get(escolha));
    }

    public void listarProfessor() {
        for (int i = 1; i <= professor.size(); i++) {
            System.out.println(i + " - " + professor.get(i - 1).getNome());
        }
    }
    public int listarEscolherProfessor(Scanner scanner) {
        for (int i = 1; i <= professor.size(); i++) {
            System.out.println(i + " - " + professor.get(i - 1).getNome());
        }
        System.out.print("Escolha uma opção: ");
        int escolha = Integer.parseInt(scanner.nextLine());
        return escolha - 1;
    }
    public void criarProfessor(Scanner scanner) {
        System.out.println("Criar conta de professor:");
        System.out.print  ("Nome: ");
        String nome = scanner.nextLine();
        System.out.print  ("Idade: ");
        int idade = Integer.parseInt(scanner.nextLine());
        System.out.println("Novo professor criado");

        adicionarProfessor(new Professor(nome, idade));
    }

    public ArrayList<Professor> getProfessor() {
        return professor;
    }

    public void setProfessor(ArrayList<Professor> professor) {
        this.professor = professor;
    }
}
