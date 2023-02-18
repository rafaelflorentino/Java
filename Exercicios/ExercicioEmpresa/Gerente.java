package ExercicioEmpresa;

public class Gerente extends Empregado{
    private float comissao;
	
	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	public float getSalario() {
		return super.getSalario()+getComissao();
	}

}
