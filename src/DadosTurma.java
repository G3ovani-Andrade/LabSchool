import java.util.ArrayList;

public class DadosTurma {
    private ArrayList<Turma> turmas = new ArrayList<>();

    public void removerTurma() {
        int escolha = listarEscolherTurma();
        this.turmas.remove(escolha);
    }

    public void listarTurmas() {
        for (Turma turma : turmas) {
            System.out.println(turmas.indexOf(turma) + " - " + turma.getNomeTurma());
        }
    }

    public int listarEscolherTurma() {
        listarTurmas();
        System.out.print("Escolha uma opção: ");
        int escolha = ScannerUtil.nextInt();
        if(escolha < turmas.size()){
            return escolha;
        }
        return listarEscolherTurma();
    }

    public void adicionarTurma(Turma nomeTurma) {

        this.turmas.add(nomeTurma);
    }

    public void criarTurma(DadosCurso dadosCurso) {
        System.out.println("Criar nova Turma:");
        System.out.print("Nome da Turma: ");
        String nomeTurma = ScannerUtil.nextLine();
        System.out.println("Escolha o curso que sera vinculado a essa turma:");
        Curso curso = dadosCurso.getCursos().get(dadosCurso.listarEscolherCurso());

        System.out.println("Nova turma criada");

        adicionarTurma(new Turma(nomeTurma, curso));
    }

    public void removerAlunoTurma() {
        System.out.println("Escolha a turma que tera um aluno removido:");
        int escolhaTurma = listarEscolherTurma();
        System.out.println("Escolha o aluno que sera removido:");
        Aluno escolhaAluno = turmas.get(escolhaTurma).listarEscolherAlunosTurma();
        turmas.get(escolhaTurma).removerAluno(escolhaAluno);
    }

    public void adicionarAlunoTurma(DadosAluno dadosAluno) {
        System.out.println("Escolha a turma que tera um aluno adicionado:");
        int escolhaTurma = listarEscolherTurma();
        System.out.println("Escolha o aluno que sera adicionado:");
        int escolhaAluno = dadosAluno.listarEscolherAluno();
        turmas.get(escolhaTurma).adicionarAluno(dadosAluno.getAlunos().get(escolhaAluno));
    }
}
