/* 
  Objetivo: Crie um programa em java utilise os principais metodos da string
  Entrada: Sem entrada.
  Saida: Mensagem dos metodos.
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

        // length - Tamanho da string
        System.out.println("\nLength");
        int tam = texto_s.length();
        System.out.println("\nTamanho do texto:"+tam);

        // charAt - Posição do caracter na string
        System.out.println("\nCharAt");
        char c;
        c=texto_s.charAt(2);
        System.out.println("\nCaracter da posição 2 e : "+c);

        // getChars - Pega os caracteres nas posicões passadas
        System.out.println("\nGetChars");
        texto_s.getChars(9, 12, texto_c2, 0); // Pega os caracteres da posicao 9 a 12
        System.out.println(texto_c2);

        // equals - Verifica se um string é iguais, maior ou menor que outra string
        String s4 = new String("Bruno");
        String s5 = "Bruno";
        String s6 = "Bruno";
        String s7 = "bruno";
        String s8 = "carlos";

        if (s4 == s5) { // Diferentes pois s4 é um objeto instaciado 
            System.out.println("s4 e igual a s5");
        }else{
            System.out.println("s4 e diferente de s5");
        }

        if (s5 == s6) { // Iguais s5 e s6 strings
            System.out.println("s5 e igual a s6");
        }else{
            System.out.println("s5 e diferente de s6");
        }

        // Sempre Usar o equals para comparar as strings, equal (não ignora maisculos e minusculos)
        System.out.println("\nEquals");
        if (s4.equals(s5)) { // Iguais s4 e s5  com ignore case
            System.out.println("s4 e igual a s5");
        }else{
            System.out.println("s4 e diferente de s5");
        }
        
        // equalIgnoreCase - (ignora maisculos e minusculos)
        System.out.println("\nEqualIgnoreCase");
        if (s4.equalsIgnoreCase(s7)) { // Iguais s4 e s7 com equalIgnoreCase
            System.out.println("s4 e igual a s7");
        }else{
            System.out.println("s4 e diferente de s7");
        }
        
        
        // compareTo - Retorna um inteiro se a string for maior, menor ou igual.
        System.out.println("\ncompareTo");
        System.out.println(s4.compareTo(s5)); // retorna: 0 é igual.
        System.out.println(s4.compareTo(s7)); // retorna negatico: -32 é menor.
        int tamanho = s7.compareTo(s4); // retorna positivo: 32 e maior.
        System.out.println(tamanho);
        

        // regionMatches - true:ignora upercase, 0: posicçao inicial de s4, s8: string que sera comaprada, 0: posicao de inicio em s8 3: posicao de fim em s8
        System.out.println("\nRegionMatches");
        if (s4.regionMatches(true,0,s8,0,3)) { 
            System.out.println("s4 e igual a s8");
        }else{
            System.out.println("s4 e diferente de s8");
        }
        

        // starsWith - Testa se o começo da string contem o texto
        System.out.println("\nStarsWith");
        String texto= "Cursos de Java";

        if(texto.startsWith("Curso")){
            System.out.println("Comeca com Curso: ");
        }else{
            System.out.println("Não Comeca com Curso: ");
        }

       
         // endsWidth - Testa se o final da string contem o texto
        System.out.println("\nEndsWidth");
         
        if(texto.endsWith("Java")){
            System.out.println("Termina com Java: ");
        }else{
            System.out.println("Não Termina com Java: ");
        }

        // indexOf - Fala a posição do caractere na string
        System.out.println("\nIndexOf");
        System.out.println(texto.indexOf('J'));

        // substring - Corta a string das posições que vc passar, inicio e final
        System.out.println("\nSubstring");
        System.out.println(texto.substring(7,14));

        // concat - Junta duas strings
        System.out.println("\nConcat");
        String t1 = "Curso";
        String t2 = " de Programação";
        String t3;
        String t4 = "   dddd  ddd  ddd   ";
        System.out.println(t1.concat(t2));

        // replace - Substitui caracter por outro, gera nova string
        System.out.println("\nReplace");
        t3=t2.replace('a', '@');
        System.out.println(t3);

        // toLowerCase e toUpperCase - Minusculo e maiusculo
        System.out.println("\nToLowerCase e ToUpperCase");
        System.out.println(t1.toLowerCase());  
        System.out.println(t1.toUpperCase()); 
        
        // trim - Remove os espaços em braco do começo e do fim
        System.out.println("\nTrim");
        System.out.println(t4);  
        System.out.println(t4.trim());

        // toCharArray - Convert uma string em uma array de caracteres.
        System.out.println("\nToCharArray");
        char[] caracteres =t1.toCharArray();
        System.out.println(caracteres); 
        
        // split - Separa a String em um ponto e traz uma nova array
        String[] s9= t2.split(" "); // onnde tiver espaço corta e trandorma em nova array.
        for(String s: s9){
            System.out.println(s); 
        }
    }   
}
