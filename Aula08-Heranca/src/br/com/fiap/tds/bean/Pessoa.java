package br.com.fiap.tds.bean;

public class Pessoa {
	
	//Atributos
	
	protected String nome;
	private String cpf;
	
	//Construtores
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	//M?todos
	public String formatarCpf() {
		return cpf.replace(".", "").replace("-", "");
	}
	
	
	//Getters/Seters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
	

}
