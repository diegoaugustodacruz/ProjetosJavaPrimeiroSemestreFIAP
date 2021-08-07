package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class ExemploIf {

	public static void main(String[] args) {
		
		//Ler a idade do usuario
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));

		//Verificar se é permitido beber
		
		if(idade>=18) {
			JOptionPane.showMessageDialog(null, "Pode chapa o Côco");		
			}
		
		else{
			JOptionPane.showMessageDialog(null, "Melhor beber leite");		
			}
		
		//Declarar uma variavel do tipo boolean		
		boolean ok = true;
		
		//Validar se a variavel é verdadeira	
		//O diferente no java é !=, =! é a negação + atribuição
		if(ok =! true) {
			System.out.println("1");
		}
		else {
			System.out.println("2");
		}
		
		
		
		
		
	}
	
	
	
}
