package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class ExemploSwitch {

	public static void main(String[] args) {
		
		//Ler a sigla de um estado
		
		String sigla = JOptionPane.showInputDialog("Digite a sigla de um estado");
		
		switch(sigla) {
			case "SP": {
				JOptionPane.showMessageDialog(null, "Estado � S�O PAULO");
				break;
		}
			case "RJ": {
				JOptionPane.showMessageDialog(null, "Estado � RIO DE JANEIRO");
				break;
			}
			
			case "MG": {
				JOptionPane.showMessageDialog(null, "Estado � MINAS GERAIS");
				break;
			}
			
			default: {
				JOptionPane.showMessageDialog(null, "� outro estado");
			}
			
		}
		
		
	}
}
