package ExercicioVeiculos;

public class Veiculo{
	private String marca;
	private float velocidade;
public void frea(){
	if(getVelocidade()>0)
		setVelocidade(velocidade--);
	}
public void acelera(){
	if(getVelocidade()<=10)
		setVelocidade(velocidade++);
	}
public String getMarca(){
	return marca;
}
public void setMarca(String marca){
	this.marca=marca;
}
public float getVelocidade(){
	return velocidade;
	}
public void setVelocidade(float velocidade){
	this.velocidade=velocidade;
	}
}