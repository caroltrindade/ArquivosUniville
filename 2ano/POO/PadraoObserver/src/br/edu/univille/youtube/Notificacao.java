package br.edu.univille.youtube;

import java.util.ArrayList;
import java.util.List;

import br.edu.univille.interfaces.Observer;
import br.edu.univille.interfaces.Subject;

public class Notificacao implements Subject {
	private List<Observer> observers;
	private String video;
	
	public Notificacao() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(Observer o : observers) {
			o.update(this, video);
		}
	}
	
	public void novoVideo(String titulo, double duracao) {
		video = "Video: " + titulo + ", Duração:" + duracao + " min";
		
		// Após a modificacao, avisa os observadores
		notifyObservers();
	}
}
