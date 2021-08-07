package br.com.fiap.tds.bean;


/*Modificadores de acesso:
 * private -> Tem acesso somente a própria classe
 * protected -> Tem acesso todos no mesmo pacote e as classes filhas
 * public -> Tem acesso todas as classes de todos os projetos
 * defaut/package -> Quando nao escreve nada na frente. Tem acesso todos no mesmo pacote
 */

public class Usuario {

	//Atributos
	private String nome;
	
	private int idade;
	
	private boolean ativo;
	
	
	//Métodos
	public void logar() {
			
	}
	
	
	//Gets/Sets
	
	public boolean isAtivo() {
		return ativo;
	}
	
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade=idade;
	}
	
	
	
	
	
}
