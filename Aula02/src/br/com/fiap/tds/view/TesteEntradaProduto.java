package br.com.fiap.tds.view;
import java.util.Scanner;

import br.com.fiap.tds.bean.Produto;

public class TesteEntradaProduto {
	
	public static void main(String[] args) {
		
		//instanciar um Produto
		Produto livro = new Produto();
		
		//instanciar um Scanner
		Scanner leitor = new Scanner(System.in);
		
		//ler os dados para atribuir no produto
		System.out.print("Digite o produto: ");
		String name = leitor.next() + leitor.nextLine();
		
		System.out.print("Digite o preço: ");
		double price = leitor.nextDouble();
		
		System.out.print("Digite se esta disponivel: ");
		boolean avai = leitor.nextBoolean();
		
		System.out.print("Digite em que corredor esta: ");
		char corr = leitor.next().charAt(0);
		
		System.out.print("Digite a quantidade: ");
		int qtd = leitor.nextInt();
				
		//atribuir os dados para o produto
		livro.configurarProduto(name, price, avai, corr, qtd);
		
		//exibir os dados do produto
		String dados = livro.retornarDadosProduto();
		System.out.println(dados);
		
		//pedir a % desconto
		
		double d = livro.calcularDesconto(20);
		System.out.print("O valor com desconto eh: " + d);
		
		leitor.close();
		
		
		
		

				
		
		
		
	}
}
