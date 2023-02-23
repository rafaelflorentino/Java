import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TabelaIMC extends JFrame {
	private String[] coluna = { "Indice de Massa Corporal", "      Homens", "      Mulheres" };
	private String[][] dados = { { "Obesidade Mórbida	", "    + de 40", "    + de 39" },
			{ "Obesidade Moderada", "    30 a 39,9", "    29 a 38,9" },
			{ "Sobrepeso", "    25 a 29,9", "    24 a 28,9" },
			{ "Normal", "    20 a 24,9", "    19 a 23,9" },
			{ "Abaixo do Normal", "    - de 20", "    - de 19" }
	};
	private JTable listEstados;
	private JScrollPane scrollpane;
	private JButton ok;
	private JLabel titulo;
	private float b;
	private String sex;

	TabelaIMC() {
		super("Tabela IMC");
		Color v = new Color(255, 51, 0);

		listEstados = new JTable(dados, coluna);
		scrollpane = new JScrollPane(listEstados);
		scrollpane.setPreferredSize(new java.awt.Dimension(400, 130));

		titulo = new JLabel("Tabela Do IMC");
		titulo.setForeground(Color.BLUE);

		ok = new JButton("OK");
		ok.setFont(new Font("serif", Font.PLAIN, 26));
		ok.addActionListener(new BotaoOKListener());
		ok.setToolTipText("CLIQUE AQUI PARA VOLTAR");

		sex = IMC.sexo;
		String tipo = "Erro";
		b = IMC.a;

		if (sex == "M") {
			if (b == 0) {
				b = -1;
			} else if (b < 20) {
				tipo = "Abaixo do Normal";
			} else if (b >= 20 && b <= 24.9) {
				tipo = "Normal";
			} else if (b > 24.9 && b <= 29.9) {
				tipo = "Sobrepeso";
			} else if (b >= 30 && b < 43) {
				tipo = "Obesidade Moderada";
			} else if (b > 43) {
				tipo = "Obesidade Morbida";
			}

		} else {
			if (b < 19) {
				tipo = "Abaixo do Normal";
			} else if (b >= 19 && b <= 23.9) {
				tipo = "Normal";
			} else if (b >= 24 && b <= 28.9) {
				tipo = "Sobrepeso";
			} else if (b >= 29 && b <= 38.9) {
				tipo = "Obesidade Moderada";
			} else if (b > 39) {
				tipo = "Obesidade Morbida";
			}

		}
		JLabel espaco = new JLabel("                                                                                ");
		JLabel frase = new JLabel(
				"                               IMC: " + IMC.a + "                                    ");
		JLabel frase2 = new JLabel("                     O SEU IMC ESTA: " + tipo + "                        ");
		frase.setForeground(Color.BLUE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(frase);
		c.add(frase2);
		c.add(espaco);
		c.setBackground(v);
		c.add(titulo);
		c.add(scrollpane);
		c.add(ok);
		c.setBackground(v);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(420, 290);
		setVisible(true);
		setLocation(450, 130);
		setResizable(false);
	}
	public static void main(String[] args) {
		new TabelaIMC();
	}
	class BotaoOKListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}
}