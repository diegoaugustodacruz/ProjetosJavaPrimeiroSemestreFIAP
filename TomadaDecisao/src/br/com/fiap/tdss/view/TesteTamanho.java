package br.com.fiap.tdss.view;

import javax.swing.JOptionPane;

public class TesteTamanho {
	public static void main(String[] args) {
		
		
		String nome1 = JOptionPane.showInputDialog("Digite o nome da 1� pessoa");
		float altura1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura da 1� pessoa"));
		float peso1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso da 1� pessoa"));
		
		String nome2 = JOptionPane.showInputDialog("Digite o nome da 2� pessoa");
		float altura2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura da 2� pessoa"));
		float peso2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso da 2� pessoa"));
		
		
		if(peso1>peso2) {
			JOptionPane.showMessageDialog(null, "O nome da mais pesada � " + nome1);
			
		}
		else if (peso2>peso1){
			JOptionPane.showMessageDialog(null, "O nome da mais pesada � " + nome2);

		}
		else {
			JOptionPane.showMessageDialog(null, "Possuem o mesmo peso");

		}
		
		if(altura1>altura2) {
			JOptionPane.showMessageDialog(null, "O nome da mais alta � " + nome1);
			
		}
		else if (altura2>altura1) {
			JOptionPane.showMessageDialog(null, "O nome da mais alta � " + nome2);

		}
		else {
			JOptionPane.showMessageDialog(null, "Possuem a mesma altura");

		}
		
	}
	
	
	

}
