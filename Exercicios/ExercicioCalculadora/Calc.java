package ExercicioCalculadora;

import java.util.Scanner;
public class Calc{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Numero n1=new Numero(0);
        Numero n2=new Numero(0);
        Numero res=new Numero(0);
        String opc="S";

        while(opc.equals("s") || opc.equals("S")){
            System.out.printf("%nDigite o valor 1: ");
            n1.setValor(scan.nextInt());     
            System.out.printf("%nDigite o valor 2: ");
            n2.setValor(scan.nextInt());    
            res.setValor(n1.getValor() + n2.getValor());   
            System.out.printf("%nA soma de %d + %d = %d",n1.getValor(),n2.getValor(),res.getValor());
            System.out.printf("%n%nDeseja somar outro valor? (S/N): ");
            opc=scan.next();
            System.out.printf("%n");
        }
        scan.close();
    }
}