package aula20190722.introdução_oo;

//import java.util.List;
//import java.util.ArrayList; 

import java.util.*;

public class ProgramaPrincipal {
		
	//+ main(args : String[]) : void
	//  ____________________________	
	//�: com sublinhado!!! :D
	public static void main(String[] args) {
		
		Pessoa josinaldo = new Pessoa();
		josinaldo.nome = "Josinaldo Castro Moura";
		josinaldo.idade = 19;
		
		Pessoa ana = new Pessoa();
		ana.nome = "Ana Maria de Almeida";
		ana.idade = 18;
		
		List<Pessoa> lista = new ArrayList<Pessoa>();
		lista.add(ana);
		lista.add(josinaldo);
		
		for (int posição = 0; posição < lista.size(); posição++) {
			//Pessoa pessoaNaPosicao = lista[contador]
			Pessoa pessoaNaPosicao = lista.get(posição);
			System.out.println(posição + "= Nome: " + pessoaNaPosicao.nome + ", idade: " + pessoaNaPosicao.idade);
		}
		
		
		/*
		List<Pessoa> lista = new ArrayList<Pessoa>();
		lista.add(new Pessoa("Josinaldo Castro Moura", 19));
		lista.add(new Pessoa("Ana Maria de Almeida", 18));
		
		int posição = 0;
		//usando um foreach para percorrer a lista do primeiro até o último elemento seu usar um contador.
		for (Pessoa pessoaNaPosicao  : lista) {
			System.out.println(posição++ + "= Nome: " + pessoaNaPosicao.nome + ", idade: " + pessoaNaPosicao.idade);
		}
		*/
		
		System.out.println("Fim.");
	}
	
	
	
	
}
