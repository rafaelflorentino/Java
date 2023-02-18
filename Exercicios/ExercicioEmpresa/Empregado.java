package ExercicioEmpresa;

public class Empregado {
    
	private String nome;
	private float salario;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return (float)(salario * 1.1);
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
}
