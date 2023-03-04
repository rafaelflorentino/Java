
/* 
  Objetivo: Crie um programa em java trabalhe com exceções e com tru e catch
  Entrada: Sem entrada.
  Saida: Resultado, mensagem de sucesso ou de erro.
  Autor: Rafael Florentino.
*/
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
// Tipos de Exceções
// Exceções verificadas (checked exceptions) em tempo de copilação, precisa se tratadas (try catch) fileNotFoundException
// Exceções não verificadas (unchecked exceptions)  Durante a execução do programa (tentar acessa indece fora de uma matriz) arrayIndexfBoudsException
// Erros geralmente são ignorados, acabou a memória do pc
// Trowable -> Erros, Exceptions
// Exceptions -> Runtime, outras exceptions

// throws = Adia o tratamento de uma exceção
// throw = Lança uma exceção explicitamente

public class Exceptions {
    public static void main(String[] args) {
        int nota1 = 60, nota2 = 20, res;
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(22);
        numeros.add(33);

        // Exceções
        try {
            int a[] = new int[2];
            System.out.println("Acessando o terceiro elemento: " + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception lançada: " + e);
        }
        System.out.println("Fora do bloco!");

        // Tratamento de Erro
        try {
            System.out.println("\n" + numeros.get(10)); // Posição na array não exite.
        } catch (IndexOutOfBoundsException e) {
            System.out.println("\nERRO 1: " + e.getMessage());
            System.out.println("Valor fora do indice do array. ");
        } catch (ClassCastException e) {
            System.out.println("\nERRO2: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("\nERRO3: " + e.getMessage()); // retorna mensagem detalhada da exceção
            System.out.println("\nERRO3: " + e.getCause()); // retorna a causa
        } finally { // finally sempre sera executado dando erro um não dando erro
            System.out.println("Fim do Try"); // No final do try se tiver entrado em algum erro, sai essa mensagem.
        }

        // Tratamento de Erro
        int a1[] = new int[2];
        try {
            System.out.println("Acessando o terceiro elemento: " + a1[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exceção lançada: " + e);
        } finally { // finally sempre sera executado
            a1[0] = 6;
            System.out.println("Valor do primeiro elemento: " + a1[0]);
            System.out.println("O bloco finally é executado");
        }

        // try com recursos
        FileReader fr = null;
        try {
            File file = new File("arquivo.txt");
            fr = new FileReader(file);
            char[] a = new char[50];
            fr.read(a);
            for (char c : a)
                System.out.print(c);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try { // ao final ira fechar o arquivo
                fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        // try com
        try (FileReader fread = new FileReader("arquivo.txt")) {
            char[] a = new char[50];
            fread.read(a);
            for (char c : a)
                System.out.print(c);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Criando Exceções trava o programa
        if (nota1 > 50) {
            throw new IllegalArgumentException("Valor de nota invalido");
        }
        if (nota2 > 50) {
            throw new IllegalArgumentException("Valor de nota invalido");
        }
        res = nota1 + nota2;
        System.out.println("Resultado: " + res);
    }

}
