package Escola;

import java.io.Serializable;

abstract public class Diretor implements Comparable<Diretor>, Serializable{
	private String nome;
	private int idade;
	private String cpf;
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Diretor){
			Diretor diretor = (Diretor)obj;
			if(getCpf() != null && diretor.getCpf()!= null){
				return (getCpf().trim().toUpperCase().equals(diretor.getCpf().trim().toUpperCase()));
			}
		}
		return false;
		
	}
	
	
	
	@Override
	public String toString() {
		return "\n Nome: " + getNome() 
				+ "\nIdade: " + getIdade() + ""
				+ "\nCpf: " + getCpf();
	}

	abstract public int getIndice();
	
	@Override
	public int compareTo(Diretor o) {
		return getIndice() - o.getIndice();
	}
	
	public Diretor() {
		// TODO Auto-generated constructor stub
	}
	public Diretor(String nome, int idade, String cpf) {
		setNome(nome);
		setIdade(idade);
		setCpf(cpf);
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
