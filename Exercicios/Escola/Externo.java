package Escola;

public class Externo extends Diretor{
	private int qtdPublicacoes;

	public int getQtdPublicacoes() {
		return qtdPublicacoes;
	}

	public void setQtdPublicacoes(int qtdPublicacoes) {
		this.qtdPublicacoes = qtdPublicacoes;
	}

	@Override
	public int getIndice() {
		return getQtdPublicacoes() * Constantes.FATOR_EXTERNO;
	}
}
