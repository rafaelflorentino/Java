package AnnotationService.main;

import java.util.ArrayList;

import AnnotationService.beans.AlguemV2;
import AnnotationService.service.ValidatorV2;

public class MainV2 {
	public static void main(String[] args) {
		
		System.out.println("Main");
		AlguemV2 a = new AlguemV2(773, "camilaaa");
		ArrayList<String> erros = ValidatorV2.validate(a);
		for (String string : erros) {
			System.out.println(string);
		}
	}
}
