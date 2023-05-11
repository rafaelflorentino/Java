package AnnotationService.main;

import AnnotationService.beans.Alguem;
import AnnotationService.exceptions.NaoNuloException;
import AnnotationService.exceptions.NumeroInvalidoException;
import AnnotationService.exceptions.TextoInvalidoException;
import AnnotationService.service.Validator;

public class Main {
	public static void main(String[] args) {
		
		Alguem a = new Alguem(140, null);
		try {
			Validator.validate(a);
		} catch (NaoNuloException e) {
			System.out.println("Atributo nulo");
			e.printStackTrace();
		} catch (TextoInvalidoException e) {
			System.out.println("Texto invalido");
			e.printStackTrace();
		} catch (NumeroInvalidoException e) {
			System.out.println("Numero invalido");
			e.printStackTrace();
		}
	}
}
