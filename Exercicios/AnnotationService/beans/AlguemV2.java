package AnnotationService.beans;

import AnnotationService.annotationsV2.NaoNulo;
import AnnotationService.annotationsV2.Numero;
import AnnotationService.annotationsV2.Texto;

public class AlguemV2 {

	@Numero(max = 150, min = 1, msgError="Idade Invalida, deve ser entre 1 e 150")
	private int idade;
	
	@NaoNulo(msgError = "Nome n�o deve ser nulo!")
	@Texto(tamanhoMax = 5, msgError = "Nome Invalido, deve ter no maximo 5 chars")
	private String nome;
	
	@Texto(tamanhoMax = 1, msgError = "Outro n�o pode ter mais que 1 char")
	private String outro;
	
	@Override
	public String toString() {
		return "Alguem "+getIdade()+" nome: "+getNome();
	}
	public AlguemV2(int idade, String nome) {
		setIdade(idade);
		setNome(nome);
		setOutro("ljkhgh");
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
