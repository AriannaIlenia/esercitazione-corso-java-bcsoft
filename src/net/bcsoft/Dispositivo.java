package net.bcsoft;

public class Dispositivo {

	private SistemaOperativo so;

	public SistemaOperativo getSo() {
		return so;
	}

	public void setSo(SistemaOperativo so) {
		this.so = so;
	}
	
	public Dispositivo(){
		
	}
	
	public Dispositivo(SistemaOperativo so) {
		this.so = so;
	}
	
	
}
