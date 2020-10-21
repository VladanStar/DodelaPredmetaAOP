package com.vladancupric;

import java.util.List;

public class Profesor {
	private Fakultet fakultet;
	private List<String> predaje;
	public Profesor() {
		super();
	}
	public Profesor(Fakultet fakultet, List<String> predaje) {
		super();
		this.fakultet = fakultet;
		this.predaje = predaje;
	}
	public void dodajPredmet(String predmet) {
		predaje.add(predmet);
		fakultet.getPredmeti().remove(predmet);
		System.out.println(this);
		System.out.println(fakultet.toString());
		
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Profesor predaje:\n");
		for(String predmet : predaje) {
			sb.append(predmet);
			sb.append("\n");
		}
		return sb.toString();
	}
	
	

}
