import java.security.SecureRandom;
/* 
  Objetivo: Crie um programa em java com uma função para gerar dados de uma matriz, e outra para ler os dados gerados.
  Entrada: Sem entrada.
  Saida: Impressão dos dados da matriz gerados na tela.
  Autor: Rafael Florentino.
*/
public class MatrizFuncao {
    public static void main(String[] args) {
        final int linha=3;
        final int coluna=5;
        int[][] numeros = new int[linha][coluna];

        gerarDados(numeros, linha, coluna);
        imprimirDados(numeros, linha, coluna);
        
    }

    public static void gerarDados(int[][] matriz, int linhas, int colunas){
        for(int l=0; l < linhas; l++){
            for(int c=0; c < colunas; c++){
                matriz[l][c]=new SecureRandom().nextInt(100); // gerar números aleatórios
            }
        }
    }

    public static void imprimirDados(int[][] matriz, int linhas, int colunas){
        for( int l=0; l < linhas; l++){
            for(int c=0; c < colunas; c++){
                System.out.printf("%d - ",matriz[l][c]);
            }
            System.out.printf("%n");
        }
    }
    
}
