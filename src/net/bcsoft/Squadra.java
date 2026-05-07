package net.bcsoft;

public class Squadra {
	
	private String nome;
	private double capitaleSociale;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCapitaleSociale() {
		return capitaleSociale;
	}
	
	public void setCapitaleSociale(double capitaleSociale) {
		this.capitaleSociale = capitaleSociale;
	}
	
	public Squadra() {
		
	}
	
	public Squadra(String nome, double capitaleSociale) {
		this.nome = nome;
		this.capitaleSociale = capitaleSociale;
	}
	
	public String toString() {
		return String.format("Nome della squadra: %s %nCapitale sociale: %f", nome, capitaleSociale);
	}
	
	public double sommaCapitaleSociale(Giocatore giocatore) {
		return capitaleSociale + giocatore.getCosto();
	}
	
	public double sottrazioneCapitaleSociale(Giocatore giocatore) {
		return capitaleSociale - giocatore.getCosto();
	}
}
