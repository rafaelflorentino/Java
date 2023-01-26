/* 
  Objetivo: Crie um programa em java que receba o nome do aluno e faça perguntas ao usuário e receba a resposta alternativa(a, b ou c), ao final se o
  usuario tiver acertado >= 6 recebe mensagem de Aprovado., senao recebe mensagem de Reprovado.
  Entrada: Nome, respostas.
  Saida: Nome e uma Mensagem de Aprovado ou Reprovado.
  Autor: Rafael Florentino.
*/
package Exercicioquestoes;
import java.util.Scanner;

public class Questoes2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        final int numPerguntas = 5;
        int pontoQuestao = 2;
        char[] gabarito={'a','c','b','a','c'};
        String[] perguntas={
            "Qual e a maior estrela do sistema solar?",
            "Qual e a primeira letra do alfabeto?",
            "2X10 e igual a?",
            "O Fantastico mundo de ___. (desenho dos anos 80)",
            "Qual e o valor de PI?",
        };
        String[] alternativas={
           "a)Sol, | b)Lua  | c)Marte",
           "a)Z    | b)C    | c)A",
           "a)10   | b)20   | c)12",
           "a)Bob  | b)Carl | c)Zec",
           "a)3.10 | b)3    | c)3.14",
        };
        char[] respostas = new char[numPerguntas];
        char resp;
        int nota=0;
        String aluno;
        
        System.out.print("Digite o seu nome: ");
        aluno = scanner.nextLine();

        for(int i=0; i<numPerguntas; i++){
            System.out.println("-----------------------------------------"); 
            System.out.printf("\nPergunta %d \n",i+1); 
            System.out.printf("%s\n",perguntas[i]);  
            System.out.printf("%s\n",alternativas[i]); 
            resp= scanner.nextLine().charAt(0);
            respostas[i]=resp;           
        }
        System.out.printf("%s\n","Fim da prova, confira o resultado");
        for(int i=0;i<numPerguntas;i++){
            if(gabarito[i]==respostas[i]){
                nota+=pontoQuestao;
            }
        }
        System.out.printf("%s sua nota foi %d, voce foi %s",aluno,nota,nota>=6?"Aprovado":"Reprovado");
        scanner.close();
    }    
}