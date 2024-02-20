import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        DadosTurma dadosTurmas = new DadosTurma(scanner);
        DadosCurso dadosCursos = new DadosCurso(scanner);
        DadosAluno dadosAlunos = new DadosAluno(scanner);
        DadosProfessor dadosProfessores = new DadosProfessor(scanner);
        DadosDiretor dadosDiretor = new DadosDiretor(scanner);
        //TODO pode apagar apenas teste
        DadosAluno.adicionarAluno();
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
                                            while (true) {
                                                System.out.println("""
                                                        -----------------------------
                                                        Menu adicionar:
                                                        1 - Adicionar Professor
                                                        2 - Adicionar Aluno                        
                                                        3 - Adicionar Curso
                                                        4 - Adicionar Turma
                                                        5 - Adicionar Diretor 
                                                        0 - Voltar Menu Inicial
                                                        Escolha opção desejada:                                                       
                                                        \s""");
                                                switch (ScannerUtil.nextInt()) {
                                                    case 1:
                                                        dadosProfessores.criarProfessor();
                                                        break;
                                                    case 2:
                                                        dadosAlunos.criarAluno();
                                                        break;
                                                    case 3:
                                                        dadosCursos.criarCurso();
                                                        break;
                                                    case 4:
                                                        dadosTurmas.criarTurma();
                                                        break;
                                                    case 5:
                                                        dadosDiretor.criarDiretor();
                                                        break;
                                                    case 0:
                                                        break LOOPMENUDIRETOR;
                                                    default:
                                                        System.out.println("Opção invalida");
                                                }
                                            }
                                            break;
                                        case 2:
                                            System.out.print("""

                                            Menu Remover
                                            -----------------------------
                                            1 - Remover Professores
                                            2 - Remover Alunos
                                            3 - Remover Cursos
                                            4 - Remover Turmas
                                            5 - Remover Diretores
                                            Escolha a operação desejada:\s""");
                                            switch (ScannerUtil.nextInt()) {
                                                case 1:
                                                    dadosProfessores.removerProfessor();
                                                    break;
                                                case 2:
                                                    dadosAlunos.removerAluno();
                                                    break;
                                                case 3:
                                                    dadosCursos.removerCurso();
                                                    break;
                                                case 4:
                                                    dadosTurmas.removerTurma();
                                                    break;
                                                case 5:
                                                    dadosDiretor.removerDiretor();
                                                    break;
                                                default:
                                                    System.out.println("Opção invalida");
                                            }
                                            break;
                                        case 3:
                                            System.out.print("""

                                                    Menu Listar
                                                    -----------------------------
                                                    1 - Listar Professores
                                                    2 - Listar Diretores
                                                    3 - Listar Alunos
                                                    4 - Listar Cursos
                                                    5 - Listar Turmas
                                                    Escolha a operação desejada:\s""");
                                            switch (ScannerUtil.nextInt()) {
                                                case 1:
                                                    dadosProfessores.listarProfessor();
                                                    break;
                                                case 2:
                                                    dadosDiretor.listarDiretor();
                                                    break;
                                                case 3:
                                                    dadosAlunos.listarAluno();
                                                    break;
                                                case 4:
                                                    dadosCursos.listarCursos();
                                                    break;
                                                case 5:
                                                    dadosTurmas.listarTurmas();
                                                    break;
                                                default:
                                                    System.out.println("Opção invalida");
                                            }
                                            break;

                                        case 4:
                                            dadosDiretor.getDiretores().get(0).promoverProfessor(dadosProfessores);
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
                                            dadosAlunos.criarAluno();
                                            break;
                                        case 2:
                                            dadosAlunos.removerAlunoTurma();
                                            break;
                                        case 3:
                                            dadosAlunos.listarAluno();
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
                                        dadosCursos.listarCursos();
                                        break;
                                    case 2:
                                    	alunoLogado.ativarMatricula();
                                        break;
                                    case 3:
                                    	alunoLogado.trancarMatricula();
                                        break;
                                    case 4:
                                        dadosCursos.escolherCurso(alunoLogado);
                                        break;
                                    case 0:
                                        break LOOPMENUALUNO;
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
}

//Para testes:
//Aluno a = new Aluno("Gabi", 37);
//Professor p = new Professor("André", 28, 3, 3000);
//Curso c = new Curso("Java");
//Turma t = new Turma();
//Diretor d = new Diretor(1000, "Cesar", 8);
//Funcionario f = new Funcionario("Andrezza", 2500, 1);

