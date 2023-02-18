/* 
  Objetivo: Crie um programa em java que tenha os objetos macaco, baleia, elefante que herdam de mamifero o metodo construtor.
  Entrada: Sem entrada.
  Saida: Mensagem dos métodos.
  Autor: Rafael Florentino.
*/
package ExercicioAnimais;

public class Main {
    public static void main(String[] args) {
        Elefante elefante = new Elefante(15,40,"Grande e cinza",2);
        Macaco macaco = new Macaco(12, 15, "Sapeca e sobe em arvores", 1);
        Baleia baleia = new Baleia(13, 70, "Grande azul", 400,"Oceano");
      
        System.out.println(elefante.getAnos_de_amamentacao()+" Anos");
        elefante.setPeso(150);
        System.out.println(elefante.getPeso()+" Kilos");
        elefante.EmitirSom();
        elefante.informar();
        System.out.println("\n");

        macaco.informar();
        macaco.ativarModoKingKong();
        macaco.informar();
        System.out.println("\n");

        baleia.informar();
    }
    
}
