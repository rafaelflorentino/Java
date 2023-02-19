package InterfacesGraficas;
/* 
  Objetivo: Crie um programa em java com interface que pareça uma calculadora.
  Entrada: Sem entrada.
  Saida: Numeros.
  Autor: Rafael Florentino.
*/
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame {

    public Calculadora() {
        super("Calculadora");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        Container c2 = new JPanel();
        c2.setLayout(new GridLayout(4, 4, 5, 5));
        c2.add(new JButton("7"));
        c2.add(new JButton("8"));
        c2.add(new JButton("9"));
        c2.add(new JButton("/"));
        c2.add(new JButton("4"));
        c2.add(new JButton("5"));
        c2.add(new JButton("6"));
        c2.add(new JButton("*"));
        c2.add(new JButton("1"));
        c2.add(new JButton("2"));
        c2.add(new JButton("3"));
        c2.add(new JButton("-"));
        c2.add(new JButton("0"));
        c2.add(new JButton("."));
        c2.add(new JButton("="));
        c2.add(new JButton("+"));

        JTextField display = new JTextField();
        display.setFont(new Font("serif", Font.PLAIN, 26));

        c.add(BorderLayout.NORTH, display);
        c.add(BorderLayout.CENTER, c2);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculadora();
    }

}
