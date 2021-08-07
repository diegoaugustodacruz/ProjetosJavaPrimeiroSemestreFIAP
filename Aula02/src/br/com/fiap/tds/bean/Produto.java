package br.com.fiap.tds.bean;

public class Produto {
	
	//Atributos
	public String nome;
	
	public double preco;
	
	public boolean disponivel;
	
	public char corredor;
	
	public int quantidade;
	
	//Métodos
	// retorno nome(parametros){}
	public double calcularDesconto(double valorDesconto) {
		//calcular o valor final com desconto em %
		double valor = preco - preco*valorDesconto/100;
		//retorna o valor calculado
		return valor;
	}
	
	//método que recebe os valores para atribuir nos atributos
	public void configurarProduto(String nome, double valor, boolean dis, char corredor, int qtd) {
		
		this.nome = nome; //this -> aponta para classe
		preco = valor;
		disponivel = dis;
		this.corredor = corredor;
		quantidade = qtd;
		
	}
	
	//metodo que retorna os valores dos atributos
	public String retornarDadosProduto() {
		String dados = nome + " Preço: " + preco + "Disponível: " + disponivel + " Corredor: " + corredor + " Quantidade: " + quantidade;
		return dados;		
	}

}
