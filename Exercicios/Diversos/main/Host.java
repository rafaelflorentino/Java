package Diversos.main;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import Diversos.constantes.Constantes;
import Diversos.service.Printer;
import Diversos.service.ServiceStream;
import Diversos.threads.ThreadOutHost;

public class Host {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = ServiceStream.getServerSocket(Constantes.PORTA);
		do {
			Printer.print("Aguardando conexao na porta "+Constantes.PORTA);
			Socket socket = serverSocket.accept();
			Printer.print(socket.getInetAddress() + " Conetado com sucesso");
			new Thread(new ThreadOutHost(socket)).start();
		} while (true);
	}
}
