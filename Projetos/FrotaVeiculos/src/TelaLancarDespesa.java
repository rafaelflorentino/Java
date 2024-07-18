
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TelaLancarDespesa extends JFrame  {

    JTextField inputNomeDespesa, inputValorDespesa, inputPlacaDespesa, inputDescricaoDespesa;

    public TelaLancarDespesa() {

        setTitle("Lançar Despesa");
        setVisible(true);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(9, 1));

        //  Nome Despesa

        JLabel TextoNomeDespesa = new JLabel("Nome da despesa:");
        TextoNomeDespesa.setFont(new Font("SansSerif", Font.BOLD, 18));
        TextoNomeDespesa.setHorizontalAlignment(SwingConstants.CENTER);

        inputNomeDespesa = new JTextField("");
        inputNomeDespesa.setBounds(250, 100, 250, 35);
        inputNomeDespesa.setFont(new Font("SansSerif", Font.ITALIC, 15));
        
        //  Valor Despesa

        JLabel TextoValorDespesa = new JLabel("Valor da despesa:");
        TextoValorDespesa.setFont(new Font("SansSerif", Font.BOLD, 18));
        TextoValorDespesa.setHorizontalAlignment(SwingConstants.CENTER);

        inputValorDespesa = new JTextField("");
        inputValorDespesa.setBounds(250, 100, 250, 35);
        inputValorDespesa.setFont(new Font("SansSerif", Font.ITALIC, 15));
        
        //  Paca Veiculo

        JLabel TextoPlacaDespesa = new JLabel("Placa do veiculo:");
        TextoPlacaDespesa.setFont(new Font("SansSerif", Font.BOLD, 18));
        TextoPlacaDespesa.setHorizontalAlignment(SwingConstants.CENTER);

        inputPlacaDespesa  = new JTextField("");
        inputPlacaDespesa .setBounds(250, 100, 250, 35);
        inputPlacaDespesa .setFont(new Font("SansSerif", Font.ITALIC, 15));
    
        //  Descrição Despesa

        JLabel TextoDescricaoDespesa = new JLabel("Descrição da despesa:");
        TextoDescricaoDespesa.setFont(new Font("SansSerif", Font.BOLD, 18));
        TextoDescricaoDespesa.setHorizontalAlignment(SwingConstants.CENTER);

        inputDescricaoDespesa  = new JTextField("");
        inputDescricaoDespesa .setBounds(250, 100, 250, 35);
        inputDescricaoDespesa .setFont(new Font("SansSerif", Font.ITALIC, 15));
        
        // Botão Voltar

        JPanel painelBotao = new JPanel();
        JButton jButtonVoltar = new JButton("Voltar");
        jButtonVoltar.setBounds(350, 600, 250, 70); 
        jButtonVoltar.setFont(new Font("SansSerif", Font.BOLD, 15));
        jButtonVoltar.setBackground(new Color(10, 10, 10));
        jButtonVoltar.setForeground(Color.WHITE);

        jButtonVoltar.addActionListener(this::voltar);
        setVisible(true);

        painelBotao.add(jButtonVoltar);

        add(TextoNomeDespesa);
        add(inputNomeDespesa);
        add(TextoValorDespesa);
        add(inputValorDespesa);
        add(TextoPlacaDespesa);
        add(inputPlacaDespesa );
        add(TextoDescricaoDespesa);
        add(inputDescricaoDespesa);
        add(painelBotao);

    }
    
    public void voltar(ActionEvent actionEvent) {
        new MenuPrincipal();
        dispose(); 
    }


}
