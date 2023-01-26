/* 
  Objetivo: Crie um programa em java que receba o nome e faça perguntas ao usuário e receba a resposta alternativa(a, b ou c), ao final se o
  usuario tiver acertado > 3 recebe mensagem de Passou!!!, senao recebe mensagem de Reprovou.
  Entrada: Nome, respostas.
  Saida: Nome e uma Mensagem de Aprovado ou Reprovado.
  Autor: Rafael Florentino.
*/
package Exercicioquestoes;
import java.util.Scanner;

public class Questoes {
    public static void main(String[] args) {
        String nome;
        char resposta;
        int resultado=0;
        Scanner scanner= new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        nome = scanner.next();

        // Pergunta 1
        System.out.println("-----------------------------------------"); 
        System.out.println("Pergunta 1"); 
        System.out.println("Qual e a maior estrela do sistema solar?");
        System.out.println("a)Sol | b)Lua | c)Marte");
        resposta = scanner.next().charAt(0);
        if(resposta == 'a'){
            resultado++;
        }
        // Pergunta 2
        System.out.println("-----------------------------------------"); 
        System.out.println("Pergunta 2"); 
        System.out.println("Qual e a primeira letra do alfabeto?");
        System.out.println("a)Z | b)C | c)A");
        resposta = scanner.next().charAt(0);
        if(resposta == 'c'){
            resultado++;
        }        
        // Pergunta 3
        System.out.println("-----------------------------------------"); 
        System.out.println("Pergunta 3"); 
        System.out.println("2X10 e igual a?");
        System.out.println("a)10 | b)20 | c)12");
        resposta = scanner.next().charAt(0);
        if(resposta == 'b'){
            resultado++;
        }          
        // Pergunta 4
        System.out.println("-----------------------------------------"); 
        System.out.println("Pergunta 4"); 
        System.out.println("O Fantastico mundo de ___. (desenho dos anos 80)"); 
        System.out.println("a)Bob | b)Carl | c)Zec");
        resposta = scanner.next().charAt(0);
        if(resposta == 'a'){
            resultado++;
        }         
        // Pergunta 5
        System.out.println("-----------------------------------------"); 
        System.out.println("Pergunta 5"); 
        System.out.println("Qual e o valor de PI?"); 
        System.out.println("a)3.10 | b)3 | c)3.14");
        resposta = scanner.next().charAt(0);
        if(resposta == 'c'){
            resultado++;
        }         
        // Resultado
        System.out.printf("\n%s Voce acertou: %d de 5 Questões. ", nome.toUpperCase(),resultado);
        System.out.printf("\nSituação do aluno: %s", resultado > 3 ? "Passou!!!" : "Reprovou.");

        scanner.close();
    }    
}
