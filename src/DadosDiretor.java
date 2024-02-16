import java.util.ArrayList;
import java.util.Scanner;

public class DadosDiretor {

    private ArrayList<Diretor> diretor = new ArrayList<>();

    public void adicionarDiretor(Diretor diretor) {
        this.diretor.add(diretor);
    }

    public void removerDiretor(Scanner scanner) {
        int escolha = listarEscolherDiretor(scanner);
        this.diretor.remove(diretor.get(escolha));
    }

    public void listarDiretor() {
        for (int i = 1; i <= diretor.size(); i++) {
            System.out.println(i + " - " + diretor.get(i - 1).getNome());
        }
    }
    public int listarEscolherDiretor(Scanner scanner) {
        for (int i = 1; i <= diretor.size(); i++) {
            System.out.println(i + " - " + diretor.get(i - 1).getNome());
        }
        System.out.print("Escolha uma opção: ");
        int escolha = Integer.parseInt(scanner.nextLine());
        return escolha - 1;
    }
    public void criarProfessor(Scanner scanner) {
        System.out.println("Criar conta de diretor:");
        System.out.print  ("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Novo diretor criado");

        adicionarDiretor(new Diretor(nome));
    }

    public ArrayList<Diretor> getDiretor() {
        return diretor;
    }

    public void setDiretor(ArrayList<Diretor> diretor) {
        this.diretor = diretor;
    }
}
