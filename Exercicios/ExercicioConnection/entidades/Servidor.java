package ExercicioConnection.entidades;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	private int porta;

	public Servidor(int porta){
		setPorta(porta);
	}
	
	public int getPorta() {
		return porta;
	}

	public void setPorta(int porta) {
		this.porta = porta;
	}
	public void executa() throws IOException{
		ServerSocket servidor = new ServerSocket(getPorta());
		System.out.println("Aguardando conexao");
		while(true){
			Socket cliente = servidor.accept();
			System.out.println("Cliente Conectado " + cliente.getInetAddress().getHostAddress());
			Thread ac = new Thread(new AtendimentoCliente(cliente));
			ac.start();
		}
		
	}


}
