package br.com.fiap.tds.view;

public class ExemploConversaoTipos {
	
	//Converter um tipo primitivo para outros tipos
	public static void main(String[] args) {
		
		//Conversao implicita
		//byte -> short -> int -> long -> float -> double
		
		byte valorByte = 20;
		short valorShort = valorByte;
		int valorInt = valorShort;
		long valorLong = valorInt;
		float valorFloat = valorLong;
		double valorDouble = valorFloat;
		
		valorFloat = valorShort;
		valorInt = valorByte;
		
		//Conversao explicita (cast -> forçar um tipo maior ser de outro tipo menor
		valorFloat = (float) valorDouble;//somente um exemplo de cast, nao faz sentido nesse codigo
		
		valorFloat = 10.45f; //f no final define que o valor é um float
		
		valorInt = (int) valorFloat;
		
		System.out.println("Int: " + valorInt);
		
		
		
		
		
		
	}

}
