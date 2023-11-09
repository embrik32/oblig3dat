package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] liste;
	private int anntall = 0;

	public Blogg() {
		liste = new Innlegg[20];
	}

	public Blogg(int lengde) {
		liste = new Innlegg[lengde];
	}

	public int getAntall() {
		
		return this.anntall;
		
	}
	
	public Innlegg[] getSamling() {
		
		return this.liste;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		
		int x = -1;
		for (int i = 0; i < this.anntall; i++) {
			if (this.liste[i].erLik(innlegg)) {
				x = i;
			}
		}
		return x;
	}

	public boolean finnes(Innlegg innlegg) {
		
		
		for (int i = 0; i < this.anntall; i++) {
			if (this.liste[i].erLik(innlegg)) {
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		
		if (this.anntall < this.liste.length) {
			return true;
		} else {
			return false;
		}

	}
	
	public boolean leggTil(Innlegg innlegg) {
		
		if (!finnes(innlegg) && this.ledigPlass()) {
			liste[this.anntall] = innlegg;
			this.anntall++;
			return true;
		} else {
			return false;
		}
		
	}
	
	public String toString() {
		String x;
		x = this.anntall + "\n";
		for (int i = 0; i < this.anntall; i++) {
			x += this.liste[i].toString();
		}
		return x;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}