/* 
  Objetivo: Crie um programa em java que mude a imagem de acordo com a opção selecionada: familia, manga, carro, avião.
  Entrada: Sem entrada.
  Saida: Imagem selecionada.
  Autor: Rafael Florentino.
*/
package Interfaces;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleCombo extends JFrame implements ItemListener {
    JComboBox<String> combo;
    JLabel label;
    ImageIcon[] imagens = {
            new ImageIcon(getClass().getResource("imgs/familia.jpg")),
            new ImageIcon(getClass().getResource("imgs/manga.png")),
            new ImageIcon(getClass().getResource("imgs/carro.jpg")),
            new ImageIcon(getClass().getResource("imgs/aviao.jpg"))
    };

    public ControleCombo() {
        super("Album de Fotos");

        Container c = getContentPane();
        combo = new JComboBox<String>();
        combo.setFont(new Font("Serif", Font.PLAIN, 26));
        combo.addItem("Familia");
        combo.addItem("Manga");
        combo.addItem("Carro");
        combo.addItem("Avião");
        combo.addItemListener(this);

        label = new JLabel(imagens[0]);

        c.add(BorderLayout.NORTH, combo);
        c.add(BorderLayout.CENTER, label);

        setSize(350, 550);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ControleCombo();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            label.setIcon(imagens[combo.getSelectedIndex()]);
        }
    }
}
