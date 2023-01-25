/* 
  Objetivo: Crie um programa em java que crie e preencha uma array de Carros 
  Entrada: Sem entrada.
  Saida: Array de carros e informações de cada carro.
  Autor: Rafael Florentino.
*/
package ExercicioArrayObjetos;

public class Main {
    public static void main(String[] args) {
         final int numCarros=5;
         Carro[] carros = new Carro[numCarros];
         String[] nomesCarros={"HRV","Golf","Camaro","Mustang","Toro"};

         for(int i = 0; i<numCarros;i++){
            carros[i] = new Carro(nomesCarros[i]);
         }

         for(Carro c:carros){
            c.info();
         }
    }    
}
