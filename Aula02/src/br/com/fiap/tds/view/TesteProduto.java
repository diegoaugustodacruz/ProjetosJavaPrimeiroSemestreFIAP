package br.com.fiap.tds.view;
import br.com.fiap.tds.bean.Produto;

public class TesteProduto {
	
	public static void main(String[] args) {
		
		//instanciar um produto -> criar o objeto
		
		Produto livro = new Produto();
		
		//Atribuindo valores nos atributos
		livro.nome = "java como programar";
		livro.preco = 200;
		livro.disponivel = true;
		livro.corredor = 'A';
		livro.quantidade = 10;
		
		//acionando método
		double x = livro.calcularDesconto(20);
		System.out.println("O valor com desconto do livro é " + x);
		
		//instanciar outro produto
		Produto tv = new Produto();
		
		//chamar o metodo para atribuir valors nos atributos
		tv.configurarProduto("Tv Lg", 1200, true, 'C', 32);
		
		//calcular o desconto para a tv
		double y = tv.calcularDesconto(30);
		System.out.println("O valor da tv com desconto: " + y);
		
		//Alterando o nome do produto
		tv.nome = "TV Samsung";
		
		//exibir o nome e o preço da TV
		System.out.println(tv.nome + " " + tv.preco);
		
		//chamar o metodo que retorna os dados do produto e exibi-lo
		String dadosTv = tv.retornarDadosProduto();
		System.out.println(dadosTv);
		
		String dadosLivro = livro.retornarDadosProduto();
		System.out.println(dadosLivro);
		
	}
	
	

}
