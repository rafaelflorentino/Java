/* 
  Objetivo: Crie um programa em java, com um layer, tolltip, fonte aazul, imagem
  Entrada: Sem entrada.
  Saida: Layer na tela.
  Autor: Rafael Florentino.
*/
package InterfacesGraficas;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleLabel extends JFrame {
    public ControleLabel() {

        JLabel simples = new JLabel("Label Simples");
        simples.setToolTipText("Meu Toltip");

        Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 28);
        JLabel label = new JLabel("Label Simples");
        label.setFont(fonte);
        label.setForeground(Color.BLUE);

        ImageIcon icon = new ImageIcon(getClass().getResource("imgs/lampada2.gif"));
        JLabel imagem = new JLabel(icon);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(simples);
        c.add(label);
        c.add(imagem);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ControleLabel();
    }

}
