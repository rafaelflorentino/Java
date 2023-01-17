/* 
  Objetivo: Crie um programa em java que verifique a posição do pódio, e imprima na tela uma mensagem. 
  Entrada: Sem entrada.
  Saida: Colocação no pódio.
  Autor: Rafael Florentino.
*/
public class Switch {
    public static void main(String[] args) {
        int posicao = 7;

        switch(posicao){
            case 1:
                System.out.println("\nPrimeiro Lugar!!!");
                break;
            case 2 :
                System.out.println("\nSegundo Lugar!!");
                break;
            case 3:
                System.out.println("\nTerceiro Lugar!");
                break;
            case 4: case 5: case 6:
                System.out.println("\nNao subiu ao Podio mas ganhou Premio de Participacao.");
                break;            
            default:
                System.out.println("\nNao subiu ao Podio e Nao Ganhou Premio...");
                break;                            
        }
    }
}
