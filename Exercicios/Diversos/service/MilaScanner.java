package Diversos.service;
import java.util.Scanner;


public class MilaScanner {

	public static String leString(){
		return new Scanner(System.in).nextLine();
	}
	public static String leString(String msg){
		System.out.println(msg);
		return leString();
	}
}
