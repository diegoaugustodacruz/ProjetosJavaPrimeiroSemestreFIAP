package br.com.fiap.tds.bean;

public class ProdutoPerecivel extends Produto {
	
	private String dataValidade;
	
	
	//Sobrescrita (override) de metodo
	//Criar o mesmo método do pai na classe filha
	
	//Calcula o valor com desconto de acordo com a quantidade em estoque
	//Desconto de 20% se tiver mais de 100 produtos ou 10% caso contrario
	@Override //Anotação -> adiciona mais informações no elemento da classe
	public double calcularDesconto() {
	/*	if(quantidade>100) {
			return valor*0.8;
			
		}
		else {
			return valor*0.9;
		}		
	*/
		//Ternário (condicao ? se verdadeiro : se falso)
		return quantidade > 100 ? valor*0.8 : valor*0.9;		

		}
	
	//Sobrescrever o método calcular desconto do cupom
	//Adicionar o cupom LEVA40 -> dá 40% de desconto, além do cupom do FIAPXX
	@Override
	public double calcularDesconto(String cupom) {
		/*
		 * if(cupom.equals("LEVA40")) { return valor*0.6;
		 * 
		 * } else { return super.calcularDesconto(cupom); }
		 */
				
		return cupom.equals("LEVA40") ? valor*0.6 : super.calcularDesconto(cupom);
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	
	public ProdutoPerecivel() {
		
	}
	
	public ProdutoPerecivel(double valor, int quantidade, String nome, String dataValidade) {
		super(valor, quantidade, nome);
		this.dataValidade = dataValidade;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nValidade: " + dataValidade;
	}
	
	
	
	
	
}