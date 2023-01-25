/* 
  Objetivo: Crie um programa em java que verifique o operador e realize a operação correspondente. 
  Entrada: Sem entrada.
  Saida: Resultado da operação.
  Autor: Rafael Florentino.
*/
public class SwitchOperadores {
    public static void main(String[] args) {
        
        int n1, n2, res;
        String op="+";

        res=0;n1=10;n2=5;

        switch(op){
            case "+":
                res=n1+n2;
                break;
            case "-" :
                res=n1-n2;
                break;
            case "*":
                res=n1*n2;
                break;
            case "/":
                res=n1/n2;
                break;            
            default:
                res=0;
                System.out.println("\nOperacao invalida.");
                break;                            
        }
        System.out.printf("\nOperacao: %s Resultado: %d %n",op,res);
    }
}
