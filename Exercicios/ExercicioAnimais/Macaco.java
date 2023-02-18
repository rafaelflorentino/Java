package ExercicioAnimais;

public class Macaco extends Mamifero{
    private int porte; // 1-pequeno, 2-medio, 3-grande

    public Macaco(int tempoAmamentacao, int idade, String descicao, int tamanho){
        super(tempoAmamentacao,idade,descicao,tamanho);
    }
    public void ativarModoKingKong(){
        setDescricao("Enorme com 10 metros de altura, muito forte, e selvagem.");
        setPorte(porte + 10);
        setTam_adulto(getTam_adulto() + 10);
        setAnos_de_vida(getAnos_de_vida() + 10);
  
    }

	public int getPorte() {
		return porte;
	}

	public void setPorte(int porte) {
		this.porte = porte;
	}
}
