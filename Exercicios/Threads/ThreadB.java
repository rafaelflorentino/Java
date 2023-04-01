package Threads;

public class ThreadB extends Thread{
	@Override
	public void run() {
		long cont = 0;
		while(cont < 10000)
			System.out.println((cont++)+"Thread B: "+this.getName());
	}
}
