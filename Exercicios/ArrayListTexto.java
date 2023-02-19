/* 
  Objetivo: Crie um programa em java que crie uma Collection e adicione remova elementos.
  Entrada: Sem entrada.
  Saida: Nome, idade, letras.
  Autor: Rafael Florentino.
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ArrayListTexto {

	public static void main(String[] args) {
       
		Collection<String> c = new ArrayList<>();

		c.add("A");
		c.add("E");
		c.add("I");

		System.out.println(c.toString());
		System.out.println(c.contains("E"));
		System.out.println(c.isEmpty());
		
		c.remove("A");
		System.out.println(c.toString());
				
		Collection<String> c2 =  Arrays.asList("O","U");
		c.addAll(c2);
		System.out.println(c.toString());
		
		String Nome="Rafael";
		String Nome2="Daniel";
		int idade=26;
		int idade2=29;
		
		Collection<String> nome1 = new ArrayList<>();
		nome1.add(Nome);
		nome1.add(Nome2);
		
		Collection<Integer> idade1 = new ArrayList<>();
		idade1.add(idade);
		idade1.add(idade2);
		
		
		System.out.println(nome1.toString()); 
		System.out.println(idade1.toString()); 

	}
}
