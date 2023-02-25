/* 
  Objetivo: Crie um programa em java que mostre a diferença entre referência de tipos primitivos e objetos
  Entrada: Números.
  Saida: Soma dos números, valor da marcha.
  Autor: Rafael Florentino.
*/
public class ArgsPrimitivosXobjetos {
    public static void main(String[] args) {
        // Metodos em Tipos primitivos não altera o valor da variável x
        int x = 10;
        System.out.println("Tipo Primitivo, variável não tem Referência");
        System.out.println("x antes de incrementa: " + x);

        incrementa(x); // Não altera o valor de x fora do método
        System.out.println("x depois de incrementa: " + x);
        System.out.println("\n");

        
        // Métodos em Objetos intânciados alteram o valor do objeto
        System.out.println("Tipo Objeto, Objeto tem referência");
        Bicicleta b = new Bicicleta(1,1,1);
        System.out.println("b.getMarcha() antes da funcao: "+b.getMarcha());

        alterar(b); // Altera o valor de b dentro é fora do método
        System.out.println("b.getMarcha() depois da funcao: " + b.getMarcha());
    }

    public static void incrementa(int v) {
        v = v + 1;
        System.out.println("v dentro de incrementa: " + v);
    }

    public static void alterar(Bicicleta o) {
        o.setMarcha(5);
        System.out.println("o.getMarcha() dentro da função: " + o.getMarcha());
    }
}

