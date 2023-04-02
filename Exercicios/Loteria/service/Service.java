package Loteria.service;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Loteria.modelo.bean.Loteria;

public class Service {
	
	//############################## SERVIDOR ###############################################
	public static ServerSocket createServidor() throws IOException{
		ServerSocket servidorDaSorte = new ServerSocket(2000);
		System.out.println("Server Started "+new Date());
		System.out.println("Aguardando conex�o com a porta 2000...");
		
		return servidorDaSorte;
	}
	
	public static void servidorEnviaNumerosCliente(Socket socket) throws IOException{
		
		List<Integer> sorteio = new ArrayList<Integer>();
		OutputStream os;
		ObjectOutputStream oos;
		
		sorteio = Loteria.getNumerosLoteriaSorteados();

		os = socket.getOutputStream();
		oos = new ObjectOutputStream(os);
		oos.writeObject(sorteio.toString());
	}
	
	public static String servidorRecebeRespostaCliente(Socket socket, ServerSocket servidorDaSorte) throws IOException, ClassNotFoundException{
		
		String texto;
		
		InputStream is = socket.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(is);

		texto = (String)ois.readObject();
			
		if(!texto.equalsIgnoreCase("s"))
			servidorDaSorte.close();
		
		return texto;
	}
	
	public static Socket servidorWaitCliente(Socket socket, ServerSocket servidorDaSorte) throws IOException{
		
		socket = servidorDaSorte.accept(); // Bloqueio
		
		if(socket != null){
			System.out.println("Conex�o Realizada Com Sucesso...");
		}
		
		return socket;
		
	}
	
	//############################## CLIENTE ###############################################
	
	public static void clienteRecebeNumerosServidor(Socket cliente) throws IOException{
		
		InputStream is;
		ObjectInputStream ois;
		String texto;
		
		is = cliente.getInputStream();
		ois = new ObjectInputStream(is);
		try{
			texto = (String)ois.readObject();
			System.out.println("Sorteio: "+ texto);
		}catch (ClassNotFoundException e){}		
	}
	
	public static void clienteEnviaRespostaServidor(Socket cliente) throws IOException{
		String resposta;
		
		resposta = Reader.lerString("Deseja continuar ? (s / n)", "Dado inv�lido !");
		
		OutputStream os = cliente.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(resposta.toString());
		
	}
}
