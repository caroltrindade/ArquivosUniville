package br.edu.univille.main;

import br.edu.univille.ecommerce.Cliente;
import br.edu.univille.ecommerce.Oferta;
import br.edu.univille.youtube.Notificacao;
import br.edu.univille.youtube.Usuario;

public class Main {

	public static void main(String[] args) {
		// e-commerce
		
		Oferta ofertas = new Oferta();

		Cliente joao = new Cliente("João");
		Cliente maria = new Cliente("Maria");
		
		ofertas.attach(joao);
		ofertas.attach(maria);
		
		ofertas.novaOferta("Camiseta bordada", 45.0);
		
		ofertas.detach(joao);

		ofertas.novaOferta("Vestido vermelho", 90.5);
		
		// Youtube
		
		Notificacao notificadorYoutube = new Notificacao();

		Usuario usuario = new Usuario("Maria da Silva");
		
		notificadorYoutube.attach(usuario);
		notificadorYoutube.novoVideo("Ordem correta dos filmes da Marvel", 10);
	}

}
