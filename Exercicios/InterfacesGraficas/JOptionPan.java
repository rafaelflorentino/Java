/* 
  Objetivo: Crie um programa em java, com uma janela que receba um nome, e imprima na tela, pergunte se dejesa sai do programa.
  Entrada: Nome.
  Saida: Nome.
  Autor: Rafael Florentino.
*/
package InterfacesGraficas;

import javax.swing.JOptionPane;

public class JOptionPan {
    public static void main(String[] args) {
        String nome = null;
        int resposta;

        nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        resposta = JOptionPane.showConfirmDialog(null, "O seu nome é " + nome + "?");

        if (resposta == JOptionPane.YES_OPTION) {
        // verifica se o usuário clicou no botão YES
            JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
        }
        if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Seu nome não é " + nome);
        }
        if (resposta == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "VC Cancelou ");
        }
        // Fechar o programa
        Object[] opcoes3 = { "sim", "não" };
        Object resp;
        do {
            resp = JOptionPane.showInputDialog(null,
                    "Deseja finalizar o programa?",
                    "Finalização",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcoes3,
                    "não");
        } while (resp == null || resp.equals("não"));
    }
}