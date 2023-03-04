package Escola;

public class Interno extends Diretor{
	private int tempoCasa;
	@Override
	public int getIndice() {
		return getTempoCasa() * Constantes.FATOR_INTERNO;
	}
	public int getTempoCasa() {
		return tempoCasa;
	}
	public void setTempoCasa(int tempoCasa) {
		this.tempoCasa = tempoCasa;
	}
	
	
}
