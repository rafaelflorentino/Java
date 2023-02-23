/* 
  Objetivo: Crie um programa em java que utilize bordas em um janela e um fundo vermelho.
  Entrada: Sem entrada.
  Saida: Janela com bordas e fundo vermelho.
  Autor: Rafael Florentino.
*/
package InterfacesGraficas;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Borda extends JFrame {

    JPanel mainPanel;
    JLabel titulo, t2, t3, t4;

    Borda() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        mainPanel.setBorder(new TitledBorder("Cadastro"));
        mainPanel.setSize(200, 200);
        mainPanel.setBackground(Color.red);

        TitledBorder border = new TitledBorder("Cadastro de Clientes");
        border.setTitleColor(Color.BLUE);

        titulo = new JLabel("afdfasdfas");
        titulo.setBorder(new TitledBorder("Cadastro"));
        t2 = new JLabel("dois");
        t2.setBorder(border);

        t3 = new JLabel("tres");
        t3.setBorder(new TitledBorder("Cadastro"));
        t3.setSize(55, 55);

        t4 = new JLabel("quatro");

        mainPanel.add(t3);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(BorderLayout.NORTH, t2);
        c.add(BorderLayout.CENTER, mainPanel);
        c.add(BorderLayout.SOUTH, titulo);

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(470, 150);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Borda();
    }
}
