package ExercicioVeiculos;

public class Carro extends Veiculo {
	private boolean status;
	public void liga(){
		status=true;
	}
	public void desliga(){
		status=false;
	}
	public boolean getStatus(){
		return status;
	}
	public void setStatus(boolean status){
		this.status=status;
	}
}
