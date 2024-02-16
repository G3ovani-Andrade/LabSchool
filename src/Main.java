import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DadosProfessor d = new DadosProfessor();

        d.criarProfessor(scanner);
        d.removerProfessor(scanner);
    }
}

//Para testes:
//Aluno a = new Aluno("Gabi", 37);
//Professor p = new Professor("André", 28, 3, 3000);
//Curso c = new Curso("Java");
//Turma t = new Turma();
//Diretor d = new Diretor(1000, "Cesar", 8);
//Funcionario f = new Funcionario("Andrezza", 2500, 1);