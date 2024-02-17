import java.util.ArrayList;
import java.util.Scanner;

public class DadosAluno {
    private Scanner scanner;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public DadosAluno(Scanner scanner) {
        this.scanner = scanner;
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void removerAluno() {
        int escolha = listarEscolherAluno();
        this.alunos.remove(alunos.get(escolha));
    }

    public void listarAluno() {
        for (Aluno aluno : alunos) {
            System.out.println(alunos.indexOf(aluno) + " - " + aluno.getNome());
        }
    }
    public int listarEscolherAluno() {
        listarAluno();
        System.out.print("Escolha uma opção: ");
        int escolha = scanner.nextInt();
        return escolha;
    }
    public void criarAluno() {
        System.out.println("Criar conta de aluno:");
        System.out.print  ("Nome: ");
        String nome = scanner.nextLine();
        System.out.print  ("Idade: ");
        int idade = Integer.parseInt(scanner.nextLine());
        System.out.println("Novo aluno criado");

        adicionarAluno(new Aluno(nome,idade));
    }

    public boolean loginAluno() {
        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o nome do aluno:");
            String nomeAluno = scanner.next();
            boolean alunoEncotrado = alunos.stream().anyMatch(aluno -> aluno.getNome().equals(nomeAluno));
            if (alunoEncotrado) {
                System.out.println("Bem-vindo " + nomeAluno);
                return true;
            } else {
                System.out.println("Aluno não encontrado!");
            }
        }
        System.out.println("Limite de tentativas excedido! Voltando ao menu inicial.");
        return false;
    }

    public ArrayList<Aluno> getAluno() {
        return alunos;
    }

    public void setAluno(ArrayList<Aluno> aluno) {
        this.alunos = aluno;
    }
}
