package Loteria.modelo.bean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Loteria.service.Constantes;



public class Loteria {

	private List<Integer> numerosLoteria;
	
	//############################## CONSTRUTOR ############################################
	public Loteria() {
		setNumerosLoteria(new ArrayList<Integer>());
	}
	
	//############################## M�TODOS ###############################################
	public static List<Integer> getNumerosLoteriaSorteados(){
		
		List<Integer> numerosSorteados = new ArrayList<Integer>();
		List<Integer> numerosLoteria = new ArrayList<Integer>();


		for (int i = 1; i <= Constantes.QUANTIDADE_TOTAL_NUMEROS_LOTERIA; i++) 
			numerosSorteados.add(i);			
		
		Collections.shuffle(numerosSorteados); // Embaralhar n�meros
		
		for (int i = 1; i <= Constantes.QUANTIDADE_SORTEIO_LOTERIA; i++) 
			numerosLoteria.add(numerosSorteados.get(i));
			
		return numerosLoteria;					

	}

	//############################## GETTERES AND SETTERES ################################
	public ArrayList<Integer> getNumerosLoteria() {
		return (ArrayList<Integer>) numerosLoteria;
	}

	public void setNumerosLoteria(ArrayList<Integer> numerosLoteria) {
		this.numerosLoteria = numerosLoteria;
	}
}
