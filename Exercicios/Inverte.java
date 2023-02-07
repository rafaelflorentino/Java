
/* 
  Objetivo: Crie um programa em java que receba uma mensagem e a inverta depois imprima na tela.
  Entrada: Mensagem.
  Saida: Mensagem invertida.
  Autor: Rafael Florentino.
*/
import javax.swing.JOptionPane;

public class Inverte {

	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog("Informe a frase");
		String fraseinvertida = "";

		for (int i = frase.length() - 1; i >= 0; i--) {
			fraseinvertida += frase.charAt(i);
		}
		JOptionPane.showMessageDialog(null, fraseinvertida);
	}
}
