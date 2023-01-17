/* 
  Objetivo: Crie um programa em java que calcule a média das 3 notas e diga se o aluno foi aprovado ou não média >=6.
  Entrada: Nome, e as3 notas.
  Saida: Nome, média, e mensagem de aprovado ou reprovado.
  Autor: Rafael Florentino.
*/
import java.util.Scanner;

public class EntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float nota1 = 0, nota2 = 0, nota3=0, resultado = 0;
        final int MEDIA=6;
        String nome="";

        System.out.print("Digite seu nome: ");
        nome=scanner.next();
        System.out.print("Digite a primeira nota: ");
        nota1=scanner.nextInt();
        System.out.print("Digite a segunda nota: ");
        nota2=scanner.nextInt();
        System.out.print("Digite a terceira nota: ");
        nota3=scanner.nextInt();
        resultado=(nota1 + nota2 + nota3) / 3;

        System.out.printf("\n%s a sua media e igual a: %2.2f ",nome,resultado);
        System.out.printf(resultado >= MEDIA ? "Aprovado!":"Reprovado.");

        scanner.close();
    }
}
