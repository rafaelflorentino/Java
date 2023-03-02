/* 
  Objetivo: Crie um programa em java que utilize printf, format, DecimalFormat.
  Entrada: Sem entrada.
  Saida: Mensagem formatada, nmeros formatados.
  Autor: Rafael Florentino.
*/
import java.text.DecimalFormat;

public class MetodoFormat {
    public static void main(String[] args) {
        float floatVar = 1.0f;
        int intVar = 10;
        String stringVar = "olá";

        System.out.format("O valor da variável float é %f,\n" +
                "e o valor da variável inteira é %d,\n" +
                "já a string é %s", floatVar, intVar, stringVar);
        System.out.printf("\n");
        System.out.println("\n");
       
        // Decimal format
        customFormat("###,###.###", 123456.789);
        customFormat("###.##", 123456.789);
        customFormat("000000.000", 123.78);
        customFormat("$###,###.###", 12345.67);

    }

    // Decimal format
    static public void customFormat(String pattern, double valor ) {
        DecimalFormat meuFormatador = new DecimalFormat(pattern);
        String output = meuFormatador.format(valor);
        System.out.println(valor + " " + pattern + " " + output);
    }
}