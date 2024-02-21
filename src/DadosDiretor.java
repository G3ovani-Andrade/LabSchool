import java.util.ArrayList;

public class DadosDiretor {
    private ArrayList<Diretor> diretores = new ArrayList<>();

    public void adicionarDiretor(Diretor diretor) {
        this.diretores.add(diretor);
    }

    public void removerDiretor() {
        int escolha = listarEscolherDiretor();
        this.diretores.remove(escolha);
    }

    public void listarDiretor() {
        for (Diretor diretor : diretores) {
            System.out.println(diretores.indexOf(diretor) + " - " + diretor.getNome());
        }
    }

    public int listarEscolherDiretor() {
        listarDiretor();
        System.out.print("Escolha uma opção: ");
        int escolha = ScannerUtil.nextInt();
        return escolha;
    }

    public void criarDiretor() {
        System.out.println("Criar conta de diretor:");
        System.out.print("Nome: ");
        String nome = ScannerUtil.nextLine();
        System.out.println("Novo diretor criado");

        adicionarDiretor(new Diretor(nome));
    }

    public boolean loginDiretor() {
        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o nome do Diretor:");
            String nomeDiretor = ScannerUtil.nextLine();
            boolean diretorEncotrado = diretores.stream().anyMatch(diretor -> diretor.getNome().equals(nomeDiretor));
            if (diretorEncotrado) {
                System.out.println("Bem-vindo " + nomeDiretor);
                return true;
            } else {
                System.out.println("Diretor não encontrado!");
            }
        }
        System.out.println("Limite de tentativas excedido! Voltando ao menu inicial.");
        return false;
    }

    public ArrayList<Diretor> getDiretores() {
        return diretores;
    }

    public void setDiretor(ArrayList<Diretor> diretores) {
        this.diretores = diretores;
    }
}



