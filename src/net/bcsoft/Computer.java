package net.bcsoft;

public class Computer extends Dispositivo {

	
	public Computer() {
		
	}
	
	public Computer(SistemaOperativo so) {
		super(so);
	}
	
	public void inserisciPeriferica() {
		System.out.println("Inserita periferica");
	}
}
