package AnnotationService.beans;

import AnnotationService.annotations.NaoNulo;
import AnnotationService.annotations.Numero;
import AnnotationService.annotations.Texto;

public class Alguem {

	@Numero(max = 150, min = 1)
	private int idade;
	
	@NaoNulo
	@Texto(tamanhoMax = 50)
	private String nome;
	
	@Texto(tamanhoMax = 1)
	private String outro;
	
	@Override
	public String toString() {
		return "Alguem "+getIdade()+" nome: "+getNome();
	}
	public Alguem(int idade, String nome) {
		setIdade(idade);
		setNome(nome);
	}
	
	public String getOutro() {
		return outro;
	}
	public void setOutro(String outro) {
		this.outro = outro;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
