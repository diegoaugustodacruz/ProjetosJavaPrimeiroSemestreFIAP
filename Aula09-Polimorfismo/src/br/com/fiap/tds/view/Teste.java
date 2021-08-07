package br.com.fiap.tds.view;

import br.com.fiap.tds.bean.Produto;
import br.com.fiap.tds.bean.ProdutoPerecivel;

public class Teste {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto(100, 100, "Peru");
		
		ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel(100, 100, "Arroz", "10/10/2022");
		
		System.out.println("Produto: ");
		System.out.println(produto.calcularDesconto());
		System.out.println(produto.calcularDesconto(20));
		System.out.println(produto.calcularDesconto("FIAP10"));
		
		System.out.println("Produto perecível: ");
		System.out.println(produtoPerecivel.calcularDesconto());
		System.out.println(produtoPerecivel.calcularDesconto(20));
		System.out.println(produtoPerecivel.calcularDesconto("LEVA40"));
		
		//O produto perecivel é um produto (herda)
		//objeto produto2 é um objeto do ProdutoPerecivel, mas do tipo Produto
		Produto produto2  = new ProdutoPerecivel(100, 100, "Macarrao", "11/11/2021");
		
		System.out.println("PRODUTO PERECIVEL É UMA VARIAVEL DO TIPO PRODUTO");
		System.out.println(produto2.calcularDesconto());// pega da classe ProdutoPerecivel
		System.out.println(produto2.calcularDesconto("LEVA40"));// pega da classe ProdutoPerecivel
		
		
		//Validar se a variável produto2 possui uma instancia de ProdutoPerecivel		
		if(produto2 instanceof ProdutoPerecivel) {
			//Cast -> força um objeto a ser de um tipo especifico
			ProdutoPerecivel produtoPerecivel2 = (ProdutoPerecivel) produto2;
			System.out.println(produtoPerecivel2.getDataValidade());
			
			
		}else {
			System.out.println("produto2 não é o tipo produto perecível");
		}
		
		
		
		
		
		
		
		
		
	}

}
