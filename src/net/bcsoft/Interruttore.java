package net.bcsoft;

public class Interruttore {
	
private Lampadina lampadina;
	
	public Interruttore(Lampadina lampadina) {
		this.lampadina = lampadina;
		}
	
	public void accendiLampadina() {
		if(Lampadina.corrente == false) {
			System.out.println("Non c'è corrente");
			return;
		}
		if (lampadina.getStatoLampadina().equalsIgnoreCase("spenta")) {
			lampadina.click();
		} else {
			System.out.println("La lampadina è già accessa");
		}
	}
	
	public void spegniLampadina() {
		if(Lampadina.corrente == false) {
			System.out.println("Non c'è corrente");
			return;
		}
		if (lampadina.getStatoLampadina().equalsIgnoreCase("accesa")) {
			lampadina.click();
		} else {
			System.out.println("La lampadina è già spenta");
		}
	}



}
