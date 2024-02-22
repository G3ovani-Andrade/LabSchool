public class Main {
    public static void main(String[] args) {

        DadosTurma dadosTurmas = new DadosTurma();
        DadosCurso dadosCursos = new DadosCurso();
        DadosAluno dadosAlunos = new DadosAluno();
        DadosProfessor dadosProfessores = new DadosProfessor();
        DadosDiretor dadosDiretor = new DadosDiretor();
        Menu.padrao(dadosTurmas, dadosCursos, dadosAlunos, dadosProfessores, dadosDiretor);


        SISTEMA:
        while (true) {
            System.out.print("""

                    Menu Inicial
                    -----------------------------
                    1 - Funcionário
                    2 - Aluno
                    0 - Sair
                    Escolha o tipo do usuário:\s""");
            switch (ScannerUtil.nextInt()) {
                case 1:
                    System.out.print("""

                            Menu Entrada
                            -----------------------------
                            1 - Login
                            2 - Cadastro
                            0 - Voltar Menu Inicial
                            Escolha opção desejado:\s""");
                    switch (ScannerUtil.nextInt()) {
                        case 1:
                            System.out.print("""

                                    Menu Tipo Funcionário
                                    -----------------------------
                                    1 - Diretor
                                    2 - Professor
                                    0 - Voltar Menu Inicial
                                    Escolha o tipo funcionário:\s""");
                            switch (ScannerUtil.nextInt()) {
                                case 1:
                                    boolean retornoLoginDiretor = dadosDiretor.loginDiretor();
                                    if (retornoLoginDiretor) {
                                        Menu.menuDiretor(dadosProfessores, dadosTurmas, dadosAlunos, dadosCursos, dadosDiretor);
                                    }
                                    break;
                                case 2:
                                    boolean retornoLoginProfessor = dadosProfessores.loginProfessor();
                                    if (retornoLoginProfessor) {
                                        Menu.menuProfessor(dadosAlunos, dadosTurmas);
                                    }
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

                                    Menu Tipo Funcionário
                                    -----------------------------
                                    1 - Diretor
                                    2 - Professor
                                    0 - Voltar Menu Inicial
                                    Escolha o tipo funcionário:\s""");
                            switch (ScannerUtil.nextInt()) {
                                case 1:
                                    dadosDiretor.criarDiretor();
                                    break;
                                case 2:
                                    dadosProfessores.criarProfessor();
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
                            System.out.println("Voltando ao menu inicial.");
                            break;
                        default:
                            System.out.println("\u001B[31m" + "Opção inválida!" + "\u001B[0m");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("""

                            Menu Entrada Aluno
                            -----------------------------
                            1 - Login
                            2 - Cadastro
                            0 - Voltar Menu Inicial
                            Escolha opção desejado:\s""");
                    switch (ScannerUtil.nextInt()) {
                        case 1:
                            Aluno alunoLogado = dadosAlunos.loginAluno();
                            if (alunoLogado != null) {
                                Menu.menuAluno(dadosCursos, alunoLogado);
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
                    break SISTEMA;
                default:
                    System.out.println("\u001B[31m" + "Opção inválida!" + "\u001B[0m");
                    break;
            }
        }
    }
}