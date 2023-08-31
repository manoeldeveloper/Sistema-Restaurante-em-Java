package com.java.restaurante;

public class Comanda implements Comparable<Comanda> {
	
	private int numero;
	private int mesa;
	private String nome;	
	private double valor;
	@Override
	public String toString() {
		return "Número da Comanda: " + getNumero() + ", Mesa: " + getMesa() + ", Cliente: " + getCliente() + ", Quanto cobrar: " + getValor();
	}
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected double getValor() {
		return valor;
	}
	protected void setValor(double valor) {
		this.valor = valor;
	}
	protected Comanda(int numero, int mesa, String nome, double valor) {
		this.numero = numero;
		this.mesa = mesa;
		this.nome = nome;
		this.valor = valor;
	}
	protected int getNumero() {
		return numero;
	}
	protected void setNumero(int numero) {
		this.numero = numero;
	}
	protected int getMesa() {
		return mesa;
	}
	protected void setMesa(int mesa) {
		this.mesa = mesa;
	}
	protected String getCliente() {
		return nome;
	}
	protected void setCliente(String nome) {
		this.nome = nome;
	}
	
	public int compareTo(Comanda comanda) {
		return Integer.compare(this.numero, comanda.numero);
	}
	
	

}
