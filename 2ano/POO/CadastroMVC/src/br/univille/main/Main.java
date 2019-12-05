package br.univille.main;

import br.univille.controller.CadastroAnimalController;
import br.univille.model.AnimalModel;
import br.univille.view.CadastroAnimalView;

public class Main {

	public static void main(String[] args) {
		AnimalModel p = new AnimalModel();
		//p.setId(1);
		//p.setNome("Theo");
		//p.setRaca("lulu da pomerânia");
		//p.setCorPelo("Marrom claro");
		
		CadastroAnimalController control = new CadastroAnimalController(new CadastroAnimalView(), p);
		control.exibirTela();
	}

}
