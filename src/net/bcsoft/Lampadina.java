package net.bcsoft;

import static net.bcsoft.StatoLampadina.*;

public class Lampadina {

		private final int NUMERO_CLICK_MAX;
		public static boolean corrente;
		
		private StatoLampadina statoLampadina;

		private int numeroClick;
		
		public Lampadina(int numeroClickMax, boolean corrente) {
			this.NUMERO_CLICK_MAX = numeroClickMax;
			statoLampadina = SPENTA;
			Lampadina.corrente = corrente;
		}
		
		
		public void click() {
			numeroClick++;
			statoLampadina = (statoLampadina == SPENTA && statoLampadina != ROTTA) ? ACCESA : SPENTA;				
			if (numeroClick == NUMERO_CLICK_MAX) statoLampadina = ROTTA;
		}

		public String getStatoLampadina() {
			return statoLampadina.toString();
		}

		
		
	


}
