/* 
  Objetivo: Crie um programa em java que receba uma string e leia cada caracter da string e imprima na tela.
  Entrada: Sem entrada.
  Saida: Caracteres da String com espaço.
  Autor: Rafael Florentino.
*/
public class LerCaracteresString {
    public static void main(String[] args) {
        String nome="Rafael";
        for(char c:nome.toCharArray()){
            System.out.printf("%c ",c);
        }
    }
    
}
