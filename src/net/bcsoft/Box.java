package net.bcsoft;

public class Box {
	
	private int altezza;
	private int lunghezza;
	private int profondita;
	
	public int getAltezza() {
		return altezza;
	}
	
	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
	
	public int getLunghezza() {
		return lunghezza;
	}
	
	public void setLunghezza(int lunghezza) {
		this.lunghezza = lunghezza;
	}
	
	public int getProfondita() {
		return profondita;
	}
	
	public void setProfondita(int profondita) {
		this.profondita = profondita;
	}
	
	public Box() {
		
	}
	
	public Box(int altezza, int lunghezza, int profondita) throws UndiscoveredDimensionException {
		
		if (altezza < 0) {
			throw new UndiscoveredDimensionException();
		}
		this.altezza = altezza;
		
		if (lunghezza < 0) {
			throw new UndiscoveredDimensionException();
		}
		this.lunghezza = lunghezza;
		
		if (profondita < 0) {
			throw new UndiscoveredDimensionException();
		}
		this.profondita = profondita;
		
	}
	
	public boolean isContenuto(Box box) {
		if(this.altezza == box.altezza && this.lunghezza == box.lunghezza && this.profondita == box.profondita) {
			return true;
		} return false;
	}
	
	public boolean puòContenere(Box box) {
		if(this.altezza > box.altezza && this.lunghezza > box.lunghezza && this.profondita > box.profondita) {
			return true;
		} return false;
	}

}
