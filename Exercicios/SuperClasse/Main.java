/* 
  Objetivo: Crie um programa em java que utilize o construtor da super classe, tenha um metodo final, e sobrescereva uma método
  da sua classe pai(o metodo f1()).
  Entrada: Sem entrada.
  Saida: Mensagem do construtor, mensagem do método f1().
  Autor: Rafael Florentino.
*/
package SuperClasse;

public class Main {
    public static void main(String[] args) {
        Subclasse s = new Subclasse();
        s.f1();
        s.f2();
    }
}
// Subclasse f1
// Superclasse f1