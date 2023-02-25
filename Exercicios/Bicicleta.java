/* 
  Objetivo: Crie um programa em java que simule uma bicicleta subindo e descendo uma ladeira, acelerando e freando e trocando de marchas.
  Entrada: CadenciaInicial, velocidadeInicial, marchaInicial, frear acelerar.
  Saida: Informações da bicileta.
  Autor: Rafael Florentino.
*/
public class Bicicleta {
    private int cadencia;
    private int marcha;
    private int velocidade;

    public Bicicleta(int cadenciaInicial, int velocidadeInicial, int marchaInicial) {
        marcha = marchaInicial;
        cadencia = cadenciaInicial;
        velocidade = velocidadeInicial;
    }

    public Bicicleta() {

    }

    public void info(){
        System.out.println("Velocidade Atual: "+getVelocidade() );
        System.out.println("Marcha Atual: "+getMarcha() );
        System.out.println("Cadencia Atual: "+getCadencia() );
    }

    public int getCadencia() {
        return cadencia;
    }

    public void setCadencia(int novoValor) {
        cadencia = novoValor;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int novoValor) {
        marcha = novoValor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void freiar(int decremento) {
        velocidade -= decremento;
    }

    public void acelerar(int incremento) {
        velocidade += incremento;
    }

    public static void main(String[] args) {
        
        // Começando a pedalar de vagar
        Bicicleta bike = new Bicicleta(2, 2, 1);
        bike.info();
        System.out.println(" ");

        // Pedalando mais rápido na descida
        bike.setMarcha(5);
        bike.setCadencia(25);
        bike.acelerar(50);
        bike.info();
        System.out.println(" ");

        // Pedalando mais Devagar na subida
        bike.freiar(50);
        bike.setMarcha(1);
        bike.setCadencia(2);
        bike.info();
    }
}