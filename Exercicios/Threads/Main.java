/* 
  Objetivo: Crie um programa em java que utilize Threads
  Entrada: Sem entrada.
  Saida: Sem saida.
  Autor: Rafael Florentino.
*/
package Threads;

public class Main {
	public static void main(String[] args) {
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();//a
		tb.start();
		ta.start();
		
		Thread threadC = new Thread(new ThreadC()); //b
		threadC.start();
		
		
	}
}

