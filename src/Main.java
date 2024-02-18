import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DadosAluno dadosAlunos = new DadosAluno(scanner);
        DadosProfessor dadosProfessores = new DadosProfessor(scanner);
        DadosDiretor dadosDiretor = new DadosDiretor(scanner);

        //Colocar loop
        System.out.print("""
                                
                Menu Inicial
                -----------------------------
                1 - Funcionário
                2 - Aluno
                0 - Sair
                Escolha o tipo do usuário:\s""");
        int tipoUsuario = scanner.nextInt();
        switch (tipoUsuario) {
            case 1:
                System.out.print("""
                                        
                        Menu Entrada
                        -----------------------------
                        1 - Login
                        2 - Cadastro
                        0 - Voltar Menu Inicial
                        Escolha opção desejado:\s""");
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.print("""

                                Menu Tipo Funcionário
                                -----------------------------
                                1 - Diretor
                                2 - Professor
                                0 - Voltar Menu Inicial
                                Escolha o tipo funcionário:\s""");
                        int tipoFuncionario = scanner.nextInt();
                        if (tipoFuncionario == 1) {
                            boolean retornoLogin = dadosDiretor.loginDiretor();
                            if (retornoLogin) {
                                LOOPMENUDIRETOR:
                                while (true) {
                                    System.out.print("""

                                            Menu Diretor
                                            -----------------------------
                                            1 - Adicionar
                                            2 - Remover
                                            3 - Listar
                                            4 - Promover Professor
                                            0 - Voltar Menu Inicial
                                            Escolha a operação desejada:\s""");
                                    switch (scanner.nextInt()) {
                                        case 1:
                                            //menuAdicionar() - Gabriela
                                            //adicionar professor
                                            //adicionar aluno
                                            //adicionar curso
                                            //adicionar turma
                                            //adicionar diretor
                                            break;
                                        case 2:
                                            //menuRemover() - Su
                                            //remover professor
                                            //remover aluno
                                            //remover curso
                                            //remover turma
                                            //remover diretor
                                            break;
                                        case 3:
                                            //menuListar() - Arthur
                                            //listar professor
                                            //listar aluno
                                            //listar curso
                                            //listar turma
                                            //listar diretor
                                            break;
                                        case 4:
                                            //promover(); - Arthur
                                        case 0:
                                            break LOOPMENUDIRETOR;
                                    }
                                }
                            }
                        } else if (tipoFuncionario == 2) {
                            boolean retornoLogin = dadosProfessores.loginProfessor();
                            if (retornoLogin) {
                                LOOPMENUPROFESSOR:
                                while (true) {
                                    System.out.print("""

                                            Menu Professor
                                            -----------------------------
                                            1 - Adicionar Aluno a Turma
                                            2 - Remover Aluno da Turma
                                            3 - Listar Alunos
                                            0 - Voltar Menu Inicial
                                            Escolha a operação desejada:\s""");
                                    switch (scanner.nextInt()) {
                                        case 1:
                                            //adicionar aluno turma - Gabriela
                                            break;
                                        case 2:
                                            //remover aluno turma - Su
                                            break;
                                        case 3:
                                            //listar alunos - Arthur
                                            break;
                                        case 0:
                                            break LOOPMENUPROFESSOR;
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        System.out.print("""

                                Menu Tipo Funcionário
                                -----------------------------
                                1 - Diretor
                                2 - Professor
                                0 - Voltar Menu Inicial
                                Escolha o tipo funcionário:\s""");
                        int tipoFuncionarioCadastro = scanner.nextInt();
                        if (tipoFuncionarioCadastro == 1) {
                            dadosDiretor.criarDiretor();
                        } else if (tipoFuncionarioCadastro == 2) {
                            dadosProfessores.criarProfessor();
                        }
                        break;
                    case 0:
                        System.out.println("Voltando ao menu inicial.");
                        break;
                    default:
                        System.out.println("\u001B[31m" + "Opção inválida!" + "\u001B[0m");
                        break;
                }
                break;
            case 2:
                System.out.print("""
                                        
                        Menu Entrada
                        -----------------------------
                        1 - Login
                        2 - Cadastro
                        0 - Voltar Menu Inicial
                        Escolha opção desejado:\s""");
                switch (scanner.nextInt()) {
                    case 1:
                        Aluno alunoLogado = dadosAlunos.loginAluno();
                        if (alunoLogado != null) {
                            LOOPMENUALUNO:
                            while (true) {
                                System.out.print("""

                                            Menu Aluno
                                            -----------------------------
                                            1 - Listar Cursos
                                            2 - Ativar Matrícula
                                            3 - Trancar Matrícula
                                            4 - Entrar Turma
                                            0 - Voltar Menu Inicial
                                            Escolha a operação desejada:\s""");
                                switch (scanner.nextInt()) {
                                    case 1:
                                        //listar cursos - Arthur
                                        break;
                                    case 2:
                                    	alunoLogado.ativarMatricula();
                                        break;
                                    case 3:
                                    	alunoLogado.trancarMatricula();
                                        break;
                                    case 4:
                                        //entrar turma - Gabriela
                                        break;
                                    case 0:
                                        break LOOPMENUALUNO;
                                }
                            }
                        }
                        break;
                    case 2:
                        dadosAlunos.criarAluno();
                        break;
                    case 0:
                        System.out.println("Voltando ao menu inicial.");
                        break;
                    default:
                        System.out.println("\u001B[31m" + "Opção inválida!" + "\u001B[0m");
                        break;
                }
                break;
            case 0:
                System.out.println("Sistema encerrado.");
                break;
            default:
                System.out.println("\u001B[31m" + "Opção inválida!" + "\u001B[0m");
                break;
        }
    }
}

//Para testes:
//Aluno a = new Aluno("Gabi", 37);
//Professor p = new Professor("André", 28, 3, 3000);
//Curso c = new Curso("Java");
//Turma t = new Turma();
//Diretor d = new Diretor(1000, "Cesar", 8);
//Funcionario f = new Funcionario("Andrezza", 2500, 1);