package Diversos.service;

import java.net.Socket;
import java.text.DateFormat;
import java.util.Calendar;

import Diversos.constantes.Constantes;
import Diversos.exceptions.recursoNotFoundException;
import Diversos.interfaces.OperacaoMath;

public class InfoOperacao{
	private String url;
	private HostUrlUtil urlUtil;
	private Socket socket;
	
	@Override
	public String toString() {
		return "\n#STATUS: "+ getStatus()+
		"\n#DATA: "+getData()+
		"\n#HORA: "+getHora()+
		"\n#PROTOCOLO: "+getProtocolo()+
		"\n#IP_SOLICITANTE: "+getIpSolicitante()+
		"\n#VALOR1: "+getUrlUtil().getStringValue1()+
		"\n#VALOR2: "+getUrlUtil().getStringValue2()+
		"\n#OPERACAO: "+getUrlUtil().getOperacao()+ 
		"\n#RESULTADO: "+getResultado();
	}
	
	public InfoOperacao(String url, Socket socket) {
		setUrl(url);
		setSocket(socket);
		
		setUrlUtil(new HostUrlUtil(url));
	}

	public double doOperacao(OperacaoMath operacao, int a, int b){
		return operacao.doOperacao(a, b);
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public HostUrlUtil getUrlUtil() {
		return urlUtil;
	}
	public void setUrlUtil(HostUrlUtil urlValidator) {
		this.urlUtil = urlValidator;
	}
	
	
	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	//-------------------------------------------------------------------------
	public String getProtocolo() {
		return Constantes.PROTOCOLO_PADRAO;
	}
	public String getData(){
		return DateFormat.getDateInstance().format(Calendar.getInstance().getTime());
	}
	public String getHora(){
		return DateFormat.getTimeInstance(DateFormat.SHORT).format(Calendar.getInstance().getTime());
	}
	public String getStatus(){
		try {
			if (getUrlUtil().hasValidValues()) {
				return Constantes.STATUS_CORRETO;
			}else{
				return Constantes.STATUS_VALORES_EXCEPTION;
			}
		} catch (recursoNotFoundException e) {
			return Constantes.STATUS_RECURSO_INVALIDO;
		}
	}
	
	/**
	 * 
	 * @return resultado da operacao com os argumentos passados, se algo estiver errado, -1;
	 */
	public String getResultado(){
		String status = getStatus();
		if (status.equals(Constantes.STATUS_CORRETO)) {
			return ""+doOperacao(getUrlUtil().getOperacao(), getUrlUtil().getIntValidValor1(), getUrlUtil().getIntValidValor2());
		}else{
			return null;
		}
	}
	
	public String getIpSolicitante (){
		return getSocket().getInetAddress().toString();
	}
	
}
