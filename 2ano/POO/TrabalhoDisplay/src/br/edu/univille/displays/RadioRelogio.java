package br.edu.univille.displays;

import br.edu.univille.classes.Hora;
import br.edu.univille.formatter.Formatter;

public class RadioRelogio extends Display<Hora> implements Formatter<Hora>{
	private Hora hora;
	
	public Hora getHora() {
		return hora;
	}

	public void setHora(Hora hora) {
		this.hora = hora;
	}
	
	public RadioRelogio(Hora hora) {
		this.hora = hora;
	}

	public RadioRelogio() {
	}
	
	@Override
	public void show() {
		System.out.println(formatter(this.hora));
	}

	@Override
	public String formatter(Hora hora) {
		return "Rádio Relógio:\n" + hora.getHora() + ":" + hora.getMinutos();
	}
}