import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;


public class MenuPrincipal extends JFrame {
    public MenuPrincipal() {

        // Tela Frame configurações

        setTitle("Gerenciador de Frota");
        setVisible(true);
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        // Criando e adicionando texto ao menu

        JLabel textoMenu = new JLabel("Selecione a opção desejada");
        textoMenu.setBounds(300, 0, 250, 70);
        textoMenu.setFont(new Font("SansSerif", Font.ITALIC, 15));

        add(textoMenu);

        // Criando e configurando os botões
 
        JButton jButtonCadastrarVeiculos = new JButton("1 - Cadastrar Veiculo");
        jButtonCadastrarVeiculos.setBounds(280, 50, 250, 70); 
        jButtonCadastrarVeiculos.setFont(new Font("SansSerif", Font.BOLD, 15));
        jButtonCadastrarVeiculos.setBackground(new Color(10, 10, 10));
        jButtonCadastrarVeiculos.setForeground(Color.WHITE);

        JButton jButtonListarVeiculos = new JButton("2 - Listar Veiculos");
        jButtonListarVeiculos.setBounds(280, 150, 250, 70); 
        jButtonListarVeiculos.setFont(new Font("SansSerif", Font.BOLD, 15));
        jButtonListarVeiculos.setBackground(new Color(10, 10, 10));
        jButtonListarVeiculos.setForeground(Color.WHITE);

        JButton jButtonRegistrarDespesas = new JButton("3 - Registrar Despesas");
        jButtonRegistrarDespesas.setBounds(280, 250, 250, 70); 
        jButtonRegistrarDespesas.setFont(new Font("SansSerif", Font.BOLD, 15));
        jButtonRegistrarDespesas.setBackground(new Color(10, 10, 10));
        jButtonRegistrarDespesas.setForeground(Color.WHITE);

        JButton jButtonListarDespesas = new JButton("4 - Listar Despesas");
        jButtonListarDespesas.setBounds(280, 350, 250, 70); 
        jButtonListarDespesas.setFont(new Font("SansSerif", Font.BOLD, 15));
        jButtonListarDespesas.setBackground(new Color(10, 10, 10));
        jButtonListarDespesas.setForeground(Color.WHITE);

        add(jButtonCadastrarVeiculos);
        add(jButtonListarVeiculos);
        add(jButtonRegistrarDespesas);
        add(jButtonListarDespesas);

        jButtonCadastrarVeiculos.addActionListener(this::cadastrarVeiculo);
        jButtonListarVeiculos.addActionListener(this::listarVeiculo);
        jButtonRegistrarDespesas.addActionListener(this::registrarDespesa);
        jButtonListarDespesas.addActionListener(this::listarDespesa);
    }

    public void cadastrarVeiculo(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null," Cadastre um Veículo", "Cadastrar Veículos",JOptionPane.INFORMATION_MESSAGE);
    }

    private void listarVeiculo(ActionEvent actionEvent){
        JOptionPane.showMessageDialog(null," Lista de Veículos", "Listar Veículos",JOptionPane.WARNING_MESSAGE);
    }

    private void registrarDespesa(ActionEvent actionEvent){
        JOptionPane.showMessageDialog(null," Registre uma despesa", "Cadastrar Despesa",JOptionPane.WARNING_MESSAGE);
    }

    private void listarDespesa(ActionEvent actionEvent){
        JOptionPane.showMessageDialog(null," Lista das despesas", "Listar Despesas",JOptionPane.WARNING_MESSAGE);
    }



}
