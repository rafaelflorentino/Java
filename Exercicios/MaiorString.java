
/* 
  Objetivo: Crie um programa em java que verifique entre duas array qual e a maior e quantos elementos ela tem, mostre mensagem. 
  Entrada: Sem entrada.
  Saida: Mensagem.
  Autor: Rafael Florentino.
*/
import javax.swing.JOptionPane;

public class MaiorString {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 1, 2, 3, 4, 5 };

		if (array1.length > array2.length) {
			JOptionPane.showMessageDialog(null, " Array1 tem o  maior tamanho"); 
			JOptionPane.showMessageDialog(null, "A array1 tem: " + array1.length + " Elementos");
		}

		if (array2.length > array1.length) {
			JOptionPane.showMessageDialog(null, " Array2 tem o  maior tamanho");
			JOptionPane.showMessageDialog(null, "A array2 tem: " + array2.length + " Elementos");
		}
		System.exit(0); // Sempre usar System.exit para fechar o JOptionPane na memória do pc.
	}

}