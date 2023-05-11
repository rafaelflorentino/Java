package AnnotationService.service;

import java.lang.reflect.Field;
import java.util.ArrayList;

import AnnotationService.annotationsV2.NaoNulo;
import AnnotationService.annotationsV2.Numero;
import AnnotationService.annotationsV2.Texto;

public class ValidatorV2 {
	
	public static ArrayList<String> validate(Object obj){
		Class<?> clazz = obj.getClass();
		ArrayList<String> msgErros = new ArrayList<String>();
		for (Field field : clazz.getDeclaredFields()) {
			if(field.isAnnotationPresent(NaoNulo.class)){
					String msg = naoNuloValidate(field, obj);
					if (msg != null) {
						msgErros.add(msg);
					}
			}
			if(field.isAnnotationPresent(Texto.class)){
					String msg = textoValidate(field, obj);
					if (msg != null) {
						msgErros.add(msg);
					}
			}
			if(field.isAnnotationPresent(Numero.class)){
					String msg = numeroValidate(field, obj);	
					if (msg != null) {
						msgErros.add(msg);
					}
			}
		}
		return msgErros;
		
	}
	public static String numeroValidate(Field field, Object obj){
		field.setAccessible(true);
		Numero numero = field.getAnnotation(Numero.class);
		int min = numero.min();
		int max = numero.max();
		try {
			int valor = (int) field.get(obj);
			if (valor < min || valor > max) {
				return field.getAnnotation(Numero.class).msgError();
			}
		} catch ( IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String naoNuloValidate(Field field, Object obj){
		field.setAccessible(true);
		try {
			if (field.get(obj) == null) {
				return field.getAnnotation(NaoNulo.class).msgError();
			}
		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
		} catch (IllegalAccessException e) {
//			e.printStackTrace();
		}
		return null;
	}
	
	public static String textoValidate (Field field, Object obj){
		field.setAccessible(true);
		Texto texto = field.getAnnotation(Texto.class);
		int max = texto.tamanhoMax();
		try {
			if (field.get(obj) != null) {
			String str = (String)field.get(obj);
				if (str.length() > max) {
					return field.getAnnotation(Texto.class).msgError();
				}
			}
		} catch (IllegalArgumentException e) {
//				e.printStackTrace();
		} catch (IllegalAccessException e) {
//				e.printStackTrace();
		}
		return null;
	}
	
}
