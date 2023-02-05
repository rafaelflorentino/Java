/* 
  Objetivo: Crie um programa em java verifique se um diretorio existe, se um arquivo existe e abra esse arquivo 
  e imprima o conteúdo do arquivo na tela.
  Entrada: Sem entrada.
  Saida: Mensagem dos metodos. 
  Autor: Rafael Florentino.
*/
package ExercicioArquivos;
//import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Principal {
    public static void main(String[] args)  { // throws IOException maneira 01 para não dar erro ao ler o arquivo
        Path diretorio = Paths.get("C:/Users/enter/Desktop/Projetos/Java/Exercicios/ExercicioArquivos");
        Path arquivo = Paths.get("C:/Users/enter/Desktop/Projetos/Java/Exercicios/ExercicioArquivos/texto.txt");

        // Verificar se o diretorio existe
        if(Files.isDirectory(diretorio)){
            System.out.println("Diretorio existe");
        }else{
            System.out.println("Diretorio não existe");
        }

        // Verificar se o arquivo existe
        if(Files.exists(arquivo)){
            System.out.println("Arquivo existe");
        }else{
            System.out.println("Arquivo não existe");
        }   
        System.out.println("\n");


        // Maneira 02 de abrir o arquivo sem dar erro.
        // opreações criticas devem ficar dentro de um try catch.
        try {
            List<String> linhas = Files.readAllLines(arquivo); // Cria uma lista de linhas e recebe cada lista do arquivo.

            // Ler Linha por Linha do Arquivo.
            for(String linha:linhas){
                System.out.println(linha);
            }
            System.out.println("\n");

            // ler com forEach
            linhas.forEach(linha -> System.out.println(linha));            
        } catch (Exception e) {
            System.out.println("Erro ao Abrir o arquivo.");
        }
           
    }
    
}
