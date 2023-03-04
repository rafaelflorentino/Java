/* 
  Objetivo: Crie um programa em java onde uma classe revebe um objeto intancisao de outra classe.
  Entrada: Sem entrada.
  Saida: Nome, idade, cpf. 
  Autor: Rafael Florentino.
*/
package Escola;

import java.util.ArrayList;

public class TestMain {
	public static void main(String[] args) {
		Interno i = new Interno();
		i.setCpf("1");
		i.setNome("Jair Barbosa");
		i.setIdade(Integer.MAX_VALUE);
		
		Interno a = new Interno();
		a.setCpf("2");
		a.setNome("Jabosa Barbosa");
		a.setIdade(Integer.MAX_VALUE - 90);

		Externo e = new Externo();
		e.setCpf("3");
		e.setNome("Dart Vandor");
		e.setIdade(Integer.MAX_VALUE - 150);
		
		ArrayList<Diretor> diretores = new ArrayList<Diretor>();
		diretores.add(a);
		diretores.add(i);
		diretores.add(e);
		
		Direcao direcaoBSI = new Direcao();
		direcaoBSI.setDiretores(diretores);
		System.out.println(direcaoBSI.getDiretores());
		
		diretores = direcaoBSI.findByIdade(Integer.MAX_VALUE - 50);
		System.out.println(diretores);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
