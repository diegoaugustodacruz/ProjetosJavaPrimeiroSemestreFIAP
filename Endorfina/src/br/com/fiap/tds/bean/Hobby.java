package br.com.fiap.tds.bean;

public class Hobby {

	private int codigoHobby;

	private String nomeHobby;

	public Hobby() {
	}

	public Hobby(int codigoHobby, String nomeHobby) {
		this.codigoHobby = codigoHobby;
		this.nomeHobby = nomeHobby;

	}

	public Hobby(String nomeHobby) {
		this.nomeHobby = nomeHobby;

	}

	public String exibirDadosHobby() {
		return "C�digo do Hobby: " + codigoHobby + ", Nome do Hobby: " + nomeHobby;
	}

	public String exibirDadosHobbySimples() {
		return "Seu hobby � " + nomeHobby;
	}

	public int getCodigoHobby() {
		return codigoHobby;
	}

	public void setCodigoHobby(int codigoHobby) {
		this.codigoHobby = codigoHobby;
	}

	public String getNomeHobby() {
		return nomeHobby;
	}

	public void setNomeHobby(String nomeHobby) {
		this.nomeHobby = nomeHobby;
	}

}
