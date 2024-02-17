import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DadosAluno dadosAlunos = new DadosAluno();
        DadosProfessor dadosProfessores = new DadosProfessor();
        DadosDiretor dadosDiretor = new DadosDiretor();

        System.out.print("""
                                    
                    Menu Inicial
                    -----------------------------
                    1 - Funcionário
                    2 - Aluno
                    0 - Sair
                    Digite o tipo do usuário:\s""");
        int tipoUsuario = scanner.nextInt();
        switch (tipoUsuario) {
            case 1:
                System.out.print("""
                                    
                    Menu Inicial
                    -----------------------------
                    1 - Login
                    2 - Cadastro
                    0 - Sair
                    Digite opção desejado:\s""");
                switch (scanner.nextInt()) {
                    case 1:
                        //Abstrair para classe
//                        System.out.print("""
//
//                        Menu Login
//                        -----------------------------
//                        Digite nome do usuário:\s""");
//                        String nomeLogin = scanner.next();
                        break;
                    case 2:
                        //Abstrair para classe
//                        System.out.print("""
//
//                        Menu Cadastro
//                        -----------------------------
//                        Digite nome do usuário:\s""");
//                        String nomeCadastro = scanner.next();
//                        System.out.print("Digite o salário do usuário: ");
//                        float salarioCadastro = scanner.nextFloat();
//                        System.out.print("Digite o tempo de cargo do usuário: ");
//                        int tempoCargoCadastro = scanner.nextInt();
//                        System.out.print("""
//
//                        1 - INICIANTE
//                        2 - EXPERIENTE
//                        3 - AVANÇADO
//                        Digite o cargo do usuário:\s""");
//                        CargoFuncionario cargoCadastro = CargoFuncionario.values()[scanner.nextInt()-1];
                        break;
                    case 0:
                        System.out.println("Sistema encerrado.");
                        break;
                    default:
                        System.out.println("\u001B[31m" + "Opção inválida!" + "\u001B[0m");
                        break;
                }
                break;
            case 2:
                System.out.print("""
                                    
                    Menu Inicial
                    -----------------------------
                    1 - Login
                    2 - Cadastro
                    0 - Sair
                    Digite opção desejado:\s""");
                switch (scanner.nextInt()) {
                    case 1:
                        //Aluno login
                        break;
                    case 2:
                        //Aluno cadastro
                        break;
                    case 0:
                        //Sair
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