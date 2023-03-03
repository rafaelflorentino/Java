/* 
  Objetivo: Crie um programa em java que utilize StringBuilder.
  Entrada: Sem entrada.
  Saida: Mensagem de textos.
  Autor: Rafael Florentino.
*/

public class StringBuilderClasse {
    public static void main(String[] args) {

        // Strings são objetos não variáveis, o valor da string nao e alterado
        String s = "Olá" ;
        s.concat("Mundo!");
        System.out.println(s);

        // é necessário atribuir para conseguir Mudar o valor da string
        s = s.concat("Mundo!");
        System.out.println(s);


        // StringBuilder São objetos variáveis, alteram a si mesmos
        StringBuilder sb = new StringBuilder("hello");
        sb.append(" Word");
        sb.append("!");
        System.out.println(sb);
    }
}
