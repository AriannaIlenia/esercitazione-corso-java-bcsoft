package net.bcsoft;

public class Giocatore {

	private String nome;
	private String cognome;
	private double costo;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public double getCosto() {
		return costo;
	}
	
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	public Giocatore() {
		
	}
	
	public Giocatore(String nome, String cognome, double costo) {
		this.nome = nome;
		this.cognome = cognome;
		this.costo = costo;
	}
	
	public String toString() {
		return String.format("Nome: %s %nCognome: %s %nCosto: %f%n", nome, cognome, costo);
	}
}
