package br.com.fiap.tds.view;

import java.util.Scanner;

public class TesteOperadores {
	
	public static void main(String[] args) {
		
		//Declarar uma vari�vel para armazear o objeto que le o teclado
		//new -> instancia uma classe -> para obter o objeto
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um numero:");
		//ler um numero
		int x = leitor.nextInt();
		
		//Ler outro n�mero inteiro
		
		System.out.print("Digite outro numero:");
		int y = leitor.nextInt();
		
		//Exibir a subtra��o dos dois n�meros
		
		System.out.println("O primeiro menos o segundo eh: " + (x-y));
		
		x/=10;
		
		System.out.println("A divisao �: " + x);
		
		x *=10;
		System.out.println("A multiplica��o � " + x);
		
		x %=10;
		System.out.println("O resto da divisao �: " + x);
		
		//fechar o leitor
		leitor.close();
	}

}
