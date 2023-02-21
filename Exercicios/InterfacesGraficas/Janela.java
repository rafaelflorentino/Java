/* 
  Objetivo: Crie um programa em java, com uma janela.
  Entrada: Sem entrada.
  Saida: Sem saida.
  Autor: Rafael Florentino.
*/
package InterfacesGraficas;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Janela extends JFrame{
	public Janela(){
		//JFrame frame =new JFrame(); 
		super("Minha Janela"); // Deu extends por isso nao precisa mais declarar o frame pois a janela já é o frame
		
		JButton botao = new JButton("Clique");
	    /*frame.*/getContentPane().add(botao); 	
	    /*frame.*/setSize(300,300);
	    /*frame.*/setVisible(true);
	    /*frame.*/setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Janela();
	}
}
