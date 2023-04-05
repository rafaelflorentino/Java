package Loteria.service;

import java.util.Scanner;

public class Reader {

	
	//############################## INT  ###############################################
	
	public static int lerInt(){
		return new Scanner(System.in).nextInt();
	}
	
	public static int lerInt(String msg){
		System.out.println(msg);
		return lerInt();
	}
	
	public static int lerInt(String msg, String msgErro, int min, int max){
		
		int valor = 0;
		boolean erro;
		
		do{
			erro = false;
			try{
				valor = lerInt(msg);
				if(valor < min || valor > max){
					erro = true;
					System.err.println(msgErro);
				}
					
			}catch (NumberFormatException e){
				System.err.println("Informe apenas n�meros inteiros.");
			}
		}while(erro == true);
		
		return valor;
	}
	
	//############################## STRING ############################################
	public static String lerString(){
		return  new Scanner (System.in).nextLine();
		
		
		
	}
	
	public static String lerString (String msg){
		System.out.println(msg);
		return lerString();
	}
	
	public static String lerString (String msg, String msgErro){
		
		String string;
		boolean erro = false;
		
		do{
			string = lerString(msg);
			erro = string.isEmpty() || string.startsWith(" ") || string.equalsIgnoreCase(null);
			if(erro)
				System.err.println(msgErro);
		}while(erro);
		
		return string;
		
	}
}

