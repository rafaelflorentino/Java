package AnnotationService.main;

import java.util.ArrayList;

import AnnotationService.beans.AlguemV2;
import AnnotationService.service.ValidatorV3;

public class MainV3 {
	public static void main(String[] args) {
		
		System.out.println("Main V3");
		AlguemV2 a = new AlguemV2(773, "camilaaa");
		ArrayList<String> erros = ValidatorV3.validate(a);
		for (String string : erros) {
			System.out.println(string);
		}
	}
}
