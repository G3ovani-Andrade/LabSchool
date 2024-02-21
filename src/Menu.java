public class Menu {

    public static void menuProfessor(DadosAluno dadosAlunos, DadosTurma dadosTurma) {
        System.out.print("""

                Menu Professor
                -----------------------------
                1 - Adicionar Aluno a Turma
                2 - Remover Aluno da Turma
                3 - Listar Alunos
                0 - Voltar Menu Inicial
                Escolha a operação desejada:\s""");
        switch (ScannerUtil.nextInt()) {
            case 1:
                dadosTurma.adicionarAlunoTurma(dadosAlunos);
                break;
            case 2:
                dadosTurma.removerAlunoTurma();
                break;
            case 3:
                dadosAlunos.listarAluno();
                break;
            case 0:
                return;
        }
        Menu.menuProfessor(dadosAlunos, dadosTurma);
    }

    public static void menuAluno(DadosCurso dadosCursos, Aluno alunoLogado) {
            System.out.print("""
    
                    Menu Aluno
                    -----------------------------
                    1 - Listar Cursos
                    2 - Ativar Matrícula
                    3 - Trancar Matrícula
                    4 - Entrar Turma
                    0 - Voltar Menu Inicial
                    Escolha a operação desejada:\s""");
            switch (ScannerUtil.nextInt()) {
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
                    System.out.println("Voltando ao menu inicial.");
                    return;
            }
            Menu.menuAluno(dadosCursos, alunoLogado);
    }

    public static void menuDiretor(DadosProfessor dadosProfessores, DadosTurma dadosTurmas, DadosAluno dadosAlunos, DadosCurso dadosCursos, DadosDiretor dadosDiretor) {
        System.out.print("""

                Menu Diretor
                -----------------------------
                1 - Adicionar
                2 - Remover
                3 - Listar
                4 - Promover Professor
                0 - Voltar Menu Inicial
                Escolha a operação desejada:\s""");
        switch (ScannerUtil.nextInt()) {
            case 1:
                Menu.menuDiretorAdicionar(dadosProfessores, dadosTurmas, dadosAlunos, dadosCursos, dadosDiretor);
                break;
            case 2:
                Menu.menuDiretorRemover(dadosProfessores, dadosTurmas, dadosAlunos, dadosCursos, dadosDiretor);
                break;
            case 3:
                Menu.menuDiretorListar(dadosProfessores, dadosTurmas, dadosAlunos, dadosCursos, dadosDiretor);
                break;
            case 4:
                dadosDiretor.getDiretores().get(0).promoverProfessor(dadosProfessores);
                break;
            case 0:
                return;
        }
        Menu.menuDiretor(dadosProfessores, dadosTurmas, dadosAlunos, dadosCursos, dadosDiretor);
    }

    private static void menuDiretorAdicionar(DadosProfessor dadosProfessores, DadosTurma dadosTurmas, DadosAluno dadosAlunos, DadosCurso dadosCursos, DadosDiretor dadosDiretor) {
        System.out.print("""
                -----------------------------
                Menu adicionar:
                1 - Adicionar Professor
                2 - Adicionar Aluno
                3 - Adicionar Curso
                4 - Adicionar Turma
                5 - Adicionar Diretor
                0 - Voltar Menu Diretor
                Escolha opção desejada:\s""");
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
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    private static void menuDiretorRemover(DadosProfessor dadosProfessores, DadosTurma dadosTurmas, DadosAluno dadosAlunos, DadosCurso dadosCursos, DadosDiretor dadosDiretor) {
        System.out.print("""

                Menu Remover
                -----------------------------
                1 - Remover Professores
                2 - Remover Alunos
                3 - Remover Cursos
                4 - Remover Turmas
                5 - Remover Diretores
                0 - Voltar Menu Diretor
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
            case 0:
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    private static void menuDiretorListar(DadosProfessor dadosProfessores, DadosTurma dadosTurmas, DadosAluno dadosAlunos, DadosCurso dadosCursos, DadosDiretor dadosDiretor) {
        System.out.print("""

                Menu Listar
                -----------------------------
                1 - Listar Professores
                2 - Listar Diretores
                3 - Listar Alunos
                4 - Listar Cursos
                5 - Listar Turmas
                0 - Voltar Menu Diretor
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
            case 0:
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}