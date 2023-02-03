/* 
  Objetivo: Crie um programa em java que salve dados em uma array depois leia e imprima os dados da arrya.
  Entrada: .
  Saida:
  Autor: Rafael Florentino.
*/
public class Strings2 {
    public static void main(String[] args) {
        
        char[] texto_c = {'c','u','r','s','o',' ','d','e', ' ','j','a','v','a'};
        char[] texto_c2 = new char[10];
        String texto_s = new String("Curso de PHP");
    
        String s1= new String(texto_c); // Recebe caracteres para criar uma nova string
        String s2= new String(texto_s); // Recebe uma string para criar uma nova string
        String s3= new String(texto_c,0,5);// Só recebe os caracteres da poisção 0 até a 5
       
    
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //length
        int tam = texto_s.length();
        System.out.println("\nTamanho do texto:"+tam);

        //charAt 
        char c;
        c=texto_s.charAt(2);
        System.out.println("\nCaracter da posição 2 e : "+c);

        //getChars
        texto_s.getChars(9, 12, texto_c2, 0); // Pega os caracteres da posicao 9 a 12
        System.out.println("\n");
        System.out.println(texto_c2);

        //equals
        String s4 = new String("Bruno");
        String s5 = "Bruno";

        if (s4 == s5) {
            System.out.println("s4 e igual a s5");
        }else{
            System.out.println("s4 e diferente de s5");
        }

    }


    
        
}
