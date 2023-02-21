/* 
  Objetivo: Crie um programa em java com 2 radio bottom: masculino e femenino, e um botão de ok, quando o usuario selecionar um 
  radio botão aparecer um janela com a mensagem conendo o sexo selecionado.
  Entrada: Sem entrada.
  Saida: Sem saida.
  Autor: Rafael Florentino.
*/
package InterfacesGraficas;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButton extends JFrame  {
	JLabel texto;	
	JButton ok;
	JRadioButton botao1, botao2;  
	ButtonGroup bg;
    String sexo;

    public RadioButton() {  
        super("Testando Radio Buttons");  
        Container c= getContentPane();
		c.setLayout(new GridLayout(2,1));
        
        texto=new JLabel("  SEXO");
        ok=new JButton("ok");
		ok.addActionListener(new BotaoOK1Listener());
        
        bg = new ButtonGroup();
        
        botao1 = new JRadioButton("Masculino");
        botao2 = new JRadioButton("Femenino");
        
        bg.add(botao1);  
        bg.add(botao2);  
        
        botao1.setActionCommand("Masculino");  
        botao2.setActionCommand("Feminino"); 
         
        Container c2= new JPanel();
		c2.setLayout(new GridLayout(1,3));
		c2.add(texto);
		c2.add(botao1);
		c2.add(botao2);
        
		c.add(c2);
	    c.add(ok);
		   
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setSize(300, 80);  
    	setVisible(true);
 
           }

	public static void main(String[] args) {
      new RadioButton();  
	}

	class BotaoOK1Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {				
			 sexo=bg.getSelection().getActionCommand();
                    
             if(sexo =="Masculino"){
             	JOptionPane.showMessageDialog(null, "Você selecionou o sexo: Masculino ");  
             	
             }else {
             	JOptionPane.showMessageDialog(null, "Você selecionou o sexo: Feminino ");  
             }
		}
	}
}