package ExercicioVeiculos;

public class Camionete extends Veiculo{
	private boolean carga;
	
	public boolean getCarga(){
		return carga;
	}
	public void setCarga(boolean cargaParametro){
		this.carga=cargaParametro;
	}
	public void carrega(){
		carga=true;
	}
	public void descarrega(){
		carga=false;
	}
}