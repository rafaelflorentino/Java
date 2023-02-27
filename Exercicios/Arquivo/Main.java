/* 
  Objetivo: Crie um programa em java que Receba os dados de uma pessoa e salve em um arquivo binário, e salve uma frase
  em um arquivo.txt. 
  Entrada: Sem entrada.
  Saida: Arquivo binário contendo os dados da pessoa cadastradae um arquivo .txt contendo uma frase.
  Autor: Rafael Florentino.
*/
package Arquivo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) throws IOException {
		gravar("Nada se Perde, nada se Cria, tudo se Transforma.", "Exercicios/Arquivo/Texte.txt");
		System.out.println(ler("Texte.txt"));
		
		Pessoa p = new Pessoa("Rafael", "45665465421");
		gravarBin(p);
	}

    // Função para gravar Frase em arquivo txt
	public static void gravar(String texto, String arquivo) throws IOException{
			File file = new File(arquivo);
			FileWriter escritor = new FileWriter(file);
			char []array = texto.toCharArray();
			for (char c : array) {
				escritor.write(c);
			}
			escritor.close();
	}

    // Função para gravar o objeto Pessoa em arquivo binário
	public static void gravarBin(Pessoa p) throws IOException{
		// Arquivos
		File arquivo = new File("Exercicios/Arquivo/arquivoObjetos.txt");
		
		FileOutputStream stream = new FileOutputStream(arquivo);
		// Escrever no stream
		ObjectOutputStream streamObjetos = new ObjectOutputStream(stream);
		
		streamObjetos.writeObject(p);
		streamObjetos.close();
		stream.close();
	}

    // Ler dados do arquivo txt
	public static String ler(String arquivo) throws IOException{
		File file = new File(arquivo);
		FileReader leitor = new FileReader(file);
		
		StringBuilder texto = new StringBuilder();
		
		int c;
		while((c = leitor.read()) != -1) {
			texto.append((char)c);
		}
		
		leitor.close();
		return texto.toString();
	}
	
}	