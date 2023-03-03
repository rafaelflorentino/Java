/* 
  Objetivo: Crie um programa em java que utilize classes Genéricas.
  Entrada: Sem entrada.
  Saida: Mensagem de textos.
  Autor: Rafael Florentino.
*/
package Genericos;

public class Main {
    public static void main(String[] args) {
        Integer i = 45;
        String s = "Rafael";
        Caixa c = new Caixa();

        CaixaTipo<String> cx = new CaixaTipo<String>(); // cx Só vai aceitar tipo String
        CaixaTipo<String> cx2 = new CaixaTipo<>(); // Pode omitir String do segundo diamante
        CaixaTipo<Integer> cx3 = new CaixaTipo<Integer>(); // Só irá aceitar inteiro
        ParOrdenado<Integer, String> chaveValor = new ParOrdenado<Integer, String>(16,"Rafael");
        
        c.set(i);
        System.out.println(c.get());

        c.set(32.6);
        System.out.println(c.get());

        c.set("texto");
        System.out.println(c.get());

        cx.set(s); // cx Só aceita String
        System.out.println(cx.get());

        cx2.set("sdfsf");// cx2 Só aceita String
        System.out.println(cx2.get());

        cx3.set(334);// cx3 Só aceita Inteiro
        System.out.println(cx3.get());

        System.out.println("Chave: "+chaveValor.getChave());
        System.out.println("Valor: "+chaveValor.getValor());

        Teste t = new Teste();

        Par<String, Integer> p0 = new ParOrdenado<String, Integer>("três", 3);
        Par<String, Integer> p1 = new ParOrdenado<String, Integer>("oito", 8);
        Par<String, String> p2 = new ParOrdenado<String, String>("olá", "mundo");
        System.out.println(t.comparar(p0, p1));
        System.out.println(p2);
                

    }

}
