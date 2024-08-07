import java.util.ArrayList;
import java.util.List;

public class Veiculo {
    private String marca;
    private String modelo; 
    private int anoFabricacao;
    private int anoModelo;
    private double motorizacao;
    private double capacidadeTanque;
    private String tipoCombustivel;
    private String cor;
    private String placa; 
    private String renavam;
    List<Abastecimento> abastecimentos;


    public Veiculo(String marca, String modelo, int anoFabricacao, int anoModelo, double motorizacao,
        double capacidadeTanque, String tipoCombustivel, String cor, String placa, String renavam) {
        setMarca(marca);
        setModelo(modelo);
        setAnoFabricacao(anoFabricacao);
        setAnoModelo(anoModelo);
        setMotorizacao(motorizacao);
        setCapacidadeTanque(capacidadeTanque);
        setTipoCombustivel(tipoCombustivel);
        setCor(cor);
        setPlaca(placa);
        setRenavam(renavam);
        setAbastecimentos(new ArrayList<>());
    }

    @Override
    public String toString() {
        return "Dados Veiculo [\nmarca = " + getMarca() + ", \nmodelo = " + getModelo() + ", \nanoFabricacao = " + getAnoFabricacao() + ", \nanoModelo = "
                + getAnoModelo() + ", \nmotorizacao = " + getMotorizacao() + ", \ncapacidadeTanque = " + getCapacidadeTanque() + ", \ntipoCombustivel = " + getTipoCombustivel() + ", \ncor = " + getCor()
                + ", \nplaca = " + getPlaca() + ", \nrenavam = " + getRenavam() + "]";
    }

    public void registrarAbastecimento(double valorAbastecido, double quantidadeCombustivel, double quilometragem) {
        Abastecimento abastecimento = new Abastecimento(valorAbastecido, quantidadeCombustivel, quilometragem);
        this.abastecimentos.add(abastecimento);
    }

    public double calcularConsumoMedio() {
        if (abastecimentos.size() < 2) {
            return 0; // Não há dados suficientes para calcular o consumo médio
        }

        double totalQuilometros = 0;
        double totalCombustivel = 0;

        for (int i = 1; i < abastecimentos.size(); i++) {
            Abastecimento anterior = abastecimentos.get(i - 1);
            Abastecimento atual = abastecimentos.get(i);

            totalQuilometros += atual.quilometragem - anterior.quilometragem;
            totalCombustivel += atual.quantidadeCombustivel;
        }

        return totalQuilometros / totalCombustivel;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public int getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }
    public double getMotorizacao() {
        return motorizacao;
    }
    public void setMotorizacao(double motorizacao) {
        this.motorizacao = motorizacao;
    }
    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }
    public void setCapacidadeTanque(double capacidadeTanque2) {
        this.capacidadeTanque = capacidadeTanque2;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getRenavam() {
        return renavam;
    }
    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public List<Abastecimento> getAbastecimentos() {
        return abastecimentos;
    }

    public void setAbastecimentos(List<Abastecimento> abastecimentos) {
        this.abastecimentos = abastecimentos;
    } 

    
}
