package br.edu.univille.ecommerce;

import java.util.ArrayList;
import java.util.List;

import br.edu.univille.interfaces.Observer;
import br.edu.univille.interfaces.Subject;

public class Oferta implements Subject {
		private List<Observer> observers;
		private String oferta;
		
		public Oferta() {
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
				o.update(this, oferta);
			}
		}
		
		public void novaOferta(String desProd, double valProd) {
			oferta = "Produto: " + desProd + " no valor de R$" + valProd;
			
			notifyObservers();
		}

}
