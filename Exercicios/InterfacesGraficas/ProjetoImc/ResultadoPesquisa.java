import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class ResultadoPesquisa extends JFrame {

	private JLabel titulo, tituloTotalEntrevisado, tituloQuantidadeHomem, tituloQuantidadeMulher, tituloNaoPratica,
			tituloHomemFutebol, tituloImcAcima;
	private JLabel tituloHomemImcNormal, tituloMulheresAcima, tituloMoraDf, tituloHomemBranco, tituloCasados;
	private JButton voltar;
	private ImageIcon icon;
	private JLabel logo;
	private float HomensEnt = 0;
	private float MulherEnt = 0;
	private float NaoPratica = 0;
	private float MoraDF = 0;
	private float CasadosEnt = 0;
	private float ImcAcima = 0;
	private float ImcHomenNormal = 0;
	private float HomensBrancos = 0;
	private float ImcMulherNormal = 0;
	private float HomenFutbol = 0;

	ResultadoPesquisa() {

		super("Resultado Da Pesquisa");

		titulo = new JLabel("            RESULTADO DA PESQUISA ");
		titulo.setFont(new Font("serif", Font.PLAIN, 26));
		titulo.setForeground(Color.ORANGE);
		HomensEnt = InserirEntrevistado.contM;
		MulherEnt = InserirEntrevistado.contF;
		NaoPratica = InserirEntrevistado.contPraticaN;
		MoraDF = InserirEntrevistado.contDF;
		CasadosEnt = InserirEntrevistado.contCasado;
		ImcAcima = InserirEntrevistado.contIMC;
		ImcHomenNormal = InserirEntrevistado.contImcHomenNormal;
		HomensBrancos = InserirEntrevistado.contHomenBranco;
		ImcMulherNormal = InserirEntrevistado.contImcMulherNormal;
		HomenFutbol = InserirEntrevistado.contHomenFut;

		tituloTotalEntrevisado = new JLabel(" " + InserirEntrevistado.cont + ": Pessoas Foram Entrevistadas");
		tituloQuantidadeHomem = new JLabel(
				" " + (HomensEnt / InserirEntrevistado.cont) * 100 + "% Dos Entrevistados sao Homens  ");
		tituloQuantidadeMulher = new JLabel(
				" " + (MulherEnt / InserirEntrevistado.cont) * 100 + "% Dos Entrevistados sao Mulheres ");
		tituloNaoPratica = new JLabel(" " + (NaoPratica / InserirEntrevistado.cont) * 100
				+ "% Dos Entrevistados Nao Praticam Nenhuma Atividae Fisica");
		tituloHomemFutebol = new JLabel(
				" " + (HomenFutbol / HomensEnt) * 100 + "% Dos Homens com Menos de 40 Anos Jogao Futebol");
		tituloImcAcima = new JLabel(" " + (ImcAcima / InserirEntrevistado.cont) * 100
				+ "% Dos Entrevistados Estao com o IMC Acima do Normal");
		tituloHomemImcNormal = new JLabel(
				" " + (ImcHomenNormal / HomensEnt) * 100 + "% Dos Homens Estao com o IMC Normal");
		tituloMulheresAcima = new JLabel(
				" " + (ImcMulherNormal / MulherEnt) * 100 + ": Das Mulheres Estao Acima do Peso");
		tituloMoraDf = new JLabel(" " + (MoraDF / InserirEntrevistado.cont) * 100 + "% Dos Entrevistados Morão no DF");
		tituloHomemBranco = new JLabel(
				" " + (HomensBrancos / HomensEnt) * 100 + "% Dos Homens Entrevistados Sao Brancos");
		tituloCasados = new JLabel(
				" " + (CasadosEnt / InserirEntrevistado.cont) * 100 + "% Dos Entrevistados Sao Casado");

		icon = new ImageIcon("/Users/rafaelflorentino/Desktop/JAVA/PojetoJava/bin/maisSaude.png");
		logo = new JLabel(icon);

		voltar = new JButton("Voltar");
		voltar.addActionListener(new BotaoVoltarListener());
		voltar.setFont(new Font("serif", Font.PLAIN, 26));
		voltar.setToolTipText("CLIQUE AQUI PARA VOLTAR");

		Container c1 = new JPanel();
		c1.setLayout(new GridLayout(2, 0));
		c1.add(logo);
		c1.add(titulo);

		JPanel c2;
		c2 = new JPanel();
		c2.setLayout(new GridLayout(11, 0));
		c2.setBorder(new TitledBorder(" Resultados "));

		c2.add(tituloTotalEntrevisado);
		c2.add(tituloQuantidadeHomem);
		c2.add(tituloQuantidadeMulher);
		c2.add(tituloNaoPratica);
		c2.add(tituloHomemFutebol);
		c2.add(tituloImcAcima);
		c2.add(tituloHomemImcNormal);
		c2.add(tituloMulheresAcima);
		c2.add(tituloMoraDf);
		c2.add(tituloHomemBranco);
		c2.add(tituloCasados);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(BorderLayout.NORTH, c1);
		c.add(BorderLayout.CENTER, c2);
		c.add(BorderLayout.SOUTH, voltar);

		setSize(500, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(470, 150);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ResultadoPesquisa();
	}

	class BotaoVoltarListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new ProjetoPrincipal();
			dispose();
		}
	}
}
