package com.vladancupric;

import java.util.List;

public class Fakultet {
	private List<String> predmeti;

	public Fakultet() {
		super();
	}

	public Fakultet(List<String> predmeti) {
		super();
		this.predmeti = predmeti;
	}

	public List<String> getPredmeti() {
		return predmeti;
	}

	public void setPredmeti(List<String> predmeti) {
		this.predmeti = predmeti;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nedodelejeni predmeti fakulteta su: \n");
		for(String predmet : predmeti) {
			sb.append(predmet);
			sb.append("\n");
		}
		return sb.toString();
	}
	
	

}
