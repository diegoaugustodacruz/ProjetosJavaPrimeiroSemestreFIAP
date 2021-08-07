package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bean.Produto;
import br.com.fiap.tds.bean.ProdutoPerecivel;

public class Terminal {
	
	public static void main(String[] args) {
		
		
				
		String nome = JOptionPane.showInputDialog("Digite o nome do produto: ");
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto"));
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));

		//Validar se o produto é perecível
		
		int perecivel = JOptionPane.showConfirmDialog(null, "Digite se o produto é perecível: ");
		
		
		Produto produto;

		
		if (perecivel == JOptionPane.YES_OPTION) {
			String validade = JOptionPane.showInputDialog("Digite data de valodade ");
			produto = new ProdutoPerecivel(valor, quantidade, nome, validade);
				
						
		}else {
			produto = new Produto(valor, quantidade, nome);				
			
			}
		
		
		JOptionPane.showMessageDialog(null, produto);
		
		int op = Integer.parseInt(JOptionPane.showInputDialog("Digite "
				+ "\n0 - desconto Padrão, "
				+ "\n1 - Valor ou "
				+ "\n2- Cupom"));
		
		switch(op) {
			case 0:{
				JOptionPane.showMessageDialog(null, "Valor com desconto: R$" + produto.calcularDesconto());
				break;
			}
			
			case 1:{
				float desconto = Integer.parseInt(JOptionPane.showInputDialog("Digite a porcentagem de desconto: "));
				JOptionPane.showMessageDialog(null, "Desconto de " + desconto + 
						"\nValor com desconto: R$" + produto.calcularDesconto(desconto));
				break;				
			}
			
			case 2:{
				String cupom = JOptionPane.showInputDialog("Digite o cupom: ");
				JOptionPane.showMessageDialog(null, "Valor com desconto: R$" + produto.calcularDesconto(cupom));				
				break;
			}
			
			default: 
				JOptionPane.showMessageDialog(null, "Desconto errado, valor é R$" + produto.getValor());				

		}
		
		
		

				
		
	}

}
