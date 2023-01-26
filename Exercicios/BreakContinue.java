/* 
  Objetivo: Crie um programa em java que imprimar numeros de 0 a 100 e utilize break e continue. 
  Entrada: Sem entrada.
  Saida: Números de 1 a 100.
  Autor: Rafael Florentino.
*/
public class BreakContinue {
    public static void main(String[] args) {
        int cont=100;
        for(int i=0;i<cont;i++){
            System.out.printf("%d -",i);
            if(i >= 10 ){ // quando chegar no 10 encerra o loop
                break; // para a execução e entrega para o comando seguinte
            }
        }
        System.out.printf("\n\n ");

        for(int i=0;i<cont;i++){           
            if(i >= 10 && i<=60){
                continue; // interrompe a iteração corrente e pula para proxima interação
            }
            System.out.printf("%d -",i);// de 10 a 60 o codigo não vai chegar aqui, so antes de 10 e depois de 60
        }
    }
}
