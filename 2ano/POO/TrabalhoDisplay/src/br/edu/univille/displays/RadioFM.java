package br.edu.univille.displays;

import br.edu.univille.classes.Frequencia;
import br.edu.univille.formatter.Formatter;

public class RadioFM extends Display implements Formatter<Frequencia>{
	private Frequencia frequencia;
	
	public Frequencia getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(Frequencia frequencia) {
		this.frequencia = frequencia;
	}
	
	public RadioFM(Frequencia frequencia) {
		this.frequencia = frequencia;
	}

	@Override
	public void show() {
		System.out.println(formatter(this.frequencia));	
	}

	@Override
	public String formatter(Frequencia frequencia) {
		return "Rádio FM:\n" + "FM " + frequencia.getFrequencia() + " Mhz";
	}

}
