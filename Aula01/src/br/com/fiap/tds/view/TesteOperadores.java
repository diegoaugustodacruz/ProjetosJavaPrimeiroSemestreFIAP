package br.com.fiap.tds.view;

public class TesteOperadores {
	
	public static void main(String[] args) {
		//declarar duas variaveis do tipo int
		int x = 10;
		int y = 3;
		
		//realizar a soma de x e y
		int soma = x + y;
		//exibir o resultado da soma
		System.out.println("Soma: " + soma);
		
		//Realizar a subtração
		int sub = x - y;
		
		//Exibir o resultado da subtração
		System.out.println("Subtração: " + sub);
		
		//Realizar a mutiplicação
		
		int mult = x*y;
		
		//Exibir o resultado da multiplicação
		System.out.println("Multiplicação: " + mult);
		
		//Realizar a divisão
		int div = x/y;
		
		//Exibir o resultado da divisão
		System.out.println("Divisão: " + div);
		
		//Obter o resto da divisão
		int resto = x % y;
		System.out.println("Resto da divisão: " + resto);
		
		//Incremento -> incrementar em uma unidade
		x++;
		System.out.println("x = " + x);
		
		//Decremento - Decrementa em uma unidade
		x--;
		System.out.println("X = " + x);
		
		// x = x +2
		x += 2;
		System.out.println("x + 2 = " + x);
		
		// x = x -2
		x-=2;
		System.out.println("x - 2 = " + x);
		
		//Atribuição multiplicativa -> x = x*2
		x*=2;
		System.out.println("x * 2 = " + x);
		
		//x = x / 2
		x/=2;
		System.out.println("x/2 = " + x);
		
		//Atribuição de módulo
		x %= 2;
		System.out.println("Módulo: " + x);
		System.out.println("FIM!!");
		
		
		
		
	}
	
	
	
	
	
	

}
