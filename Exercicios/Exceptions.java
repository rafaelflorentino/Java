import java.util.ArrayList;

public class Exceptions {
    public static void main(String[] args) {
        int nota1 = 60, nota2 = 20, res;
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(22);
        numeros.add(33);

        // Criando Exceções
        if (nota1 > 50) {
            throw new IllegalArgumentException("Valor de nota invalido");
        }
        if (nota2 > 50) {
            throw new IllegalArgumentException("Valor de nota invalido");
        }
        res = nota1 + nota2;
        System.out.println("Resultado: " + res);

        // Tratamento de Erro
        try {
            System.out.println("\n" + numeros.get(10)); // Posição na array não exite.
        } catch (IndexOutOfBoundsException e) {
            System.out.println("\nERRO 1: " + e.getMessage());
            System.out.println("Valor fora do indice do array. ");
        } catch (ClassCastException e) {
            System.out.println("\nERRO2: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("\nERRO3: " + e.getMessage());
        } finally {
            System.out.println("Fim do Try"); // No final do try se tiver entrado em algum erro, sai essa mensagem.
        }

    }

}
