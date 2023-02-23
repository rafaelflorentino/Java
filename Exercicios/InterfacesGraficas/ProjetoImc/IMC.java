import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class IMC extends JFrame {
	private JLabel tituloPeso, tituloAltura;
	private JTextField peso, altura;
	private JButton calcular, voltar;

	private JRadioButton botao1, botao2;
	private ButtonGroup bg;
	static String sexo = "ERRO";
	private JLabel texto;
	private Icon logo;

	private float imc;
	static float a = 0;

	public IMC() {
		super("IMC");

		tituloPeso = new JLabel("\nPeso: ");
		tituloPeso.setFont(new Font("serif", Font.PLAIN, 26));
		tituloPeso.setForeground(Color.ORANGE);

		tituloAltura = new JLabel("\nAltura: ");
		tituloAltura.setFont(new Font("serif", Font.PLAIN, 26));
		tituloAltura.setForeground(Color.ORANGE);

		peso = new JTextField();
		peso.setFont(new Font("serif", Font.PLAIN, 26));

		altura = new JTextField();
		altura.setFont(new Font("serif", Font.PLAIN, 26));

		texto = new JLabel(" Sexo:");
		texto.setFont(new Font("serif", Font.PLAIN, 26));
		texto.setForeground(Color.ORANGE);

		bg = new ButtonGroup();

		botao1 = new JRadioButton("M");
		botao2 = new JRadioButton("F");

		bg.add(botao1);
		bg.add(botao2);

		botao1.setActionCommand("M");
		botao2.setActionCommand("F");
		botao1.setBackground(Color.red);
		botao2.setBackground(Color.red);

		logo = new ImageIcon("/Users/rafaelflorentino/Desktop/JAVA/PojetoJava/bin/maisSaude.png");

		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JLabel titulo = new JLabel("       Calculo do IMC\n");
		calcular = new JButton("Calcular");
		calcular.addActionListener(new BotaoCalcularListener());
		calcular.setFont(new Font("serif", Font.PLAIN, 26));
		calcular.setToolTipText("CLIQUE AQUI PARA CALCULAR");

		voltar = new JButton("Voltar");
		voltar.addActionListener(new BotaoVoltarListener());
		voltar.setFont(new Font("serif", Font.PLAIN, 26));
		voltar.setToolTipText("CLIQUE AQUI PARA VOLTAR");

		Container c1 = new JPanel();
		c1.setLayout(new GridLayout(1, 2));
		c1.add(botao1);
		c1.add(botao2);

		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(4, 2));
		c2.add(texto);
		c2.add(c1);
		c2.add(tituloPeso);
		c2.add(peso);
		c2.add(tituloAltura);
		c2.add(altura);
		c2.add(voltar);
		c2.add(calcular);

		c.add(BorderLayout.NORTH, titulo);
		c.add(BorderLayout.CENTER, c2);

		setSize(270, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(470, 150);
		setResizable(false);

		Color v = new Color(255, 51, 0);
		titulo.setForeground(Color.BLUE);
		c2.setBackground(v);
		c.setBackground(v);
		c1.setBackground(v);

		Font f = new Font("serif", Font.ITALIC, 26);
		titulo.setFont(f);
	}

	public static void main(String[] args) {
		new IMC();

	}

	class BotaoCalcularListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			// ###Validando para preencher o botao de sexo###
			if (bg.getSelection() == null) {
				JOptionPane.showMessageDialog(null, "Você nao selecionou o sexo ", "ERRO", 0, logo);
			} else {
				sexo = bg.getSelection().getActionCommand();
				calcular.setText("Calcular +");

				if (peso.getText().isEmpty() || altura.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha os campos corretamente ", "ERRO", 0, logo);

				} else {
					// ###Validando para so receber numeros###
					if (peso.getText().length() != 0) {
						try {

							float P = Float.parseFloat(peso.getText());
							float A = Float.parseFloat(altura.getText());
							imc = P / (A * A);
							a = imc;

							new TabelaIMC();
							peso.setText("");
							altura.setText("");

						} catch (NumberFormatException ex) {
							JOptionPane.showMessageDialog(null,
									"Os Campos \n  *Peso\n  *Altura\nSomente aceita números ", "Informação", 0, logo);
							peso.grabFocus();
						}
					}
				}
			}
		}
	}

	class BotaoVoltarListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new ProjetoPrincipal();
			dispose();
		}
	}
}
