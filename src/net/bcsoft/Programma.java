package net.bcsoft;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Programma {
	
	public static void main(String[] args) {
		
		//Esercizio 1 ed esercizio 2
		Scanner scanner = new Scanner(System.in);
		List<Integer> numeri = new ArrayList<>();
				
		System.out.println("Inserisci un numero (inserisci un numero negativo quando non  vuoi più inserire numeri): ");
		int numero = scanner.nextInt();
		int somma = 0;
		
		while (numero > 0) {
			numeri.add(numero);
			somma += numero;
			numero = scanner.nextInt();
		}
			
		int numeroMax = 0;
		for (int i = 1; i < numeri.size(); i++) {
			if (numeri.get(i) > numeroMax) {
				numeroMax = numeri.get(i);
			}
		}
		
		double media = somma / numeri.size();		
		
		System.out.println(numeri);
		System.out.println("Il numero massimo è: " + numeroMax);
		System.out.println("La media dei numeri è: " + media );
		
		System.out.println("----------");
		
		List<Integer> senzamultipli = new ArrayList<>();
		List<Integer> multipli = new ArrayList<>();
		
		System.out.println("Scegli un numero della lista:");
		int n = scanner.nextInt();
		for (int x : numeri) {
			if (x % n == 0) {
				multipli.add(x);
			} else {
				senzamultipli.add(x);
			}
		}
		
		System.out.println(senzamultipli);
		System.out.println(multipli);
		
		System.out.println("----------");
		
		//Esercizio 3
		Squadra squadra = new Squadra("AS Roma", 10000000);
		List<Giocatore> ASRoma = new ArrayList<>();
		Giocatore g1 = new Giocatore("Francesco", "Totti", 3684000);
		Giocatore g2 = new Giocatore("Gianluca", "Mancini", 2200000);
		Giocatore g3 = new Giocatore("Mile", "Svilar", 12500);
		ASRoma.add(g1);
		ASRoma.add(g2);
		ASRoma.add(g3);
		System.out.println("La squadra iniziale è composta da:");
		ASRoma.forEach(i -> System.out.println(i));
		List<Giocatore> giocatoriDaComprare = new ArrayList<>();		
		Giocatore g4 = new Giocatore("Manuel", "Locatelli", 210000);
		Giocatore g5 = new Giocatore("Mattia", "Perin", 17100);
		Giocatore g6 = new Giocatore("Lautaro", "Martínez", 2100000);		
		giocatoriDaComprare.add(g4);
		giocatoriDaComprare.add(g5);
		giocatoriDaComprare.add(g6);
		giocatoriDaComprare.forEach(i -> System.out.println(i));		
		System.out.println("Scegli un giocatore che vuoi acquistare: (inserisci solo il nome)");
		scanner.nextLine();
		String scelta1 = scanner.nextLine();
		Giocatore giocatoreAcquistato = null;
		
			for (Giocatore g : giocatoriDaComprare) {
				if (g.getNome().equalsIgnoreCase(scelta1)) {
					giocatoreAcquistato = g;
					break;
				}
			}
			
		System.out.println("Hai scelto il giocatore " + giocatoreAcquistato);
		System.out.println("Il capitale sociale ora è: " + squadra.sommaCapitaleSociale(giocatoreAcquistato));
		ASRoma.add(giocatoreAcquistato);		
		System.out.println("Scegli un giocatore che vuoi vendere: (inserisci solo il nome)");
		String scelta2 = scanner.nextLine();
		Giocatore giocatoreVenduto = null;
		
			for (Giocatore g : ASRoma) {
				if (g.getNome().equalsIgnoreCase(scelta2)) {
					giocatoreVenduto = g;
					break;
				}
			}
			
		System.out.println("Hai scelto il giocatore " + giocatoreVenduto);
		System.out.println("Il capitale sociale ora è: " + squadra.sottrazioneCapitaleSociale(giocatoreVenduto));
		ASRoma.remove(giocatoreVenduto);
		System.out.println("La squadra ora è composta da:");
		ASRoma.forEach(i -> System.out.println(i));		
		
		scanner.close();
		
		System.out.println("----------");
		
		//Esercizi 4,5,6
		
		Lampadina lampadina = new Lampadina(5, true);
		
		Interruttore interruttore1 = new Interruttore(lampadina);
		Interruttore interruttore2 = new Interruttore(lampadina);
		
		interruttore1.accendiLampadina();
		interruttore1.spegniLampadina();
		
		interruttore2.accendiLampadina();
		interruttore2.spegniLampadina();
		
		interruttore1.accendiLampadina();
		
		System.out.println(lampadina.getStatoLampadina());
		
		System.out.println("---------");
		
		//Esercizio 7
		
		try {
			
			Box scatola1 = new Box(10, 20, 30);
			Box scatola2 = new Box(8, 15, 25);
			System.out.println("Le due scatole sono uguali?");
			System.out.println(scatola1.isContenuto(scatola2));
			System.out.println("La scatola2 può essere contenuta all'interno della scatola1?");
			System.out.println(scatola1.puòContenere(scatola2));
			
		} catch (UndiscoveredDimensionException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("----------");
		
		//Esercizio 8
		
		List<Dispositivo> gestioneInventario = new ArrayList<>();
		Dispositivo c1 = new Computer(SistemaOperativo.ANDROID);
		Dispositivo s1 = new Smartphone(SistemaOperativo.IOS);
		Dispositivo c2 = new Computer(SistemaOperativo.LINUX);
		Dispositivo s2 = new Smartphone(SistemaOperativo.MACOS);
		gestioneInventario.add(c1);
		gestioneInventario.add(s1);
		gestioneInventario.add(c2);
		gestioneInventario.add(s2);
		System.out.println("Inventario:");
		gestioneInventario.forEach(i -> System.out.println(i));
	}

}
