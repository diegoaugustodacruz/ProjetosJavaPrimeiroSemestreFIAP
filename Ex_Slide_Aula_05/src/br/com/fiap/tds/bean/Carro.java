package br.com.fiap.tds.bean;

public class Carro {
	
	private String modelo;
	private int quantidadeLugares;
	private double comprimento;
	private int quantidadePortas;
	private int anoFabrica��o;
	private Cor cor;
	private String placa;
	private float motor = 1;
	
	
	//M�todos Getters/Setters
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getQuantidadeLugares() {
		return quantidadeLugares;
	}
	public void setQuantidadeLugares(int quantidadeLugares) {
		this.quantidadeLugares = quantidadeLugares;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public int getQuantidadePortas() {
		return quantidadePortas;
	}
	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	public int getAnoFabrica��o() {
		return anoFabrica��o;
	}
	public void setAnoFabrica��o(int anoFabrica��o) {
		this.anoFabrica��o = anoFabrica��o;
	}
	public Cor getCor() {
		return cor;
	}
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public float getMotor() {
		return motor;
	}
	public void setMotor(float motor) {
		this.motor = motor;
	}
	
	
	
	
	

}
