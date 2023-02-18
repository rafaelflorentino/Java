package ExercicioAnimais;

public class Baleia extends Mamifero{
    private int peso;
	private String habitat;
	
	public Baleia(int tempoAmamentacao, int idade, String descicao, int tamanho){
        super(tempoAmamentacao,idade,descicao,tamanho);
	}
	public Baleia(int tempoAmamentacao, int idade, String descicao, int tamanho, String habitat){
        super(tempoAmamentacao,idade,descicao,tamanho);
		setHabitat(habitat);
	}
	public void informar(){
		System.out.println("Baleia Bufa: uuh uuh");
		System.out.println("Baleia vive no: "+getHabitat());
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
}
