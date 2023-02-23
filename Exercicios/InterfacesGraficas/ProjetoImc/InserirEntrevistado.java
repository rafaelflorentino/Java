import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InserirEntrevistado extends JFrame {

	private JLabel TituloNome, TituloPeso, TituloAltura, TituloSexo, TituloCor, TituloEstadoCivil, TituloEstado,
			TituloIdade, TituloPratica, TituloPratica2, TituloPratica3, TituloOpniao, TituloOpniao2;
	private JTextField nome, peso, altura;
	private JRadioButton botao1, botao2, PraticaSim, PraticaNao;
	private ButtonGroup bg, Pratica;
	private JComboBox<String> comboCor, comboEstadoCivil, comboEstado;
	private JCheckBox futebol, natacao, caminhada, academia, ciclismo, ginastica, voleibol, outros;
	private JTextArea textArea;
	private SpinnerModel sm = new SpinnerNumberModel(18, 0, 150, 1);
	private JSpinner spinner = new JSpinner(sm);
	private JButton botao, botaoVoltar;
	private Icon logo;
	private Pattern pattern, pattern2;
	private Matcher matcherP, matcherA, matcherN;

	private String Nome, Sexo = "ERRO", Cor, EstadoCivil, Estado, pratica, resposta;
	private String Futebol, Natacao, Caminhada, Academia, Ciclismo, Ginastica, Voleibol, Outros;
	float Peso, imc;
	float Altura;
	private int idade;
	static int cont, contM, contF, contPraticaS, contPraticaN, contDF, contCasado, contIMC, contImcHomenNormal,
			contHomenBranco, contImcMulherNormal, contHomenFut;

	static Collection<String> nome1 = new ArrayList<String>();
	static Collection<String> sexo1 = new ArrayList<String>();
	static Collection<String> cor1 = new ArrayList<String>();
	static Collection<String> estadoCivil1 = new ArrayList<String>();
	static Collection<String> estado1 = new ArrayList<String>();
	static Collection<String> pratica1 = new ArrayList<String>();
	static Collection<String> resposta1 = new ArrayList<String>();
	static ArrayList<Integer> idade1 = new ArrayList<Integer>();
	static ArrayList<Float> peso1 = new ArrayList<Float>();
	static ArrayList<Float> altura1 = new ArrayList<Float>();
	static ArrayList<Float> imc1 = new ArrayList<Float>();

	static Collection<String> dados = new ArrayList<String>();

	InserirEntrevistado() {

		super("Inserir Entrevistado");

		TituloNome = new JLabel(" Nome Completo");
		TituloNome.setFont(new Font("serif", Font.PLAIN, 20));
		nome = new JTextField();
		nome.setFont(new Font("serif", Font.PLAIN, 20));

		TituloPeso = new JLabel(" Peso");
		TituloPeso.setFont(new Font("serif", Font.PLAIN, 20));
		peso = new JTextField();
		peso.setFont(new Font("serif", Font.PLAIN, 20));

		TituloAltura = new JLabel(" Altura");
		TituloAltura.setFont(new Font("serif", Font.PLAIN, 20));
		altura = new JTextField();
		altura.setFont(new Font("serif", Font.PLAIN, 20));

		TituloSexo = new JLabel(" Sexo");
		TituloSexo.setFont(new Font("serif", Font.PLAIN, 20));

		bg = new ButtonGroup();

		botao1 = new JRadioButton("Masculino");
		botao2 = new JRadioButton("Feminino");

		bg.add(botao1);
		bg.add(botao2);

		botao1.setActionCommand("Masculino");
		botao2.setActionCommand("Feminino");

		TituloCor = new JLabel(" Cor");
		TituloCor.setFont(new Font("serif", Font.PLAIN, 20));

		Container c3 = new JPanel();
		c3.setLayout(new GridLayout(1, 2));
		c3.add(botao1);
		c3.add(botao2);

		comboCor = new JComboBox<String>();
		comboCor.setFont(new Font("Serif", Font.PLAIN, 26));
		comboCor.addItem("Branco");
		comboCor.addItem("Negro");
		comboCor.addItem("Pardo");
		comboCor.addItem("Amarelo");

		TituloEstadoCivil = new JLabel(" Estado Civil");
		TituloEstadoCivil.setFont(new Font("serif", Font.PLAIN, 20));

		comboEstadoCivil = new JComboBox<String>();
		comboEstadoCivil.setFont(new Font("Serif", Font.PLAIN, 26));
		comboEstadoCivil.addItem("Casado");
		comboEstadoCivil.addItem("Solteiro");
		comboEstadoCivil.addItem("Mora junto");
		comboEstadoCivil.addItem("Namora");

		TituloEstado = new JLabel(" UF");
		TituloEstado.setFont(new Font("serif", Font.PLAIN, 20));

		comboEstado = new JComboBox<String>();
		comboEstado.setFont(new Font("Serif", Font.PLAIN, 26));

		comboEstado.addItem("DF");
		comboEstado.addItem("AC");
		comboEstado.addItem("AL");
		comboEstado.addItem("AP");
		comboEstado.addItem("AM");
		comboEstado.addItem("BA");
		comboEstado.addItem("CE");
		comboEstado.addItem("ES");
		comboEstado.addItem("GO");
		comboEstado.addItem("MA");
		comboEstado.addItem("MT");
		comboEstado.addItem("MS");
		comboEstado.addItem("MG");
		comboEstado.addItem("PA");
		comboEstado.addItem("PB");
		comboEstado.addItem("PR");
		comboEstado.addItem("PE");
		comboEstado.addItem("PI");
		comboEstado.addItem("RJ");
		comboEstado.addItem("RN");
		comboEstado.addItem("RS");
		comboEstado.addItem("RO");
		comboEstado.addItem("RR");
		comboEstado.addItem("SC");
		comboEstado.addItem("SP");
		comboEstado.addItem("SE");
		comboEstado.addItem("TO");

		TituloIdade = new JLabel(" Idade");
		TituloIdade.setFont(new Font("serif", Font.PLAIN, 20));

		TituloPratica = new JLabel(" Pratica Atividade Fisica?");
		TituloPratica.setFont(new Font("serif", Font.PLAIN, 20));

		Pratica = new ButtonGroup();

		PraticaSim = new JRadioButton("SIM");
		PraticaNao = new JRadioButton("NAO");

		Pratica.add(PraticaSim);
		Pratica.add(PraticaNao);

		PraticaSim.setActionCommand("sim");
		PraticaNao.setActionCommand("nao");

		Container c4 = new JPanel();
		c4.setLayout(new GridLayout(1, 2));
		c4.add(PraticaSim);
		c4.add(PraticaNao);

		TituloPratica2 = new JLabel(" Caso SIM Marque");
		TituloPratica2.setFont(new Font("serif", Font.PLAIN, 20));

		TituloPratica3 = new JLabel("    ");
		TituloPratica3.setFont(new Font("serif", Font.PLAIN, 20));

		futebol = new JCheckBox("futebol");
		futebol.addItemListener(new CheckListener());
		natacao = new JCheckBox("natacao");
		natacao.addItemListener(new CheckListener());
		caminhada = new JCheckBox("caminhada");
		caminhada.addItemListener(new CheckListener());
		academia = new JCheckBox("academia");
		academia.addItemListener(new CheckListener());
		ciclismo = new JCheckBox("ciclismo");
		ciclismo.addItemListener(new CheckListener());
		ginastica = new JCheckBox("ginastica");
		ginastica.addItemListener(new CheckListener());
		voleibol = new JCheckBox("voleibol");
		voleibol.addItemListener(new CheckListener());
		outros = new JCheckBox("outros");
		outros.addItemListener(new CheckListener());

		TituloOpniao = new JLabel(" Oque é Necessário Para se");
		TituloOpniao.setFont(new Font("serif", Font.PLAIN, 20));

		TituloOpniao2 = new JLabel("Ter Uma Vida Saudavel?");
		TituloOpniao2.setFont(new Font("serif", Font.PLAIN, 20));

		textArea = new JTextArea("escreva sua resposta aqui!!");
		JScrollPane scroll = new JScrollPane(textArea);
		textArea.setFont(new Font("Serif", Font.PLAIN, 26));

		botao = new JButton("Confirmar");
		botao.setFont(new Font("Serif", Font.PLAIN, 26));
		botao.setToolTipText("CLIQUE AQUI PARA CONFIRMAR");
		botao.addActionListener(new BotaoConfirmarListener());

		botaoVoltar = new JButton("Voltar");
		botaoVoltar.setFont(new Font("Serif", Font.PLAIN, 26));
		botaoVoltar.setToolTipText("CLIQUE AQUI PARA VOLTAR");
		botaoVoltar.addActionListener(new BotaoVoltarListener());

		logo = new ImageIcon("/Users/rafaelflorentino/Desktop/JAVA/PojetoJava/bin/maisSaude.png");

		Container c6 = new JPanel();
		c6.setLayout(new GridLayout(1, 2));
		c6.add(botaoVoltar);
		c6.add(botao);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(16, 2));
		c2.add(TituloNome);
		c2.add(nome);
		c2.add(TituloPeso);
		c2.add(peso);
		c2.add(TituloAltura);
		c2.add(altura);
		c2.add(TituloSexo);
		c2.add(c3);
		c2.add(TituloCor);
		c2.add(comboCor);
		c2.add(TituloEstadoCivil);
		c2.add(comboEstadoCivil);
		c2.add(TituloEstado);
		c2.add(comboEstado);
		c2.add(TituloIdade);
		c2.add(spinner);
		c2.add(TituloPratica);
		c2.add(c4);
		c2.add(TituloPratica2);
		c2.add(TituloPratica3);
		c2.add(futebol);
		c2.add(natacao);
		c2.add(caminhada);
		c2.add(academia);
		c2.add(ciclismo);
		c2.add(ginastica);
		c2.add(voleibol);
		c2.add(outros);
		c2.add(TituloOpniao);
		c2.add(TituloOpniao2);

		c.add(BorderLayout.NORTH, c2);
		c.add(BorderLayout.CENTER, scroll);
		c.add(BorderLayout.SOUTH, c6);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(450, 750);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
	}

	public static void main(String[] args) {
		new InserirEntrevistado();
	}

	class BotaoVoltarListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			new ProjetoPrincipal();
		}
	}

	class BotaoConfirmarListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			// validando os campos em branco
			if (peso.getText().isEmpty() || altura.getText().isEmpty() || nome.getText().isEmpty()
					|| bg.getSelection() == null || Pratica.getSelection() == null
					|| textArea.getText() == "escreva sua resposta aqui!!") {
				JOptionPane.showMessageDialog(null, "Preencha os campos corretamente", "Informação", 0, logo);

			} else {

				pattern = Pattern.compile("[0-9. ]+");
				pattern2 = Pattern.compile("[a-zA-Z- ]+");
				matcherP = pattern.matcher(peso.getText());
				matcherA = pattern.matcher(altura.getText());
				matcherN = pattern2.matcher(nome.getText());

				// validando campo nome
				if (nome.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "O Campo\n  *Nome\nNao pode ter so espaço em branco ",
							"Informação", 0, logo);

				} else {
					if (!matcherN.matches()) {
						JOptionPane.showMessageDialog(null, "O Campo\n  *Nome\nRecebe apenas Letras ", "Informação", 0,
								logo);
						nome.setText("");
						nome.requestFocus();
					} else {

						// validando campo Peso
						if (!matcherP.matches()) {
							JOptionPane.showMessageDialog(null, "O Campo\n  *Peso\nRecebe apenas números ",
									"Informação", 0, logo);
							peso.setText("");
							peso.requestFocus();
						} else {

							// validando campo Altura
							if (!matcherA.matches()) {
								JOptionPane.showMessageDialog(null, "O Campo\n  *Altura\nRecebe apenas números ",
										"Informação", 0, logo);
								altura.setText("");
								altura.requestFocus();
							} else {

								cont = cont + 1;
								Nome = nome.getText();
								Peso = Float.parseFloat(peso.getText());
								Altura = Float.parseFloat(altura.getText());
								Sexo = bg.getSelection().getActionCommand();
								if (Sexo == "Masculino") {
									contM = contM + 1;
								}
								if (Sexo == "Feminino") {
									contF = contF + 1;
								}

								Cor = comboCor.getSelectedItem().toString();
								if (Sexo == "Masculino" && Cor == "Branco") {
									contHomenBranco = contHomenBranco + 1;
								}

								EstadoCivil = comboEstadoCivil.getSelectedItem().toString();
								if (EstadoCivil == "Casado") {
									contCasado = contCasado + 1;
								}
								Estado = comboEstado.getSelectedItem().toString();
								if (Estado == "DF") {
									contDF = contDF + 1;
								}
								idade = (Integer) spinner.getValue();
								pratica = Pratica.getSelection().getActionCommand();
								if (pratica == "sim") {
									contPraticaS = contPraticaS + 1;
								}
								if (pratica == "nao") {
									contPraticaN = contPraticaN + 1;
								}

								resposta = textArea.getText();
								imc = (Peso / (Altura * Altura));
								if (imc > 24.99) {
									contIMC = contIMC + 1;
								}
								if (Sexo == "Masculino" && imc >= 18.5 && imc <= 24.99) {
									contImcHomenNormal = contImcHomenNormal + 1;
								}
								if (Sexo == "Feminino" && imc > 24.99) {
									contImcMulherNormal = contImcMulherNormal + 1;
								}
								if (Sexo == "Masculino" && idade < 40 && Futebol == "sim") {
									contHomenFut = contHomenFut + 1;
								}

								nome1.add(Nome);
								peso1.add(Peso);
								altura1.add(Altura);
								sexo1.add(Sexo);
								cor1.add(Cor);
								estadoCivil1.add(EstadoCivil);
								estado1.add(Estado);
								idade1.add(idade);
								pratica1.add(pratica);
								resposta1.add(resposta);
								imc1.add(imc);

								dados.add(" " + Nome + "; " + Sexo + "; " + Cor + "; " + EstadoCivil + "; " + Estado
										+ "; IMC:" + imc);

								JOptionPane.showMessageDialog(null, " Usuario: " + Nome + "\n Cadastrado com Sucesso",
										"Cadastro", 0, logo);

								nome.setText("");
								peso.setText("");
								altura.setText("");
								textArea.setText("escreva sua resposta aqui!!");
							}
						}
					}
				}
			}
		}
	}

	class CheckListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			if (futebol.isSelected()) {
				Futebol = "sim";
			} else {
				Futebol = null;
			}
			if (natacao.isSelected()) {
				Natacao = "sim";
			} else {
				Natacao = null;
			}
			if (caminhada.isSelected()) {
				Caminhada = "sim";
			} else {
				Caminhada = null;
			}
			if (academia.isSelected()) {
				Academia = "sim";
			} else {
				Academia = null;
			}
			if (ciclismo.isSelected()) {
				Ciclismo = "sim";
			} else {
				Ciclismo = null;
			}
			if (ginastica.isSelected()) {
				Ginastica = "sim";
			} else {
				Ginastica = null;
			}
			if (voleibol.isSelected()) {
				Voleibol = "sim";
			} else {
				Voleibol = null;
			}
			if (outros.isSelected()) {
				Outros = "sim";
			} else {
				Outros = null;
			}
		}
	}
}
