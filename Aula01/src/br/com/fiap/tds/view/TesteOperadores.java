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
		
		//Realizar a subtra��o
		int sub = x - y;
		
		//Exibir o resultado da subtra��o
		System.out.println("Subtra��o: " + sub);
		
		//Realizar a mutiplica��o
		
		int mult = x*y;
		
		//Exibir o resultado da multiplica��o
		System.out.println("Multiplica��o: " + mult);
		
		//Realizar a divis�o
		int div = x/y;
		
		//Exibir o resultado da divis�o
		System.out.println("Divis�o: " + div);
		
		//Obter o resto da divis�o
		int resto = x % y;
		System.out.println("Resto da divis�o: " + resto);
		
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
		
		//Atribui��o multiplicativa -> x = x*2
		x*=2;
		System.out.println("x * 2 = " + x);
		
		//x = x / 2
		x/=2;
		System.out.println("x/2 = " + x);
		
		//Atribui��o de m�dulo
		x %= 2;
		System.out.println("M�dulo: " + x);
		System.out.println("FIM!!");
		
		
		
		
	}
	
	
	
	
	
	

}
