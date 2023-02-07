/* 
  Objetivo: Crie um programa em java que imprima na tela meu primeiro programa.
  Entrada: Sem entrada.
  Saida: Mensagem na tela.
  Autor: Rafael Florentino.
*/
import javax.swing.JOptionPane;
public class JoptionPane {
	public static void main(String[] args){
		System.out.println("Meu primeiro programa!!!");
		JOptionPane.showMessageDialog(null,"Meu primeiro programa"); // Sai uma caixa se mensagem.
		System.exit(0); // Sempre usar System.exit para fechar o JOptionPane na memória do pc.
		
	}

}
