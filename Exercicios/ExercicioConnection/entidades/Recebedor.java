package ExercicioConnection.entidades;

import java.io.InputStream;
import java.util.Scanner;

public class Recebedor implements Runnable {

	private InputStream ISCliente;
	
	public Recebedor(InputStream inputStream) {
		setISCliente(inputStream);
	}

	public InputStream getISCliente() {
		return ISCliente;
	}

	public void setISCliente(InputStream iSCliente) {
		ISCliente = iSCliente;
	}

	@Override
	public void run() {
		Scanner conversa = new Scanner(getISCliente());
		while(conversa.hasNextLine()){
			System.out.println(conversa.nextLine());
		}		
	}

}
