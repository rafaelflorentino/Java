package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
	public static void main(String[] args) {
		
		//Field [] campos = ServiceReflection.getFields(new PessoaVinculo());
		
		
		Class clazz = PessoaFisica.class;
		Field [] fields = clazz.getDeclaredFields();//traz os campos privadsos de uma classe
		for (Field field : fields) {//A - Nome, cpf e Conjuge
									//B - Nome e CPF
									//C - Conjuge
			System.out.println(field);
		}
		
		
		
		
		
		
		
		
		
//		// Objeto?
//		Class classe = Pessoa.class;
//		Class clazz = new Pessoa().getClass();
//		Method [] metodos = clazz.getMethods();
//		for (Method method : metodos) {
//			System.out.println(method);
//		}
//		
//		Field []fields = clazz.getDeclaredFields();
//		for (Field field : fields) {
//			System.out.println(field);
//		}
//		//Factory
//		try {
//			Class classe2 = Class.forName("br.ucb.beans.Pessoa");
//			Pessoa p = (Pessoa)classe2.newInstance();
//			System.out.println(classe2.getSuperclass());
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
}
