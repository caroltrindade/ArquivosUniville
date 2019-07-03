package br.edu.univille.displays;

import br.edu.univille.classes.Frequencia;
import br.edu.univille.classes.Graus;
import br.edu.univille.formatter.Formatter;

public class Temperatura extends Display implements Formatter<Graus>{
	private String temperaturaFormatada;
	
	@Override
	public void show() {
		System.out.println(this.temperaturaFormatada);
		
	}

	@Override
	public void formatter(Graus graus) {
		this.temperaturaFormatada = graus.getGraus() + " °C";
		
	}

}
