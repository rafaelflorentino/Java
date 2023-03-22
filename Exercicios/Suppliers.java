/* 
  Objetivo: Crie um programa que use expressoes lambda e utilize supplier, gere números aletórios
  Entrada: Sem entrada.
  Saida:  Números aleatórios.
  Autor: Rafael Florentino.
*/
import java.util.Optional;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class Suppliers {
    public static void main(String[] args) {
        Supplier<Double> doubleSupplier1 = () -> Math.random();
        DoubleSupplier doubleSupplier2 = Math::random;
        System.out.println(doubleSupplier1.get());
        System.out.println(doubleSupplier2.getAsDouble());  
        
        Supplier<Double> doubleSupplier = () -> Math.random();
        Optional<Double> optionalDouble = Optional.empty();
        System.out.println(optionalDouble.orElseGet(doubleSupplier));           
    }
}
