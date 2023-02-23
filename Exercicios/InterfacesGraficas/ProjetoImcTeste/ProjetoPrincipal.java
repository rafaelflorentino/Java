/* 
  Objetivo: Crie um programa em java que realize uma pesquisa sobre saúde e esportes, registre os dados e calcule o imc 
  da pessoa, ao final apesente na tela o resultado da pesquisa
  Entrada: Dados do usuario.
  Saida: Resultado da pesquisa.
  Autor: Rafael Florentino.
*/
package InterfacesGraficas.ProjetoImcTeste;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ProjetoPrincipal extends JFrame {
    private JButton inserir, sair, listar, resultado, calcular;

    ProjetoPrincipal() {

        super("Principal");
        Container c = getContentPane();
        inserir = new JButton("Inserir Novo Entrevistado");
        inserir.addActionListener(new BotaoInserirListener());

        sair = new JButton("Sair");
        sair.addActionListener(new BotaoSairListener());

        listar = new JButton("Listar Entrevistado");
        listar.addActionListener(new BotaoListarListener());

        resultado = new JButton("Resultado Da Pesquisa");
        resultado.addActionListener(new BotaoResultadoListener());

        calcular = new JButton("Calcular IMC");
        calcular.addActionListener(new BotaoImcListener());

        c.setLayout(new GridLayout(5, 1));
        c.add(inserir);
        c.add(listar);
        c.add(resultado);
        c.add(calcular);
        c.add(sair);

        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(470, 150);
        setResizable(false);
    }

    public static void main(String[] args) {
        new ProjetoPrincipal();
    }

    class BotaoInserirListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            new InserirEntrevistado();
            dispose();
        }
    }

    class BotaoListarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) { 
            new ListarEntrevistado();
            dispose();
        }
    }

    class BotaoResultadoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            new ResultadoPesquisa();
            dispose();
        }
    }

    class BotaoImcListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            new IMC();
            dispose();
        }
    }

    class BotaoSairListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    }
}
