import java.util.ArrayList;

public class DadosProfessor {
    private ArrayList<Professor> professores = new ArrayList<>();

    public void adicionarProfessor(Professor professor) {
        this.professores.add(professor);
    }

    public void removerProfessor() {
        int escolha = listarEscolherProfessor();
        this.professores.remove(escolha);
    }

    public void listarProfessor() {
        for (Professor professor : professores) {
            System.out.println(professores.indexOf(professor) + " - " + professor.getNome());
        }
    }
    public int listarEscolherProfessor() {
        listarProfessor();
        System.out.print("Escolha uma opção: ");
        int escolha = ScannerUtil.nextInt();
        return escolha;
    }
    public void criarProfessor() {
        System.out.println("Criar conta de professor:");
        System.out.print  ("Nome: ");
        String nome = ScannerUtil.nextLine();
        System.out.print  ("Idade: ");
        int idade = Integer.parseInt(ScannerUtil.nextLine());
        System.out.println("Novo professor criado");

        adicionarProfessor(new Professor(nome, idade));
    }

    public boolean loginProfessor() {
        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o nome do Professor:");
            String nomeProfessor = ScannerUtil.nextLine();
            boolean professorEncotrado = professores.stream().anyMatch(professor -> professor.getNome().equals(nomeProfessor));
            if (professorEncotrado) {
                System.out.println("Bem-vindo " + nomeProfessor);
                return true;
            } else {
                System.out.println("Professor não encontrado!");
            }
        }
        System.out.println("Limite de tentativas excedido! Voltando ao menu inicial.");
        return false;
    }

    public ArrayList<Professor> getProfessor() {
        return professores;
    }

    public void setProfessor(ArrayList<Professor> professor) {
        this.professores = professor;
    }
}
