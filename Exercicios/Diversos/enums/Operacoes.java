package Diversos.enums;

import Diversos.interfaces.OperacaoMath;

public enum Operacoes implements OperacaoMath{
 SOMAR{
	 @Override
	 public double doOperacao(int a, int b) {
	 	return a + b;
	 }
 },
 SUBTRAIR{
	 @Override
	 public double doOperacao(int a, int b) {
	 	return a - b;
	 }  
 },
 MULTIPLICAR{
	 @Override
	 public double doOperacao(int a, int b) {
	 	return a * b;
	 }
 } , 
 DIVIDIR{
	 @Override
	 public double doOperacao(int a, int b) {
	 	return b == 0 ? 0 : a / b;
	 } 
 };
 

 
 public static Operacoes getByOrdinal(int ordinal){
	 for (Operacoes operacao : values()) {
		if (operacao.ordinal() == ordinal) {
			return operacao;
		}
	}
	 return null;
 }
 
 public static Operacoes getByNome(String nome){
	 for (Operacoes operacao : values()) {
		 if (operacao.name().equalsIgnoreCase(nome)) {
			return operacao;
		}
	 }
	 return null;
 }


}
