import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;

public class TelaListaVeiculos extends JFrame {


    public TelaListaVeiculos(List<Veiculo> listaVeiculos) {
        setTitle("Lista de Veículos Cadastrados");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fecha apenas esta janela ao sair
        setVisible(true);

        JPanel panel = new JPanel(new GridLayout(MenuPrincipal.listaVeiculos.size() + 1, 1));

        // Adiciona um rótulo para o cabeçalho da lista
        JLabel headerLabel = new JLabel("Lista de Veículos Cadastrados");
        headerLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(headerLabel);

        // Adiciona um rótulo para cada veículo na lista
        for (Veiculo veiculo : MenuPrincipal.listaVeiculos) {
            JLabel veiculoLabel = new JLabel(veiculo.getMarca() + " " + veiculo.getModelo() + " - Placa: " + veiculo.getPlaca());
            veiculoLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
            panel.add(veiculoLabel);
        }
        
        add(panel);

        
        // Botão Voltar
/* 
        JButton buttonVoltar = new JButton("Voltar");
        buttonVoltar.setBounds(350, 600, 250, 70); 
        buttonVoltar.setFont(new Font("SansSerif", Font.BOLD, 15));
        buttonVoltar.setBackground(new Color(10, 10, 10));
        buttonVoltar.setForeground(Color.WHITE);
        add(buttonVoltar);

        buttonVoltar.addActionListener(this::voltar);
        setVisible(true);  */


        // Centraliza a janela na tela
        setLocationRelativeTo(null);
    
    }
    // Método para exibir esta janela
    public void exibir() {
        setVisible(true);
    }

    public void voltar(ActionEvent actionEvent) {
        new MenuPrincipal();
        dispose(); 
    }
    

}