package br.edu.univille.youtube;

import br.edu.univille.interfaces.Observer;
import br.edu.univille.interfaces.Subject;

public class Usuario implements Observer{
	private String nome;
	
	public Usuario(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void update(Subject s, Object o) {
		String oferta = (String) o;
		System.out.println("Observador " + nome +" novo vídeo: " + oferta);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
