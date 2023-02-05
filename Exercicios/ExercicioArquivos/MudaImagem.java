/* 
  Objetivo: Crie um programa em java que pega os dados binários da logo antiga e da logo nova, e mude os dados da logo antiga 
  com os dados da logo nova, apresente uma mensagem e erro ou sucesso. 
  Entrada: Sem entrada.
  Saida: Uma mensagem e erro ou sucesso. 
  Autor: Rafael Florentino.
*/
package ExercicioArquivos;

import java.nio.file.Path;
import java.nio.file.*;

public class MudaImagem {
    public static void main(String[] args) {

        Path logoAntiga = Paths.get("C:/Users/enter/Desktop/Projetos/Java/Exercicios/ExercicioArquivos/imgs/logoAntiga.png");
        //Path logoAntigaBackup = Paths.get("C:/Users/enter/Desktop/Projetos/Java/Exercicios/ExercicioArquivos/imgs/logoAntiga.png");
        Path logoNova = Paths.get("C:/Users/enter/Desktop/Projetos/Java/Exercicios/ExercicioArquivos/imgs/logoNova.png");

        try {
            byte[] bytesLogoNova = Files.readAllBytes(logoNova); // Cria uma array de bytes e recebe todos os bytes do arquivo.
            Files.write(logoAntiga,bytesLogoNova); // arquivo onde sera escrito, dados do outro arquivo para escrever.
            System.out.println("Imagem trocada com sucesso");
        } catch (Exception e) {
            System.out.println("Erro");
        }
        
    }
    
}
