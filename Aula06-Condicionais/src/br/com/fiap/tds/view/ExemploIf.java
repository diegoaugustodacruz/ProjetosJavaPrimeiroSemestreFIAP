package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class ExemploIf {

	public static void main(String[] args) {
		
		//Ler a idade do usuario
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));

		//Verificar se � permitido beber
		
		if(idade>=18) {
			JOptionPane.showMessageDialog(null, "Pode chapa o C�co");		
			}
		
		else{
			JOptionPane.showMessageDialog(null, "Melhor beber leite");		
			}
		
		//Declarar uma variavel do tipo boolean		
		boolean ok = true;
		
		//Validar se a variavel � verdadeira	
		//O diferente no java � !=, =! � a nega��o + atribui��o
		if(ok =! true) {
			System.out.println("1");
		}
		else {
			System.out.println("2");
		}
		
		
		
		
		
	}
	
	
	
}
