public class Diretor extends Funcionario{

    public Diretor(float salario, String nome, int tempoCargo) {

        super(nome, salario, tempoCargo);
    }
    public Diretor(String nome) {
        super(nome, 3210.00f);
    }

    public void promoverProfessor(DadosProfessor dadosProfessor) {
        int indexProfessor = dadosProfessor.listarEscolherProfessor();
        Professor professor =  dadosProfessor.getProfessor().get(indexProfessor);
        professor.promover();
    }
}
