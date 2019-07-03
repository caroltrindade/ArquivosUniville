package br.edu.univille.displays;

import br.edu.univille.classes.Data;
import br.edu.univille.classes.Graus;
import br.edu.univille.formatter.Formatter;

public class Calendario extends Display implements Formatter<Data>{
	private String dataFormatada;
	
	@Override
	public void show() {
		System.out.println("Dia  Mês  Ano");
		System.out.println(this.dataFormatada);
	}

	@Override
	public void formatter(Data data) {
		this.dataFormatada = data.getDia() + "   " + data.getMes() + "   " + data.getAno();
	}
}
