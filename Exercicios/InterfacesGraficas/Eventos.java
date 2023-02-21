/* 
  Objetivo: Crie um programa em java, que tenha um botão e quando clicado mude o texto do botao, para botão clicado.
  Entrada: Sem entrada.
  Saida: Mensagem de clicado.
  Autor: Rafael Florentino.
*/
package InterfacesGraficas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Eventos extends JFrame implements ActionListener{
	    JButton botao;
		public Eventos(){
			super("Eventos");
			
		    botao= new JButton("Clique Aqui");
			botao.addActionListener(this);
			getContentPane().add(botao);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setSize(300,300);
			setVisible(true);
		}
	public static void main(String[] args) {
		   new Eventos();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		botao.setText("Foi Clicado");
		System.out.print("\nCLicou no botao");
	}
}
