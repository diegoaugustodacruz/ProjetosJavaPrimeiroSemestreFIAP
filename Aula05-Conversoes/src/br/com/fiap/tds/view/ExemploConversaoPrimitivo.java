package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class ExemploConversaoPrimitivo {

	//Converter uma string para um tipo primitivo
	
	public static void main(String[] args) {
		
		//Abrir uma janela com a mensagem e um campo para o usuario digitar
		String numero = JOptionPane.showInputDialog("Digite um numero: ");
		
		//Converter a String para os tipos primitivos
		//byte, short, int, long - float, double
		
		
		byte valorByte = Byte.parseByte(numero);
		
		short valorShort = Short.parseShort(numero);
		
		int valorInt = Integer.parseInt(numero);
		
		long valorLong = Long.parseLong(numero);
		
		float valorFloat = Long.parseLong(numero);
		
		double valorDouble = Double.parseDouble(numero);
		
		//Exibir a soma de tudo
		
		double total = valorByte + valorShort + valorInt + valorLong + valorFloat + valorDouble;
		
		JOptionPane.showMessageDialog(null, "Total é: " + total);
		
		//Transformar uma string em um boolean
		
		String verdadeiro = "true";
		
		boolean valorBoolean = Boolean.parseBoolean(numero);
		
		JOptionPane.showMessageDialog(null, valorBoolean);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
