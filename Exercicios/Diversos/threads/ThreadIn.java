package Diversos.threads;

import java.io.IOException;
import java.net.Socket;

import Diversos.service.Printer;
import Diversos.service.ServiceStream;

public class ThreadIn implements Runnable{
	private Socket socket;
	
	public ThreadIn(Socket socket) {
		setSocket(socket);
	}
	@Override
	public void run() {
		do {
			try {
				String msg = ServiceStream.getObjIn(getSocket());
				Printer.print(msg);
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
		} while (true);
	}
	public Socket getSocket() {
		return socket;
	}
	public void setSocket(Socket socket) {
		this.socket = socket;
	}
	
}
