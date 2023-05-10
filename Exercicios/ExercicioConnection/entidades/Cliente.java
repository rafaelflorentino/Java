package ExercicioConnection.entidades;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Cliente {
	private String host;
	private int porta;
	
	public Cliente(String host, int porta) {
		setHost(host);
		setPorta(porta);
	}
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPorta() {
		return porta;
	}
	public void setPorta(int porta) {
		this.porta = porta;
	}
	
	public void executa() throws UnknownHostException, IOException{
		Socket cliente = new Socket(getHost(), getPorta());
		System.out.println("Conectado");
		Recebedor r = new Recebedor(cliente.getInputStream());
		new Thread(r).start();

		Scanner teclado = new Scanner(System.in);
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		while (teclado.hasNextLine()) {
			saida.println(teclado.nextLine());
		}
		
	}
}
