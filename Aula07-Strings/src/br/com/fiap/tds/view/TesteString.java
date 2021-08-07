package br.com.fiap.tds.view;

public class TesteString {
	
	public static void main(String[] args) {
		
		//\t -> tabulacao \" -> exibe as " \n -> quebra de linha
		System.out.println("\"Analise de Sistemas\" \n FIAP");
		
		//Declarar uma variavel para armazenar um nome
		String nome = "Gondo";
		
		//Cria uma nova String e associa a variavel nome
		//nome = nome + " Eduardo";
		
		String nome2 = new String("Gondo");
		
		//Colocar o nome completo
		nome2 += " Eduardo"; //nome2 = nome2 + " Eduardo";
		System.out.println(nome2);
		
		//Concatenar com o metodo .concat
		nome = nome.concat(" eduardo");
		
		
		//Comparar duas strings diferenciando maiusculas e minusculas 		
		if(nome.equals(nome2)) {
			System.out.println("Nomes sao iguais");
		} else {
			System.out.println("Nomes sao diferentes");
		}
		
		//Comparar duas strings sem diferenciar maiusculas e minusculas		
		if(nome.equalsIgnoreCase(nome2)) {
			System.out.println("Nomes sao iguais");
		} else {
			System.out.println("Nomes sao diferentes");
		}
		
		
		
	}
	
	

}
