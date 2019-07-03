package br.edu.univille.main;

import br.edu.univille.classes.Data;
import br.edu.univille.classes.Frequencia;
import br.edu.univille.classes.Graus;
import br.edu.univille.classes.Hora;
import br.edu.univille.displays.Calendario;
import br.edu.univille.displays.RadioFM;
import br.edu.univille.displays.RadioRelogio;
import br.edu.univille.displays.Temperatura;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Utiiza��o do R�dio Rel�gio:");
		
		RadioRelogio radioRelogio = new RadioRelogio();
		Hora hora = new Hora(10,30);
		
		radioRelogio.formatter(hora);
		radioRelogio.show();
		
		System.out.println("");
		
		System.out.println("Utiiza��o do R�dio FM:");
		RadioFM radioFM = new RadioFM();
		Frequencia frequencia = new Frequencia(99.1);
			
		radioFM.formatter(frequencia);
		radioFM.show();
			
		System.out.println("");
		
		System.out.println("Utiiza��o da Temperatura:");
		Temperatura temperatura = new Temperatura();
		Graus graus = new Graus(21.5);
			
		temperatura .formatter(graus);
		temperatura .show();
		
		System.out.println("");
		
		System.out.println("Utiiza��o do Calend�rio:");
		Calendario calendario = new Calendario();
		Data data= new Data(25,06,2019);
			
		calendario .formatter(data);
		calendario .show();
	}

}