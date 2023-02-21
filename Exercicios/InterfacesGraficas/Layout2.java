/* 
  Objetivo: Crie um programa em java um layout com 5 botões.
  Entrada: Sem entrada.
  Saida: Sem saida.
  Autor: Rafael Florentino.
*/
package InterfacesGraficas;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout2 extends JFrame {

    public Layout2() {
        super("Layout2");
        Container c = getContentPane();

        c.setLayout(new GridLayout(5, 1));
        c.add(new JButton("1"));
        c.add(new JButton("2"));
        c.add(new JButton("3"));
        c.add(new JButton("4"));
        c.add(new JButton("5"));

        /*
         * Container c = getContentPane();
         * c.setLayout(new BorderLayout());
         * 
         * Container c2 =new JPanel();
         * c2.setLayout(new GridLayout(4,1));
         * c2.add(new JButton("OK"));
         * c2.add(new JButton("Cancel"));
         * c2.add(new JButton("Setup"));
         * c2.add(new JButton("Help"));
         * 
         * c.add(BorderLayout.CENTER,new JButton("centro"));
         * c.add(BorderLayout.EAST,c2);
         */
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Layout2();
    }
}
