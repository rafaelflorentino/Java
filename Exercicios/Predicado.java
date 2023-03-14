/* 
  Objetivo: Crie um programa em java que crie e use Predicate
  Entrada: Sem entrada.
  Saida:  Números.
  Autor: Rafael Florentino.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(5);
        numeros.add(9);
        numeros.add(8);
        numeros.add(1);
        numeros.add(7);
                
        List<Integer> nums = numeros;
        MaiorQueCinco<Integer> mqc = new MaiorQueCinco<>();
        nums.stream().filter(mqc).forEach(System.out::println); // stream = passagem de varios dados; filter = filtragem de elementos de uma coleção
    }
}
// Predicate e uma interface genérica
class MaiorQueCinco<E> implements Predicate<Integer> { // Predicatdo do tipo inteiro
    @Override
    public boolean test(Integer v) { // Método funcional da interface rpedicate e test
        return v > 5;  // Retorna verdadeiro ou falso
    }
}
