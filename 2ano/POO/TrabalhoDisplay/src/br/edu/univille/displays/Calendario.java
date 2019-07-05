package br.edu.univille.displays;

import br.edu.univille.classes.Data;
import br.edu.univille.classes.Graus;
import br.edu.univille.formatter.Formatter;

public class Calendario extends Display<Data> implements Formatter<Data>{
	private Data data;
		
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Calendario(Data data) {
		this.data = data;
	}

	public Calendario() {
	}
	
	@Override
	public void show() {
		System.out.println(formatter(this.data));
	}

	@Override
	public String formatter(Data data) {
		return "Calendário:\n" + "Dia  Mês  Ano\n" + data.getDia() + "   " + data.getMes() + "   " + data.getAno();
	}
}
