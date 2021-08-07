package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class MetodosString {
	
	public static void main(String[] args) {
		
	
		//Ler um nome
		String nome = JOptionPane.showInputDialog("Digite um nome: ");
	
		//Exibir um nome
		System.out.println(nome);
		
		//Validar se o nome comeca com A		
		if(nome.startsWith("A")) {
			System.out.println("O nome comeca com \"A\"");
			
		}else {
			System.out.println("O nome nao comeca com \"A\"");
		}
		
		//Valida se o nome termina com "Santos"		
		if(nome.endsWith("Santos")) {
			System.out.println("O nome termina com \"Santos\"");
			
		}else {
			System.out.println("O nome nao termina com \"Santos\"");				
		}
		
		//Exibir a quantidade de caracteres do nome
		System.out.println("O nome " + nome + " possue " + nome.length() + " caracteres");
	
		//Obter uma letra de uma string dado uma posicao (comeca do 0)
		char letra = nome.charAt(0);
		System.out.println("A primeira letra do nome: " + letra);
		
		//Exibir o nome na vertical
		//FOR: Variavel de controle; condicao; passo
		for (int i = 0; i<nome.length(); i++) {
			System.out.println("["+i+"]" + nome.charAt(i));
		}
		
		//Exibir a primeira ocorrecia de um caracter na string
		//Quando a palavra/letra nao eh encontrada, o metodo retorna -1
		int posicao = nome.indexOf("a");
		System.out.println("A letra \"a\" aparece na posicao " + posicao);
		
		//Validar se o nome possui "Silva"
		if (nome.indexOf("Silva")>=0){
			System.out.println("O nome possui \"Silva\"");
		}else {
			System.out.println("O nome nao possui \"Silva\"");
		}
		
		//Validar se um valor esta na String
		
		//equals() -> valida se duas Strings sao iguais, considerando maiusculas e minusculas
		//"Anderson".equals("Anderson") -> true | "Anderson".equals("Anderson Silva") -> false
		
		//equalsIgnoreCase() -> valida se duas Strings sao iguais, nao diferenciando maiusculas e minusculas
		//"Anderson".equals("Anderson") -> true | "Anderson".equals("Anderson Silva") -> false

		//contains() -> Validar se uma String possui esta em outra String
		//"Anderson".contains("Anderson") -> true | "Anderson".equals("Anderson Silva") -> true

		if(nome.contains("Silva")) {
			System.out.println("O nome possui \"Silva\"");
		}else {
			System.out.println("O nome nao possui \"Silva\"");
		}
		
		//Operador ternario (condicao ? se verdadeiro : se falso)
		System.out.println(nome.contains("Silva") ? "O nome possui \"Silva\"" : "O nome nao possui \"Silva\"");
		
		//Exibir a ultima ocorrecia de um caracter na string
		//Quando a palavra/letra nao eh encontrada, o metodo retorna -1
		int posicao2 = nome.lastIndexOf("a");
		System.out.println("A ultima letra \"a\" aparece na posicao " + posicao2);
				
		//Exibir as 3 primeiras letras do nome
		//Criar uma nova string a partir de parte de outra string
		String parteNome = nome.substring(0,3);
		System.out.println("As 3 primeiras letras do nome: " + parteNome);
		
		//Exibir as 3 ultimas letras do nome
		System.out.println("As 3 ultimas letras do nome" + nome + " eh: " + nome.substring(nome.length()-3));
		
		//Exibir o primeiro nome da pessoa (substring da posicao 0 ateh a posicao do primeiro espaco)
		System.out.println("O primeiro nome eh: " + nome.substring(0, nome.indexOf(" ")) );
		
		//Exibir o ultimo nome da pessoa (substring da posicao do primeiro espaco ateh o final)
		System.out.println("O ultimo nome eh: " + nome.substring(nome.lastIndexOf(" ")+1));

		//Exibir o nome em maisculo
		System.out.println("O nome em letras maiusculas eh: " + nome.toUpperCase());
		
		//Exibir o nome em minusculo		
		System.out.println("O nome em letras minusculas eh: " + nome.toLowerCase());
		
		//Validar se o nome possui "silva" sem considerar maiusculas e minusculas diferentes
		if (nome.toUpperCase().contains("SILVA")) {
			System.out.println("O nome contem Silva");
			
		}else {
			System.out.println("O nome nao contem Silva");
		}
		
		System.out.println(nome.toLowerCase().contains("silva")? "Possui Silva" : "Nao possui Silva");
		
		//replace -> Substituir um caracter/texto por outro
		//Substituir a letra "a" por "u" e exibir o resultado
		System.out.println("Mudando a letra \"a\" pela letra \"u\": " + nome.replace("a", "u"));
		
		//Exibir a quantidade de caracteres do nome sem contar os espacos
		//Tira os espacos em branco do nome
		String nomeSemEspaco = nome.replace(" ", "");
		System.out.println("Quantidade de caracteres eh: " + nomeSemEspaco.length());
		System.out.println(nomeSemEspaco);
		
		
		
		
	}//main
	
	

}//classe
