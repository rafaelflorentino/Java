package Annotation;

@Sintese(objetivo="Essa classe é para guardar os dados de uma pessoa!!!",
	entrada={"Valor A" ,"Valor B"},
	saida="Tres valores",
	valor=32)

public class Pessoa {
	@Texto(tamanho=10)
	public String nome;
	@Numero(min=10, max=150)
	private int idade;
}