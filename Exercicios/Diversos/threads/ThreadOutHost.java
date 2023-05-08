package Diversos.threads;

import java.io.IOException;
import java.net.Socket;

import Diversos.service.InfoOperacao;
import Diversos.service.Printer;
import Diversos.service.ServiceStream;

public class ThreadOutHost implements Runnable{
	private Socket socket;
	
	public ThreadOutHost(Socket socket) {
		setSocket(socket);
	}
	@Override
	public void run() {
			try {
				String url = ServiceStream.getObjIn(getSocket());
				String msg = new InfoOperacao(url, getSocket()).toString();
				Printer.print(msg);
				ServiceStream.getObjOut(getSocket(), msg);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
	}
	public Socket getSocket() {
		return socket;
	}
	public void setSocket(Socket socket) {
		this.socket = socket;
	}
	
	
}
