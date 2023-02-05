/* 
  Objetivo: Crie um programa em java que use Lambida
  Entrada: Sem entrada.
  Saida:  Impressão dos dados da lista.
  Autor: Rafael Florentino.
*/ 
import java.util.ArrayList;
import java.util.function.Consumer;

public class FuncaoLambda {
    public static void main(String[] args) {
        
        ArrayList<Integer>valores = new ArrayList<Integer>();
        ArrayList<Integer>dobro = new ArrayList<Integer>();
        ArrayList<Integer>par = new ArrayList<Integer>();
        ArrayList<Integer>impar = new ArrayList<Integer>();

        ArrayList<Integer>triplo = new ArrayList<Integer>();

        // Adicionando valores na arrau valores
        valores.add(1);
        valores.add(2);
        valores.add(3);
        valores.add(4);
        valores.add(5);
        valores.add(6);

        System.out.println(valores);
        System.out.println("\n");

        // Jeito 01
        Consumer<Integer> triplicar = (v)-> {triplo.add(v*3);};
        valores.forEach(triplicar);
        System.out.println(triplo);  
        System.out.println("\n");

        // Jeito 02
        valores.forEach((v)->{
            dobro.add(v*2);
            if(v%2 == 0){
                par.add(v);
            }else{
                impar.add(v);
            }
        });

        System.out.println(valores);
        System.out.println(dobro);  
        System.out.println(par);  
        System.out.println(impar);  
        System.out.println("\n");   
        
    }
}
