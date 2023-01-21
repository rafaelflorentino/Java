/* 
  Objetivo: Crie um programa em java que crie uma classe veiculo, e aviao aviao herda metodo info de  veiculos;
  Entrada: Sem entrada.
  Saida: Dados do veiculo, avião.
  Autor: Rafael Florentino.
*/
package ExercicioSuperClasse;
public class Main {
    public static void main(String[] args) {
        Aviao v1 = new Aviao("Voador",1);       
        v1.info();
    }
}
