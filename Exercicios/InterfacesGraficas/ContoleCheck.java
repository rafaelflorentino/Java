/* 
  Objetivo: Crie um programa em java que ao marcar no 1 check box o texto mude para italíco, e no 2 o texto mude para negrito.
  Entrada: Sem entrada.
  Saida: Texto.
  Autor: Rafael Florentino.
*/
package InterfacesGraficas;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ContoleCheck extends JFrame{
    JTextField texto;
	JCheckBox bold,italic;
	
	public ContoleCheck(){
		super("Check Box");
		
		 texto = new JTextField("Veja a fonte mudar",12);
		 texto.setFont(new Font("Serif", Font.PLAIN,26));
		 
		 bold = new JCheckBox("Bold");
		 bold.addItemListener(new CheckListener());
		 
		 italic = new JCheckBox("Italic");
		 italic.addItemListener(new CheckListener());

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(texto);
		c.add(bold);
		c.add(italic);
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
	}
	class CheckListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(bold.isSelected()&& italic.isSelected()){
				texto.setFont(new Font("serif",Font.BOLD | Font.ITALIC,26));
			}else if(bold.isSelected()){
				texto.setFont(new Font("serif",Font.BOLD,26));
			}else if(italic.isSelected()){
				texto.setFont(new Font("serif",Font.ITALIC,26));
			}else{
				texto.setFont(new Font("serif",Font.PLAIN,26));
			}			
		}
	}
	
	public static void main(String[] args) {
			new ContoleCheck();		
	}
}




