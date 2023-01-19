/* 
  Objetivo: Crie um programa em java que crie carros, com blindagem, que liguem, atirem(munição diminui a cada tiro) e sofram danos(a blindagem diminui ao sofrer danos
  caso o dano sofrido seja maior que a blindagem o carro fica destruido e é desligado).
  Entrada: Sem entrada.
  Saida: Informações dos carros.
  Autor: Rafael Florentino.
*/
package ExercioHerenca;

public class Principal {
    public static void main(String[] args) {

        Carro c1 = new Carro("Golf");
        Carro c2 = new Carro("HRV");
        CarroCombate c3 = new CarroCombate("Leopardo", 100);
        CarroCombate c4 = new CarroCombate("Pantera", 50);

        c1.setLigado(true);
        c3.setLigado(true);

        c3.atirar();
        c3.atirar();
        c3.atirar();
        c3.atirar();
        c3.atirar();
        c3.sofrerDano(30);
        c4.sofrerDano(150);
        c1.sofrerDano(5);

        c1.info();
        c2.info();
        c3.info();
        c4.info();
    }   
}
