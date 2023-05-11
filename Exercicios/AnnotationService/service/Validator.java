package AnnotationService.service;

import java.lang.reflect.Field;

import AnnotationService.annotations.NaoNulo;
import AnnotationService.annotations.Numero;
import AnnotationService.annotations.Texto;
import AnnotationService.exceptions.NaoNuloException;
import AnnotationService.exceptions.NumeroInvalidoException;
import AnnotationService.exceptions.TextoInvalidoException;

public class Validator {
	
	public static void validate(Object obj) throws NaoNuloException, TextoInvalidoException, NumeroInvalidoException{
		Class<?> clazz = obj.getClass();
		for (Field field : clazz.getDeclaredFields()) {
			if(field.isAnnotationPresent(NaoNulo.class)){
					naoNuloValidate(field, obj);
			}
			if(field.isAnnotationPresent(Texto.class)){
					textoValidate(field, obj);
			}
			if(field.isAnnotationPresent(Numero.class)){
					numeroValidate(field, obj);			
			}
		}
		
	}
	public static void numeroValidate(Field field, Object obj)throws NumeroInvalidoException{
		field.setAccessible(true);
		Numero numero = field.getAnnotation(Numero.class);
		int min = numero.min();
		int max = numero.max();
		try {
			int valor = (int) field.get(obj);
			if (valor < min || valor > max) {
				throw new NumeroInvalidoException();
			}
		} catch ( IllegalAccessException e) {
//			e.printStackTrace();
		}
	}
	
	public static void naoNuloValidate(Field field, Object obj) throws NaoNuloException{
		field.setAccessible(true);
		try {
			if (field.get(obj) == null) {
				throw new NaoNuloException();
			}
		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
		} catch (IllegalAccessException e) {
//			e.printStackTrace();
		}
	}
	
	public static void textoValidate (Field field, Object obj) throws TextoInvalidoException{
		field.setAccessible(true);
		Texto texto = field.getAnnotation(Texto.class);//pega a anotacao
		int max = texto.tamanhoMax(); //para descobrir os seus parametros
		try {
			if (field.get(obj) != null) {
			String str = (String)field.get(obj);
				if (str.length() > max) {
					throw new TextoInvalidoException();
				}
			}
		} catch (IllegalArgumentException e) {
//				e.printStackTrace();
		} catch (IllegalAccessException e) {
//				e.printStackTrace();
		}
	}
	
}
