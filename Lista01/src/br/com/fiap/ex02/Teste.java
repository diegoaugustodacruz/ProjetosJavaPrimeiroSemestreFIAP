package br.com.fiap.ex02;

public class Teste {

	public static void main(String[] args) {
		
		Salario valores = new Salario();
		
		valores.atribuirValorBruto(5);
		
		double x = valores.calcularINSS();
		double y = valores.obterValorLiquido();
		
		
		
		System.out.println("Sal�rio Bruto �: " + valores.valorBruto);
		
		System.out.println("O desconto do INSS �: " + x);
		
		System.out.println("O sal�rio l�quido �: " + y);
		
		
		
		
		
	}
	
}
