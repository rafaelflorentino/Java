package Diversos.main;

import java.io.IOException;
import java.net.Socket;

import Diversos.service.ClientUrlUtil;
import Diversos.service.Printer;
import Diversos.threads.ThreadIn;
import Diversos.threads.ThreadOutClient;


public class Client {
	public static void main(String[] args)  {
		Printer.print("INSTRUCOES\nInforme uma url no seguinte formato: \n" +
					"talp://IP_SERVIDOR:PORTA_DE_ATENDIMENTO/somar?valor1=20&valor2=50\n" +
					"As seguintes opera��es s�o poss�veis: "+ ClientUrlUtil.getPossiveisOperacoes());
		String url;
		do {
			url = ClientUrlUtil.leURL();
			if (!url.equalsIgnoreCase("end")) {
				Socket socket;
				try {
					socket = new Socket(ClientUrlUtil.getHostIP(url), ClientUrlUtil.getPorta(url));
					new Thread(new ThreadOutClient(socket, url)).start();
					new Thread(new ThreadIn(socket)).start();
				} catch (IOException e) {
					e.printStackTrace();
					Printer.print("Erro na conexao");
					System.exit(0);
				} 
			}
		} while (!url.equalsIgnoreCase("end"));
		Printer.print("Conexao terminada...");
	}
}
