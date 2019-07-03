package br.edu.univille.displays;

import br.edu.univille.classes.Frequencia;
import br.edu.univille.formatter.Formatter;

public class RadioFM extends Display implements Formatter<Frequencia>{
	private String frequenciaFormatada;
	
	@Override
	public void show() {
		System.out.println(this.frequenciaFormatada);
		
	}

	@Override
	public void formatter(Frequencia frequencia) {
		this.frequenciaFormatada = "FM " + frequencia.getFrequencia() + " Mhz";
		
	}

}
