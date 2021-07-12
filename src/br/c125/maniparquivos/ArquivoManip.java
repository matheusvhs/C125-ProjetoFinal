package br.c125.maniparquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class ArquivoManip {
	
	private static int contLinha = 0;

	// Realiza escrita no arquivo
	public static void EscritaDeArquivo(String frase, String arquivoNome) {

		try {
			OutputStream arquivo = new FileOutputStream(arquivoNome, true);
			OutputStreamWriter writer = new OutputStreamWriter(arquivo);
			BufferedWriter bWriter = new BufferedWriter(writer);

			bWriter.write(frase + "\n");

			bWriter.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.getMessage();
		}
	}

	public static int getContLinha() {
		contLinha = 0;
		LeituraDeArquivo("arquivoCountID");
		return contLinha;
	}

	// Faz a leitura do conteúdo do arquivo
	public static void LeituraDeArquivo(String arquivoNome) {

		String texto = null;
		

		try {
			InputStream input = new FileInputStream(arquivoNome);
			Reader inputSR = new InputStreamReader(input);
			BufferedReader leitor = new BufferedReader(inputSR);

			texto = leitor.readLine();
			
			System.out.println("Pokemóns existentes:\n ");
			
			while (texto != null) {
				contLinha++;
				System.out.println(texto);
				texto = leitor.readLine(); // Esse método irá ler uma linha do arquivo, quando o arquivo chegar ao fim
											// readline retorna null
				
			}
			leitor.close(); // Para fechar o arquivo

		} catch (FileNotFoundException e) {
			System.out.println("Arquivo " + arquivoNome + " não encontrado.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
