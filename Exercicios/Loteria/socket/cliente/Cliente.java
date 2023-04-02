
package Loteria.socket.cliente;
import java.io.IOException;
import java.net.Socket;
import Loteria.service.Service;


public class Cliente {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws IOException {

		Socket cliente = new Socket("localhost", 2000);
		
		while (true){
			Service.clienteRecebeNumerosServidor(cliente);
			Service.clienteEnviaRespostaServidor(cliente);
		}
	}
}
