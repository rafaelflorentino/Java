import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TelaCadastrarVeiculo extends JFrame {

    JTextField inputMarca, inputModelo, inputAnoFabricacao, inputAnoModelo, inputMotorizacao, inputCapacidadeTanque, inputCor, inputPlaca, inputRenavam; 

    public TelaCadastrarVeiculo(){

    // Tela Frame configurações

    setTitle("Cadastrar Veiculo");
    setVisible(true);
    setSize(800, 800);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setLocationRelativeTo(null);
    setLayout(null);

    
    JLabel textoCadastroVeiculo = new JLabel("Cadastro Veiculo");
    textoCadastroVeiculo.setBounds(300, 0, 250, 70);
    textoCadastroVeiculo.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(textoCadastroVeiculo);

    // Marca

    JLabel textoMarca = new JLabel("Marca: ");
    textoMarca.setBounds(200, 80, 250, 70);
    textoMarca.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(textoMarca);

    inputMarca = new JTextField("");
    inputMarca.setBounds(250, 100, 250, 35);
    inputMarca.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputMarca);
    
    // Modelo

    JLabel textoModelo = new JLabel("Modelo: ");
    textoModelo.setBounds(100, 150, 250, 70);
    textoModelo.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(textoModelo);

    inputModelo = new JTextField("");
    inputModelo.setBounds(250, 150, 250, 35);
    inputModelo.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputModelo);

    // Ano Fabricação

    JLabel textoAnoFabricacao = new JLabel("Ano Fabricacao: ");
    textoAnoFabricacao.setBounds(200, 200, 250, 70);
    textoAnoFabricacao.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(textoAnoFabricacao);

    inputAnoFabricacao = new JTextField("");
    inputAnoFabricacao.setBounds(250, 200, 250, 35);
    inputAnoFabricacao.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputAnoFabricacao);

    // Ano Modelo

    JLabel textoAnoModelo = new JLabel("Ano Modelo: ");
    textoAnoModelo.setBounds(200, 250, 250, 70);
    textoAnoModelo.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(textoAnoModelo);

    inputAnoModelo = new JTextField("");
    inputAnoModelo.setBounds(250, 250, 250, 35);
    inputAnoModelo.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputAnoModelo);

    // Motorização

    JLabel textoMotorizacao = new JLabel("Motor: ");
    textoMotorizacao.setBounds(200, 300, 250, 70);
    textoMotorizacao.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(textoMotorizacao);

    inputMotorizacao = new JTextField("");
    inputMotorizacao.setBounds(250, 300, 250, 35);
    inputMotorizacao.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputMotorizacao);

    // Capacidade Tanque

    JLabel textoCapacidadeTanque = new JLabel("Capacidade Tanque: ");
    textoCapacidadeTanque.setBounds(200, 350, 250, 70);
    textoCapacidadeTanque.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(textoCapacidadeTanque);

    inputCapacidadeTanque = new JTextField("");
    inputCapacidadeTanque.setBounds(250, 350, 250, 35);
    inputCapacidadeTanque.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputCapacidadeTanque);

    // Cor

    JLabel textoCor = new JLabel("Cor: ");
    textoCor.setBounds(200, 400, 250, 70);
    textoCor.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(textoCor);

    inputCor = new JTextField("");
    inputCor.setBounds(250, 400, 250, 35);
    inputCor.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputCor);

    // Placa

    JLabel textoPlaca = new JLabel("Placa: ");
    textoPlaca.setBounds(200, 450, 250, 70);
    textoPlaca.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(textoPlaca);

    inputPlaca = new JTextField("");
    inputPlaca.setBounds(250, 450, 250, 35);
    inputPlaca.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(inputPlaca);

    // Renavam

    JLabel textoRenavam = new JLabel("Renavam: ");
    textoRenavam.setBounds(200, 500, 250, 70);
    textoRenavam.setFont(new Font("SansSerif", Font.ITALIC, 15));
    add(textoRenavam);

    inputRenavam = new JTextField("");
    inputRenavam.setBounds(250, 500, 250, 35);
    inputRenavam.setFont(new Font("SansSerif", Font.ITALIC, 15));
   
    // Cadastrar Veiculo

    JButton buttonCadastrarVeiculo = new JButton("Cadastrar");
    buttonCadastrarVeiculo.setBounds(250, 650, 250, 70); 
    buttonCadastrarVeiculo.setFont(new Font("SansSerif", Font.BOLD, 15));
    buttonCadastrarVeiculo.setBackground(new Color(10, 10, 10));
    buttonCadastrarVeiculo.setForeground(Color.WHITE);
    add(buttonCadastrarVeiculo);
    
    buttonCadastrarVeiculo.addActionListener(this::cadastrar);
    setVisible(true);

    }

    public void cadastrar(ActionEvent actionEvent) {
        //  String marca = inputMarca.getText();
        //  String modelo = inputModelo.getText(); 
        //  int anoFabricacao = Integer.parseInt(inputAnoFabricacao.getText());
        //  int anoModelo = Integer.parseInt(inputAnoModelo.getText());
        //  String motorizacao = inputMotorizacao.getText(); 
        //  int capacidadeTanque = Integer.parseInt(inputCapacidadeTanque.getText());
        //  String cor = inputCor.getText(); 
        //  String placa = inputPlaca.getText();
        //  int renavam = Integer.parseInt(inputRenavam.getText());
        //  System.out.println("valores: "+marca, modelo, anoFabricacao, anoModelo, motorizacao, capacidadeTanque, cor, placa, renavam);

        JOptionPane.showMessageDialog(null,inputMarca.getText(), "Dados Veículo",JOptionPane.INFORMATION_MESSAGE);
    }   
}
