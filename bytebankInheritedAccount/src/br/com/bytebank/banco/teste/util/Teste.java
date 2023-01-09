package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		int idade = 29;
		Integer idadeRef = 29;
		
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idadeRef);
		
		System.out.println(numeros);
		
		String s = args[0];
		
//		Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		
		System.out.println(numero);
		
	}

}
