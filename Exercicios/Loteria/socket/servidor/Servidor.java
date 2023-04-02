/* 
  Objetivo: Crie um programa em java que utilize Threads
  Entrada: Sem entrada.
  Saida: Sem saida.
  Autor: Rafael Florentino.
*/
package Loteria.socket.servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import Loteria.service.Service;

public class Servidor {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String resposta;
		ServerSocket servidorDaSorte;
		Socket socket = null;
		
		servidorDaSorte = Service.createServidor();
		socket = Service.servidorWaitCliente(socket, servidorDaSorte);
		
		do{
			Service.servidorEnviaNumerosCliente(socket);
			resposta = Service.servidorRecebeRespostaCliente(socket, servidorDaSorte);		
		}while(resposta.equalsIgnoreCase("s"));
	}
}
