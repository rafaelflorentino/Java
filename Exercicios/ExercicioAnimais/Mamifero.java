package ExercicioAnimais;

public class Mamifero {
    private int anos_de_amamentacao;
	private int anos_de_vida;
	private String descricao;
	private int tam_adulto;

    public Mamifero(int tempoAmamentacao, int vive, String descricao, int tamanho){
        setAnos_de_amamentacao(tempoAmamentacao);
        setAnos_de_vida(vive);
        setDescricao(descricao);
        setTam_adulto(tamanho);
    }
    public void informar(){
        System.out.println("O Anima produz ruidos");
        System.out.println("O tempo de amamentação do Animal é de: "+getAnos_de_amamentacao()+" Anos.");
        System.out.println("O animal vive: "+getAnos_de_vida()+" Anos.");
        System.out.println("O tamanho do animal é: "+getAnos_de_vida());
        System.out.println("Descrição: "+getDescricao());
    }
    public void EmitirSom(){
        System.out.println("zuuuuummmmm");
    }

	public int getAnos_de_amamentacao() {
		return anos_de_amamentacao;
	}
	public void setAnos_de_amamentacao(int anos_de_amamentacao) {
		this.anos_de_amamentacao = anos_de_amamentacao;
	}
	public int getAnos_de_vida() {
		return anos_de_vida;
	}
	public void setAnos_de_vida(int anos_de_vida) {
		this.anos_de_vida = anos_de_vida;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getTam_adulto() {
		return tam_adulto;
	}
	public void setTam_adulto(int tam_adulto) {
		this.tam_adulto = tam_adulto;
	}
}
