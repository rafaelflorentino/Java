package Diversos.service;

import Diversos.constantes.Constantes;
import Diversos.enums.Operacoes;
import Diversos.exceptions.recursoNotFoundException;

public class HostUrlUtil{
	private String requestURL;
	
	
	public HostUrlUtil(String requestURL) {
		setRequestURL(requestURL);
	}
	public Operacoes getOperacao(){
		for (Operacoes operacao : Operacoes.values()) {
			//somar � igual a Operacoes.SOMAR
			if (getRequestURL().toUpperCase().contains(operacao.name().toUpperCase())) {
				return operacao;
			}
		}
		return null;
	}
	
	public boolean hasOperacao()throws recursoNotFoundException{
		if (getOperacao() instanceof Operacoes) {
			return true;
		}
		throw new recursoNotFoundException();
	}
	
	
	
	public boolean hasValues (){
		if ((hasValue(Constantes.VALOR1)) || 
				(hasValue(Constantes.VALOR2))) {
			return true;
		}
		return false;
	}
	public boolean hasValue (String valueName){
		if ((getRequestURL().toUpperCase().contains(valueName))) {
			return true;
		}
		return false;
	}
	public boolean hasValue1(){
		return hasValue(Constantes.VALOR1);
	}
	public boolean hasValue2(){
		return hasValue(Constantes.VALOR2);
	}
	
	
	
	 /*
	  * retorna -1 se n�o existir o texto na url, ou o local do texto no array
	  */
	public int findLocalTexto(String texto){
		String [] url = quebraURL();
		for (int i = 0; i < url.length; i++) {
			if (url[i].equalsIgnoreCase(texto)) {
				return i;
			}
		}
		return -1;
	}
	public boolean hasValidValor1 (){
		return hasValidValor(Constantes.VALOR1);
	}
	public boolean hasValidValor2 (){
		return hasValidValor(Constantes.VALOR2);
	}
	
	public boolean hasValidValor (String argumentName){
		int local = findLocalTexto(argumentName);
		if (local != -1) {
			try {
				String StrValor = quebraURL()[local+1];
				new Double(StrValor);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}catch (ArrayIndexOutOfBoundsException e) {
				return false;
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @param argumentName
	 * @return String valor seguinte ao nome do argumento passado, null se argumento nao encontrado
	 */
	public String getValue (String argumentName){
		int local = findLocalTexto(argumentName);
		if (local != -1) {
			try {
				String StrValor = quebraURL()[local+1];
				return StrValor;
			} catch (ArrayIndexOutOfBoundsException e) {
				return "";
			}
		}
		return null;
	}
	/**
	 * 
	 * @return valor, -1 se invalido
	 */
	public int getIntValidValor1(){
		if (hasValidValor1()) {
			return new Integer(getValue(Constantes.VALOR1));
		}
		return -1;
	}
	
	/**
	 * 
	 * @return valor, -1 se invalido
	 */
	public int getIntValidValor2(){
		if (hasValidValor1()) {
			return new Integer(getValue(Constantes.VALOR2));
		}
		return -1;
	}
	
	public String getStringValue1(){
		if (hasValue1()) {
			return getValue(Constantes.VALOR1);
		}
		return null;
	}
	public String getStringValue2(){
		if (hasValue1()) {
			return getValue(Constantes.VALOR2);
		}
		return null;
	}
	
	private String[] quebraURL(){
//		talp://IP_SERVIDOR:PORTA_DE_ATENDIMENTO/soar?valor1=A&valor2=50
//		0  - talp
//		1  - 
//		2  - 
//		3  - IP_SERVIDOR
//		4  - PORTA_DE_ATENDIMENTO
//		5  - soar
//		6  - valor1
//		7  - A
//		8  - valor2
//		9  - 50
		String []pedacos = getRequestURL().split("\\:|\\=|\\&|\\?|\\/");
		return pedacos;
	}
	
	public String getArgumentoAtIndex(int index){
		return quebraURL()[index];
	}
	
	public  boolean isValidUrl (){
		try {
			return (hasOperacao() && hasValues());
		} catch (recursoNotFoundException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean hasValidValues() throws recursoNotFoundException{
			return (hasValidValor1() && hasValidValor2() && hasOperacao());
	}
	public String getRequestURL() {
		return requestURL;
	}
	
	public void setRequestURL(String requestURL) {
		this.requestURL = requestURL;
	}
}

