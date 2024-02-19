import java.util.Scanner;

public class MainAdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DadosTurma dadosTurma = new DadosTurma(scanner);
        DadosCurso dadosCurso = new DadosCurso(scanner);
        DadosAluno dadosAluno = new DadosAluno(scanner);
        DadosProfessor dadosProfessor = new DadosProfessor(scanner);
        DadosDiretor dadosDiretor = new DadosDiretor(scanner);

        while (true) {
            System.out.println("""
                    -----------------------------
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
                    dadosProfessor.criarProfessor();
                    break;
                case 2:
                    dadosAluno.criarAluno();
                    break;
                case 3:
                    dadosCurso.criarCurso();
                    break;
                case 4:
                    dadosTurma.criarTurma();
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
    }

}



