package aula20190723.introdução_oo;

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
		
		listarPessoasNoConsole(lista);
		
		float médiaDasIdades = calcularIdadeMédiaDasPessoas(lista);
		System.out.println("A média das idades é: " + médiaDasIdades);
		
		Pessoa pessoaMaisVelha = recuperarPessoaMaisVelha(lista);
		System.out.println("A pessoa mais velha é: " + pessoaMaisVelha.nome);
		
		Pessoa pessoaMaisNova = recuperarPessoaMaisNova(lista);		
		System.out.println("A pessoa mais nova é: " + pessoaMaisNova.nome);
		
		
		System.out.println("Fim.");
	}

	
	public static float calcularIdadeMédiaDasPessoas(List<Pessoa> lista) {
		float média = 0.00f;
		
		float soma = 0.00f;
		for (Pessoa pessoaDaVez : lista) {
			soma += pessoaDaVez.idade;
		}
		média = soma/lista.size();
		
		return média;
	}
	
	public static void listarPessoasNoConsole(List<Pessoa> lista) {
		for (int posição = 0; posição < lista.size(); posição++) {
			//Pessoa pessoaNaPosicao = lista[contador]
			Pessoa pessoaNaPosicao = lista.get(posição);
			System.out.println(posição + "= Nome: " + pessoaNaPosicao.nome + ", idade: " + pessoaNaPosicao.idade);
		}
	}
	
	
	
}
