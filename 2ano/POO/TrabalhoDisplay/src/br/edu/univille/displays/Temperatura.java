package br.edu.univille.displays;

import br.edu.univille.classes.Frequencia;
import br.edu.univille.classes.Graus;
import br.edu.univille.formatter.Formatter;

public class Temperatura extends Display implements Formatter<Graus>{
	private Graus graus;
	
	public Graus getGraus() {
		return graus;
	}

	public void setGraus(Graus graus) {
		this.graus = graus;
	}
	
	public Temperatura(Graus graus) {
		super();
		this.graus = graus;
	}

	@Override
	public void show() {
		System.out.println(formatter(this.graus));	
	}

	@Override
	public String formatter(Graus graus) {
		return "Temperatura:\n" + graus.getGraus() + " °C";
	}

}
