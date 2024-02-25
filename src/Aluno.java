public class Aluno {
    private String nome;
    private int idade;
    private StatusMatricula statusMatricula;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.statusMatricula = StatusMatricula.ATIVO;
    }

    public void ativarMatricula(){
    	if(this.statusMatricula.equals( StatusMatricula.ATIVO )) {
    		System.out.println( "Aluno já está com a matricula Ativa!" );		
    	}else if(this.statusMatricula.equals( StatusMatricula.FORMADO )){
    		System.out.println( "Aluno já formado! matricula não pode ser alterada!" );
    	}else {
    		this.statusMatricula = StatusMatricula.ATIVO;
    		System.out.println("Aluno Ativo");    		
    	}
    }

    public void trancarMatricula(){
    	if( this.statusMatricula.equals( StatusMatricula.TRANCADO )) {
    		System.out.println( "Aluno já está com a matricula Trancada!" );		
    	}else if(this.statusMatricula.equals( StatusMatricula.FORMADO )){
    		System.out.println( "Aluno já formado! matricula não pode ser alterada!" );
    	}else {
    		this.statusMatricula = StatusMatricula.TRANCADO;
            System.out.println("Matrícula do aluno trancada");
    	}
    }

    public void formarMatricula(){
    	if(this.statusMatricula.equals( StatusMatricula.FORMADO)){
    		System.out.println( "Aluno já esta formado!" );
    	}else {
    		this.statusMatricula = StatusMatricula.FORMADO;
            System.out.println("Parabéns! Aluno formado!");
    	}
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade +
                "\nStatus da Matricula: " + statusMatricula;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void escolherCurso(Curso cursoEscolhido) {
    }

	public StatusMatricula getStatusMatricula()
	{
		return statusMatricula;
	}
    
}
