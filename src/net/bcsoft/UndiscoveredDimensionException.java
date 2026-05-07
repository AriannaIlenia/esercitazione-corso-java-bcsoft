package net.bcsoft;

public class UndiscoveredDimensionException extends Exception {
	
	private String message;

	public UndiscoveredDimensionException() {
		message = "ERRORE: il numero è minore di 0";
	}
		
	public String getMessage(){
		return message;
	}

}
