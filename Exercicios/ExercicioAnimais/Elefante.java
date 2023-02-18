package ExercicioAnimais;

public class Elefante extends Mamifero {
    private int peso;

    public Elefante(int tempoAmamentacao, int vive, String descricao, int tamanho){
        super(tempoAmamentacao,vive,descricao,tamanho);
	}

    public void informar(){
        System.out.println("O som que o elefante faz se chama bramido!!!");
        System.out.println("O tempo de amamentação de um elefante e de: "+getAnos_de_amamentacao()+" Anos.");
        System.out.println("Um Elefante vive: "+getAnos_de_vida()+" Anos.");
        System.out.println("O tamanho de um Elefante e de: "+getAnos_de_vida());
        System.out.println("O elefante pesa: "+getPeso());
        System.out.println("Descrição de um elefante: "+getDescricao());
    }

    public void EmitirSom(){
        System.out.println("fuumm uuuuh");
    }

	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
}
