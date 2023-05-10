package ExercicioConnection.entidades;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

import ExercicioConnection.exceptions.OperacaoNotFoundException;
import ExercicioConnection.exceptions.ValueIsNotInteger;
import ExercicioConnection.util.Separador;

public class AtendimentoCliente implements Runnable {

	private Socket cliente;
	private HashMap<String, String> requisicao;

	public HashMap<String, String> getRequisicao() {
		return requisicao;
	}

	public void setRequisicao(HashMap<String, String> requisicao) {
		this.requisicao = requisicao;
	}

	public Socket getCliente() {
		return cliente;
	}

	public void setCliente(Socket cliente) {
		this.cliente = cliente;
	}

	public AtendimentoCliente(Socket cliente) {
		setCliente(cliente);
	}

	@Override
	public void run() {
		try {
			Scanner conversaCliente = new Scanner(getCliente().getInputStream());
			while (conversaCliente.hasNext()) {
				efetuarRequisicao(conversaCliente.nextLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void efetuarRequisicao(String nextLine) {
		setRequisicao(Separador.separarString(nextLine));
		try {
			verificarRequisicao(); // Verificar se nenhum valor ou operacao
									// estao errados
			executaRequisicao(); // Executar a operacao
		} catch (ValueIsNotInteger e) {
			getRequisicao().put("resultado", null);
			enviarResposta("500");

		} catch (OperacaoNotFoundException e) {
			getRequisicao().put("operacao", null);
			getRequisicao().put("resultado", null);
			enviarResposta("404");
		}

	}

	private void executaRequisicao() {
		try {
			int op = selecionarOP(getRequisicao().get("operacao"));
			switch (op) {
			case 1:
				getRequisicao().put("resultado", efetuarSoma());
				break;
			case 2:
				getRequisicao().put("resultado", efetuarSubtracao());
				break;
			case 3:
				getRequisicao().put("resultado", efetuarMultiplicacao());
				break;
			case 4:
					getRequisicao().put("resultado", efetuarDivisao());
		
				break;
			}
			enviarResposta("200");

		} catch (OperacaoNotFoundException e) {
		}catch (ArithmeticException e) {
			getRequisicao().put("resultado", null);
			enviarResposta("500");		}
	}

	private String efetuarDivisao() {
		int v1 = Integer.parseInt(getRequisicao().get("valor1"));
		int v2 = Integer.parseInt(getRequisicao().get("valor2"));
		int value = 0;
		value = v1 / v2;
		return String.valueOf((value));
	}

	private String efetuarMultiplicacao() {
		int v1 = Integer.parseInt(getRequisicao().get("valor1"));
		int v2 = Integer.parseInt(getRequisicao().get("valor2"));
		return String.valueOf((v1*v2));
	}

	private String efetuarSubtracao() {
		int v1 = Integer.parseInt(getRequisicao().get("valor1"));
		int v2 = Integer.parseInt(getRequisicao().get("valor2"));
		return String.valueOf((v1 - v2));
	}

	private String efetuarSoma() {
		int v1 = Integer.parseInt(getRequisicao().get("valor1"));
		int v2 = Integer.parseInt(getRequisicao().get("valor2"));
		return String.valueOf((v1 + v2));
	}

	private void verificarRequisicao() throws OperacaoNotFoundException,
			ValueIsNotInteger {

		selecionarOP(getRequisicao().get("operacao"));
		isInteger(getRequisicao().get("valor1"));
		isInteger(getRequisicao().get("valor2"));

	}

	private void enviarResposta(String status) {
		try {
			PrintStream ps = new PrintStream(getCliente().getOutputStream());
			ps.println(msgResposta(status));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String msgResposta(String status) {
		String msg = "#STATUS:" + status + "\n" + "#DATA:" + getCurrentDate()
				+ "\n" + "#HORA:" + getCurrentTime() + "\n" + "#PROTOCOLO:"
				+ getRequisicao().get("protocolo") + "\n" + "#IP_SOLICITANTE:"
				+ getCliente().getInetAddress().getHostAddress() + "\n"
				+ "#VALOR1:" + getRequisicao().get("valor1") + "\n"
				+ "#VALOR2:" + getRequisicao().get("valor2") + "\n"
				+ "#OPERACAO:" + getRequisicao().get("operacao") + "\n"
				+ "#RESULTADO:" + getRequisicao().get("resultado") + "\n";
		return msg;
	}

	public String getCurrentDate() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		return dateFormat.format(date);
	}

	public String getCurrentTime() {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}

	public void isInteger(String str) throws ValueIsNotInteger {
		try {
			Integer.parseInt(str);
		} catch (NumberFormatException nfe) {
			throw new ValueIsNotInteger();
		}
	}

	private static int selecionarOP(String a) throws OperacaoNotFoundException {
		if (a.toLowerCase().equalsIgnoreCase("somar")) {
			return 1;
		}
		if (a.toLowerCase().equalsIgnoreCase("subtrair")) {
			return 2;
		}
		if (a.toLowerCase().equalsIgnoreCase("multiplicar")) {
			return 3;
		}
		if (a.toLowerCase().equalsIgnoreCase("dividir")) {
			return 4;
		}
		throw new OperacaoNotFoundException();
	}

}
