package net.bcsoft;

public class Smartphone extends Dispositivo {
	
	public Smartphone() {
		
	}
	
	public Smartphone(SistemaOperativo so) {
		super(so);
	}
	
	public void mandaMessaggio() {
		System.out.println("Messaggio inviato");
		}
	
}
