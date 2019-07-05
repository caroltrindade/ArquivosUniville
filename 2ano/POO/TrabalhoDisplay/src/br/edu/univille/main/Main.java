package br.edu.univille.main;

import br.edu.univille.classes.Data;
import br.edu.univille.classes.Frequencia;
import br.edu.univille.classes.Graus;
import br.edu.univille.classes.Hora;
import br.edu.univille.displays.Calendario;
import br.edu.univille.displays.Display;
import br.edu.univille.displays.RadioFM;
import br.edu.univille.displays.RadioRelogio;
import br.edu.univille.displays.Temperatura;
import br.edu.univille.factory.Factory;

public class Main {

	public static void main(String[] args) {
		
		// Instancia a factory
		
		Factory factory = new Factory();
		
		// Utiização do Rádio Relógio:
		
		Hora hora = new Hora(10,30);
		RadioRelogio radioRelogio = (RadioRelogio) factory.getInstance("RadioRelogio");
		radioRelogio.setHora(hora);
		radioRelogio.show();
		
		System.out.println("");
	
		// Utiização do Rádio FM:
		
		Frequencia frequencia = new Frequencia(99.1);
		RadioFM radioFM = (RadioFM) factory.getInstance("RadioFM");
		radioFM.setFrequencia(frequencia);
		radioFM.show();
			
		System.out.println("");
		
		//Utiização da Temperatura:
		
		Graus graus = new Graus(21.5);
		Temperatura temperatura = (Temperatura) factory.getInstance("Temperatura");
		temperatura.setGraus(graus);
		temperatura .show();
		
		System.out.println("");
		
		// Utiização do Calendário:
		
		Data data = new Data(25,06,2019);
		Calendario calendario = (Calendario) factory.getInstance("Calendario");
		calendario.setData(data);
		calendario .show();
	}

}