/* 
  Objetivo: Crie um programa em java que receba o nome e a idade da pessoa por args antes de iniciar o programa e imprima.
  Observação: Precisa mandar os argumentos pelo terminal: java RecebendoArgs "rafael" 29 
  Entrada: Sem entrada.
  Saida: Mensagem, Nome e idade.
  Autor: Rafael Florentino.
*/
import javax.swing.JOptionPane;
public class RecebendoArgs {	
	public static void main(String[] args){
		String frase="Bom dia "+args[0]+" voce tem "+args[1]+" anos de idade";
		System.out.println(frase);
		JOptionPane.showMessageDialog(null,frase);
		System.exit(0); // Sempre usar System.exit para fechar o JOptionPane na memória do pc.
		
	}

}
