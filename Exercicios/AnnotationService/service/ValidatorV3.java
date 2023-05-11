package AnnotationService.service;

import java.lang.reflect.Field;
import java.util.ArrayList;

import AnnotationService.annotationsV2.NaoNulo;
import AnnotationService.annotationsV2.Numero;
import AnnotationService.annotationsV2.Texto;
import AnnotationService.exceptions.NaoNuloException;
import AnnotationService.exceptions.NumeroInvalidoException;
import AnnotationService.exceptions.TextoInvalidoException;

public class ValidatorV3 {
	
	public static ArrayList<String> validate(Object obj){
		Class<?> clazz = obj.getClass();
		ArrayList<String> msgErros = new ArrayList<String>();
		for (Field field : clazz.getDeclaredFields()) {
			if(field.isAnnotationPresent(NaoNulo.class)){
					try {
						naoNuloValidate(field, obj);
					} catch (NaoNuloException e) {
						msgErros.add(field.getAnnotation(NaoNulo.class).msgError());
//						e.printStackTrace();
					}
			}
			if(field.isAnnotationPresent(Texto.class)){
					try {
						textoValidate(field, obj);
					} catch (TextoInvalidoException e) {
						msgErros.add(field.getAnnotation(Texto.class).msgError());
//						e.printStackTrace();
					}
			}
			if(field.isAnnotationPresent(Numero.class)){
					try {
						numeroValidate(field, obj);
					} catch (NumeroInvalidoException e) {
						msgErros.add(field.getAnnotation(Numero.class).msgError());
//						e.printStackTrace();
					}			
			}
		}
		return msgErros;
		
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
		Texto texto = field.getAnnotation(Texto.class);
		int max = texto.tamanhoMax();
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
