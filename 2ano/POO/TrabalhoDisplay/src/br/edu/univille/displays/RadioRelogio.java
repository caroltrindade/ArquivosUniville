package br.edu.univille.displays;

import br.edu.univille.classes.Hora;
import br.edu.univille.formatter.Formatter;

public class RadioRelogio extends Display implements Formatter<Hora>{
	private String horaFormatada;

	@Override
	public void show() {
		System.out.println(this.horaFormatada);
		
	}

	@Override
	public void formatter(Hora hora) {
		this.horaFormatada = hora.getHora() + ":" + hora.getMinutos();
	}
}