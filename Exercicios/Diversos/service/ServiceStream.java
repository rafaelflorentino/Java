package Diversos.service;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServiceStream {

	public static ServerSocket getServerSocket (int porta) throws IOException{
		return new ServerSocket(porta);
	}
	public static Socket getHostSocket (int porta) throws IOException{
		Printer.print("Aguardando conexao na porta "+porta);
		Socket socket =  getServerSocket(porta).accept();
		Printer.print("conectado com sucesso");
		return socket;
	}
	public static Socket getClient (String ipHost, int porta) throws UnknownHostException, IOException{
		return new Socket(ipHost, porta);
	}
	private static ObjectInputStream getObjInputStream (Socket socket) throws IOException{
		return new ObjectInputStream(socket.getInputStream());
	}
	public static String getObjIn(Socket socket) throws ClassNotFoundException, IOException{
		return getObjInputStream(socket).readObject().toString();
	}
	private static ObjectOutputStream getObjOutputStream(Socket socket) throws IOException{
		return new ObjectOutputStream(socket.getOutputStream());
	}
	public static void getObjOut (Socket socket, Object obj) throws IOException{
		getObjOutputStream(socket).writeObject(obj);
	}
	
	
}
