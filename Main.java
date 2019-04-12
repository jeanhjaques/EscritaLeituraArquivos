import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[]args) throws IOException {
		File arquivo = new File( "/home/201619060485/eclipse-workspace/Testes/src/teste.txt");
		System.out.println("Arquivo Criado!");
		arquivo.createNewFile();
		boolean existe = arquivo.exists();
		System.out.println(existe);
		FileWriter fw = new	FileWriter(arquivo, true);
		BufferedWriter bw = new	BufferedWriter(fw);
		//escreve o conteúdo no arquivo
		bw.write("Texto a ser escrito no txt");
		//quebra de linha
		bw.newLine();
		bw.close();
		fw.close();
		//construtor que recebe o objeto do tipo arquivo
		FileReader fr = new	FileReader(arquivo);
		BufferedReader br = new BufferedReader( fr );
		//enquanto houver mais linhas
		while( br.ready() ){
			//lê a proxima linha
			String linha = br.readLine();
			//faz algo com a linha
			System.out.println(linha);
		}
		br.close();
		fr.close();
	}
}
