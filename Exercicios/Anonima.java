/* 
  Objetivo: Crie um programa em java que crie uma interface é intancie uma classe anônima
  Entrada: Sem entrada.
  Saida:  Mensagem de Olá.
  Autor: Rafael Florentino.
*/
abstract class Pessoa { // classe abstrata
    abstract void saudar();
}

public class Anonima{ 
    public static void main(String[] args) {
        Pessoa p = new Pessoa() { // classe anonima para implementar uma interface Pessoa
            void saudar(){ // Não pode declarar contrutores em uma classe Anônima
                System.out.println("Olá");
            }
        };
        p.saudar();
        
    }
}