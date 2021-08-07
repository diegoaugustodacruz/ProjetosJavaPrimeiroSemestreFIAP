package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class ExemploConversaoString {

	
	//transformar um primitivo em uma string
	public static void main(String[] args) {
		
		//ler uma idade (int)
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		
		//ler uma altura (float)
		
		float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura"));

		//Exibir a soma
		
		JOptionPane.showMessageDialog(null, idade + altura);
		
		//Transformar os numeros em String
		
		String idadeString = String.valueOf(idade);
		
		String alturaString = String.valueOf(altura);
		
		JOptionPane.showMessageDialog(null, "A idade é " + idadeString + ", Altura é " + alturaString);
		
		//Concatenar String -> concatena um numero com uma string: resultado é string
		String teste = idade + "";
		
		
	}
}
