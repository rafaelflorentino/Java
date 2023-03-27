/* 
  Objetivo: Crie um programa que use map, filter collect.
  Entrada: Sem entrada.
  Saida:  impressão dos dados na tela.
  Autor: Rafael Florentino.
*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streamss {
    public static void main(String[] args) {

        ArrayList<String> citys = new ArrayList<>();
        citys.add("Maceió");
        citys.add("Natal");
        citys.add("Goiânia");
        citys.add( "Brasília");
        citys.add("São Paulo");
        citys.add("Curitiba");
      
        
        List<String> cidades = citys;
            List<String> resultado = cidades.stream()
            .filter(cidade -> cidade.length() > 5)
            .sorted(Comparator.reverseOrder())
            .map(String::toUpperCase)
            .collect(Collectors.toList());    
            
            System.out.println("\n"+resultado); 
    }
}
