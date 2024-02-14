public class Diretor extends Funcionario{
    private int tempoCargo;

    public Diretor(float salario, String nome) {
        super(nome, salario);
    }

    public int getTempoCargo() {
        return tempoCargo;
    }

    public void setTempoCargo(int tempoCargo) {
        this.tempoCargo = tempoCargo;
    }
}
