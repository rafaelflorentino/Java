/* 
  Objetivo: Crie um programa em java, com uma janela,e um campo de input de texto.
  Entrada: Nome.
  Saida: Sem saida.
  Autor: Rafael Florentino.
*/
package InterfacesGraficas;
import javax.swing.*;
public class JFrameLog {
    public static void main(String[] args) {
        // instância um objeto do tip o JFrame
        JFrame janela = new JFrame("Minha Primeira Janela");
        JPanel painel = new JPanel();
        JLabel titulo = new JLabel("Hello world");
        JTextField texto = new JTextField(20);

        painel.add(titulo);
        painel.add(texto);

        janela.setContentPane(painel);
        janela.setSize(400, 200);
        janela.setVisible(true);

        // Variável que recebera o dado digitado pelo usuário
        String Nome;
        Nome = texto.getText();
        System.out.print(Nome);
    }
}