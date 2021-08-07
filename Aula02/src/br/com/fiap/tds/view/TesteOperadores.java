package br.com.fiap.tds.view;

import java.util.Scanner;

public class TesteOperadores {
	
	public static void main(String[] args) {
		
		//Declarar uma variável para armazear o objeto que le o teclado
		//new -> instancia uma classe -> para obter o objeto
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um numero:");
		//ler um numero
		int x = leitor.nextInt();
		
		//Ler outro número inteiro
		
		System.out.print("Digite outro numero:");
		int y = leitor.nextInt();
		
		//Exibir a subtração dos dois números
		
		System.out.println("O primeiro menos o segundo eh: " + (x-y));
		
		x/=10;
		
		System.out.println("A divisao é: " + x);
		
		x *=10;
		System.out.println("A multiplicação é " + x);
		
		x %=10;
		System.out.println("O resto da divisao é: " + x);
		
		//fechar o leitor
		leitor.close();
	}

}
