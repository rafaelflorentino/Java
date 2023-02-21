/* 
  Objetivo: Crie um programa em java um layout com 3 botoes.
  Entrada: Sem entrada.
  Saida: Sem saida.
  Autor: Rafael Florentino.
*/
package InterfacesGraficas;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout extends JFrame {
		public Layout(){
			super("Layouts");
			
			Container c = getContentPane();
			c.add(BorderLayout.NORTH,new JButton("1"));
			c.add(BorderLayout.CENTER,new JButton("2"));
			c.add(BorderLayout.SOUTH,new JButton("3"));
			
			/*	c.setLayout(new FlowLayout());
			c.add(new JButton("1"));
			c.add(new JButton("2"));
			c.add(new JButton("3"));  */
			
			setSize(300,300);
		    setVisible(true);
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
	
	public static void main(String[] args) {
		new Layout();	
	}
}
