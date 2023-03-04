package Escola;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Direcao {
	private List<Diretor> diretores;
	
	
	public ArrayList<Diretor> ordenar(){
		ArrayList<Diretor> diretoresClonados = new ArrayList<Diretor>();
		diretoresClonados.addAll(getDiretores());
		Collections.sort(diretoresClonados);
		return diretoresClonados;
	}
	
	public ArrayList<Diretor> findByIdade(int idade){
		ArrayList<Diretor> diretoresPelaIdade = new ArrayList<Diretor>();
		for (Diretor diretor : getDiretores()) {
			if(diretor.getIdade() > idade)
				diretoresPelaIdade.add(diretor);
		}
		return diretoresPelaIdade;
	}
	public Diretor findTheBestOfTheBest(){
		int maior = 0;
		Diretor sinistro = null;
		for (Diretor diretor : getDiretores()) {
			if(diretor.getIndice() > maior){
				maior = diretor.getIndice();
				sinistro = diretor;
			}
		}
		return sinistro;
	}
	
	
	public Direcao() {
		setDiretores(new ArrayList<Diretor>());
	}

	public List<Diretor> getDiretores() {
		return diretores;
	}

	public void setDiretores(List<Diretor> diretores) {
		this.diretores = diretores;
	}
	
}
