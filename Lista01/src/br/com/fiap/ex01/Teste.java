package br.com.fiap.ex01;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Calculadora dados  = new Calculadora();
		
		System.out.print("Digite um n�mero: ");
		double xe = leitor.nextDouble();
		dados.x = xe;
		
		
		System.out.print("Digite outro n�mero: ");
		double ye = leitor.nextDouble();
		dados.y = ye;

		double soma = dados.somar();
		
		System.out.println("A soma de " + xe + " com " + ye + " � igual � " + soma);
		
		double sub = dados.subtrair();
		
		System.out.println("A subtra��o de " + xe + " com " + ye + " � igual � " + sub);
		
	}

}
