import java.util.ArrayList;

public class DadosAluno {

    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }


    public void removerAluno() {
        int escolha = listarEscolherAluno();
        this.alunos.remove(escolha);
    }


    public void listarAluno() {
        for (Aluno aluno : alunos) {
            System.out.println(alunos.indexOf(aluno) + " - " + aluno.getNome());
        }
    }
    public int listarEscolherAluno() {
        listarAluno();
        System.out.print("Escolha uma opção: ");
        int escolha = ScannerUtil.nextInt();
        if(escolha < alunos.size()){
            return escolha;
        }
        System.out.println("Escolha inválida");
        return listarEscolherAluno();
    }

    public void criarAluno() {
        System.out.println("Criar conta de aluno:");
        System.out.print("Nome: ");
        String nome = ScannerUtil.nextLine();
        System.out.print("Idade: ");
        int idade = Integer.parseInt(ScannerUtil.nextLine());
        System.out.println("Novo aluno criado");

        adicionarAluno(new Aluno(nome,idade));
    }

    public Aluno loginAluno() {
        for (int i = 0; i <= 2; i++) {
            Aluno existeAluno = null;
            System.out.print("Digite o nome do aluno:");
            String nomeAluno = ScannerUtil.nextLine();
            for (Aluno aluno : alunos){
                if (aluno.getNome().equals(nomeAluno)) {
                    existeAluno = aluno;
                }
            }
            if (existeAluno != null) {
                System.out.println("Bem-vindo " + nomeAluno);
                return existeAluno;
            } else {
                System.out.println("Aluno não encontrado!");
            }
        }
        System.out.println("Limite de tentativas excedido! Voltando ao menu inicial.");
        return null;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAluno(ArrayList<Aluno> aluno) {
        this.alunos = aluno;
    }
}
