package br.edu.univille.factory;

import br.edu.univille.displays.Calendario;
import br.edu.univille.displays.Display;
import br.edu.univille.displays.RadioFM;
import br.edu.univille.displays.RadioRelogio;
import br.edu.univille.displays.Temperatura;

public class Factory {

	public Display<?> getInstance(String classe){
		
		switch (classe) {
		case "RadioRelogio":
			return new RadioRelogio();

		case "RadioFM":
			return new RadioFM();
			
		case "Temperatura":
			return new Temperatura();
			
		case "Calendario":
			return new Calendario();
			
		default:
			return null;
		}
		
	}
}
