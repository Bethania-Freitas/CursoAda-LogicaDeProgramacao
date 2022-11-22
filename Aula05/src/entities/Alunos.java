package entities;

public class Alunos {
	
	public String matricula;
	public double nota1;
	public double nota2;
	public double nota3;
	public double nota4;
	
	public double media() {
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}

	

}
