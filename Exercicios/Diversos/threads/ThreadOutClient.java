package Diversos.threads;

import java.io.IOException;
import java.net.Socket;

import Diversos.service.ServiceStream;

public class ThreadOutClient implements Runnable{
	private Socket socket;
	private String msg;
	
	public ThreadOutClient(Socket socket, String msg) {
		setSocket(socket);
		setMsg(msg);
	}
	@Override
	public void run() {
		do {
			try {
				ServiceStream.getObjOut(getSocket(),getMsg());
			} catch (IOException e) {
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
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}
