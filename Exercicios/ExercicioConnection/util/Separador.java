package ExercicioConnection.util;

import java.util.HashMap;
import java.util.Hashtable;

import ExercicioConnection.exceptions.OperacaoNotFoundException;
import ExercicioConnection.exceptions.ValueIsNotInteger;

public class Separador {
	
	public static HashMap<String, String> separarString(String url) {
		HashMap<String, String> stringSeparada = new HashMap<String, String>();
		stringSeparada.put("protocolo", url.substring(0,url.indexOf(":")));
		String nova = url.substring(url.lastIndexOf("/"));
		nova = nova.replaceFirst("/","");
		stringSeparada.put("operacao",nova.substring(0, nova.indexOf("?")));
		String valor1 = nova.substring(nova.indexOf("="), nova.indexOf("&"));
		valor1 = valor1.replace("=", "");
		stringSeparada.put("valor1",valor1);
		String valor2 = nova.substring(nova.lastIndexOf("="), nova.lastIndexOf(""));
		valor2 = valor2.replace("=", "");
		stringSeparada.put("valor2",valor2);
		return stringSeparada;
	}
	
	

}
