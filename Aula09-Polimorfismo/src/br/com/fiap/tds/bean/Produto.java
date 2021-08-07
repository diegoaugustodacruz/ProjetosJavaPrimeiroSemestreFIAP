package br.com.fiap.tds.bean;

public class Produto {

	//Atributos
	
	protected double valor;
	
	protected int quantidade;
	
	protected String nome;
	
	
	
	//Métodoscom sobrecarga (overload) -> metodos com mesmo nome e parâmetros diferentes
	
	//Calcula o valor com desconto padrão
	public double calcularDesconto() {
		return valor*(0.95);
		
	}
	
	//Calcula o valor com desconto de acordo com a % passada
	public double calcularDesconto(float porcentagem) {
		return valor*(1-(porcentagem)/100);
	}
		
	//Calcula o valor com o cupons de desconto: FIAPXX -> XX%
	public double calcularDesconto(String cupom) {
		if(cupom.startsWith("FIAP")&&cupom.length()==6) {
			int desconto = Integer.parseInt(cupom.substring(4));
			return valor - valor*desconto/100;
		}
		return valor;
				
		
	}

	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public Produto() {
		
	}

	public Produto(double valor, int quantidade, String nome) {
		this.valor = valor;
		this.quantidade = quantidade;
		this.nome = nome;
	}
	
	//sobrescrever o método toString() para determinar o que será exibido no print do objeto
	@Override
	public String toString() {
		return "Produto: " + nome + 
				"\nQuantidade: " + quantidade +
				"\nValor: R$" + valor;
	}
	
	
	
	
	
}
