package Diversos.service;

import Diversos.constantes.Constantes;
import Diversos.enums.Operacoes;

public class ClientUrlUtil {
	
	public static String leURL(){
		
		String url;
		do {
			url = MilaScanner.leString();
			if (!isTalpProtocol(url)&& !url.equalsIgnoreCase("end")) {
				Printer.print("Protocolo inesistente, tente novamente");
			}
		} while (!isTalpProtocol(url) && !url.equalsIgnoreCase("end"));
		return url;
	}
	public static StringBuffer getPossiveisOperacoes(){
		StringBuffer operacoes = new StringBuffer();
		for (Operacoes o : Operacoes.values()) {
			operacoes.append("\n"+o.toString());
		}
		return operacoes;
	}
	

	public static boolean isTalpProtocol(String url){
		return url.toUpperCase().contains(Constantes.PROTOCOLO_PADRAO.toUpperCase());
	}
	
//	public static boolean isPortaValid (String url){
//		try {
//			String args = new HostUrlUtil(url).getArgumentoAtIndex(Constantes.PORTA_ATENDIMENTO_INDICE);
//			new Integer(args.toString());
//			return true;
//		} catch (IllegalArgumentException e ) {
//			return false;
//		}  
//		catch (NumberFormatException e){
//			return false;
//		}
//	}
	
	public static int getPorta (String url){
		HostUrlUtil uu = new HostUrlUtil(url);
//		if (isPortaValid(url)) {
		try {
			return new Integer(uu.getArgumentoAtIndex(Constantes.PORTA_ATENDIMENTO_INDICE));
			
		} catch (ArrayIndexOutOfBoundsException e) {
			return -1;
		}
//		}
//		return -1;
	}
	
	public static String getHostIP(String url){
		HostUrlUtil uu = new HostUrlUtil(url);
		return (uu.getArgumentoAtIndex(Constantes.IP_SERVIDOR_INDICE));
	}
	
}
