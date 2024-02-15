public class Funcionario implements IFuncionario{
    private String nome;
    private float salario;
    private int tempoCargo;
    private CargoFuncionario cargo;

    public Funcionario(String nome, float salario, int tempoCargo) {
        this.nome = nome;
        this.salario = salario;
        this.tempoCargo = tempoCargo;
        this.cargo = CargoFuncionario.INICIANTE;
    }

    @Override
    public void promover() {
        if (this.cargo == CargoFuncionario.valueOf("INICIANTE")){
            this.cargo = CargoFuncionario.EXPERIENTE;
        } else if (this.cargo == CargoFuncionario.valueOf("EXPERIENTE")) {
            this.cargo = CargoFuncionario.AVANÇADO;
        } else{
            System.out.println("O funcionário ja é avançado!");
        }
    }

    public static void listarCargo(){
        for (CargoFuncionario cargo : CargoFuncionario.values()){
            System.out.println(cargo);
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getTempoCargo() {
        return tempoCargo;
    }

    public void setTempoCargo(int tempoCargo) {
        this.tempoCargo = tempoCargo;
    }

    public CargoFuncionario getCargo() {
        return cargo;
    }
}