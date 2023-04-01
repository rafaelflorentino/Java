package Threads;

public class ThreadC implements Runnable{
	@Override
	public void run() {
		long cont = 0;
		while(cont < 10000)
			System.out.println((cont++)+"Thread C: ");
	}
}
//Design Pattern Strategy