/**
 * 
 */
package ColecoesOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author danmoreira28
 */
public class ColecoesOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		listaDeNomes();

	}

	private static void listaDeNomes() {
		System.out.println("###Lista de Nomes###");
		List<String> listaDeNomes = new	ArrayList<String>();
		
		listaDeNomes.add("Danilo Moreira");
		listaDeNomes.add("Amanda Ribeiro");
		listaDeNomes.add("Pedro Silva");
		listaDeNomes.add("Gilson Mariano");
		listaDeNomes.add("Beatriz Silveira");
		listaDeNomes.add("Karina Souza");
		
		System.out.println(listaDeNomes);
		System.out.println("########");
		Collections.sort(listaDeNomes);
		System.out.println(listaDeNomes);
	}

}
