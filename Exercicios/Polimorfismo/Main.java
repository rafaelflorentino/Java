/* 
  Objetivo: Crie um programa em java que utilize polimorfismo no método fazSom().
  Entrada: Sem entrada.
  Saida: Som do animal.
  Autor: Rafael Florentino.
*/
package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cao cao = new Cao();
        Gato gato = new Gato();
        animal.fazSom();
        cao.fazSom();
        gato.fazSom();
    }
}
