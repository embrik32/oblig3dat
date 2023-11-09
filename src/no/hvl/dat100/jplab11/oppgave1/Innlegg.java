package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	private int id;
	private String bruker;
	private String dato;
	private int likes;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
		
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		
	}
	
	public String getBruker() {
		
		return this.bruker;

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		
		return this.dato;
		
	}

	public void setDato(String dato) {
		
		this.dato = dato;

	}

	public int getId() {
		
		return this.id;

	}

	public int getLikes() {
		
		return this.likes;

	}
	
	public void doLike () {
		this.likes++;
	}
	
	public boolean erLik(Innlegg innlegg) {
		
		boolean x = false;
		if(this.id == innlegg.id) {
			x = true;
		} else {
			x = false;
		}
		return x;
		
	}
	
	@Override
	public String toString() {
		
		return this.id + "\n" + this.bruker + "\n" + this.dato + "\n" + this.likes + "\n";
				
	}
	
	
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
