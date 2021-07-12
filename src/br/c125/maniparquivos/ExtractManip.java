package br.c125.maniparquivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ExtractManip {

	static String texto = null;
	static String idString = null;
	static String nome = null;
	static String tipo = null;
	static String vida = null;
	static String ataque = null;
	static String defesa = null;
	static String pokeInfo = null;
	static int idCopia = 0;

	// Faz a leitura do conteúdo do arquivo
	public static String LeituraExtract(String arquivoNome, int id, int info) {

		texto = null;
		idString = null;
		nome = null;
		tipo = null;
		vida = null;
		ataque = null;
		defesa = null;
		pokeInfo = null;
		idCopia = id;
		int cont = 1;

		try {
			InputStream input = new FileInputStream(arquivoNome);
			Reader inputSR = new InputStreamReader(input);
			BufferedReader leitor = new BufferedReader(inputSR);

			texto = leitor.readLine();
			
			while (cont <= id * 6) {

				if (cont == (6 * id - 5)) {

					texto = leitor.readLine();
					idString = texto;
				}

				if (cont == (6 * id - 4)) {

					texto = leitor.readLine();
					nome = texto;
				}

				if (cont == (6 * id - 3)) {

					texto = leitor.readLine();
					tipo = texto;
				}

				if (cont == (6 * id - 2)) {

					texto = leitor.readLine();
					vida = texto;
				}

				if (cont == (6 * id - 1)) {

					texto = leitor.readLine();
					ataque = texto;
				}
				if (cont == (6 * id)) {

					texto = leitor.readLine();
					defesa = texto;
				}

				pokeInfo = idString + "\n" + nome + "\n" + tipo + "\n" + vida + "\n" + ataque + "\n" + defesa + "\n";

				cont++;

			}
			leitor.close(); // Para fechar o arquivo

		} catch (FileNotFoundException e) {
			System.out.println("Arquivo " + arquivoNome + " não encontrado.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		switch (info) {
		case 1:
			return nome;
		case 2:
			return tipo;
		case 3:
			return vida;
		case 4:
			return ataque;
		case 5:
			return defesa;
		case 6:
			return pokeInfo;

		}
		return null;

	}

	// Getter
	/*
	 * public static int getContLinha() { contLinha = 0;
	 * LeituraExtract("extractData", idCopia); return contLinha;
	 */
}
