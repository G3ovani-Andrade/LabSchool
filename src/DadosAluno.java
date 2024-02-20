import java.util.ArrayList;
import java.util.Scanner;

public class DadosAluno {
    private Scanner scanner;
    //TODO quando terinar os testes mudar de public static para private
    public static ArrayList<Aluno> alunos = new ArrayList<>();
    
    //TODO pode apagar apenas teste
    public static void adicionarAluno(  )
	{
		alunos.add( new Aluno("geovani",32) );
	}
    
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


    //Criei com o objetivo de que remover o aluno apenas da turma é diferente de remover o aluno total
    public void removerAlunoTurma() {
        int escolha = listarEscolherAlunoTurma();
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


    //Criei com o objetivo de que remover o aluno apenas da turma é diferente de remover o aluno total
    public void listarAlunoTurma() {
        for (Aluno aluno : alunos) {
            System.out.println(alunos.indexOf(aluno) + " - " + aluno.getNome());
        }
    }
    public int listarEscolherAlunoTurma() {
        listarAlunoTurma();
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

    public Aluno loginAluno() {
        for (int i = 0; i <= 2; i++) {
            Aluno existeAluno = null;
            System.out.print("Digite o nome do aluno:");
            String nomeAluno = scanner.next();
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

    public DadosAluno() {
    }

    public ArrayList<Aluno> getAluno() {
        return alunos;
    }

    public void setAluno(ArrayList<Aluno> aluno) {
        this.alunos = aluno;
    }
}
