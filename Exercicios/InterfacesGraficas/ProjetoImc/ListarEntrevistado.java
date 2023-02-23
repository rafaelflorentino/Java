import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListarEntrevistado extends JFrame {
	private JLabel titulo;
	private JButton voltar;
	private JScrollPane scrollpane;

	ListarEntrevistado() {
		super("Listar Entrevistado");

		JList list = new JList(new Vector(InserirEntrevistado.dados));
		scrollpane = new JScrollPane(list);

		titulo = new JLabel("                  Lista dos Entrevistados");
		titulo.setFont(new Font("serif", Font.PLAIN, 26));

		voltar = new JButton("Voltar");
		voltar.addActionListener(new BotaoVoltarListener());
		voltar.setFont(new Font("serif", Font.PLAIN, 26));
		voltar.setToolTipText("CLIQUE AQUI PARA VOLTAR");

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(BorderLayout.NORTH, titulo);
		c.add(BorderLayout.CENTER, scrollpane);
		c.add(BorderLayout.SOUTH, voltar);

		setSize(470, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(470, 150);
		setResizable(false);
	}
	public static void main(String[] args) {
		new ListarEntrevistado();
	}
	class BotaoVoltarListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new ProjetoPrincipal();
			dispose();

		}
	}
}
