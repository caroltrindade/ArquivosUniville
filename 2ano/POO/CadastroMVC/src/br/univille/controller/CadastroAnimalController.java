	package br.univille.controller;

import br.univille.model.AnimalModel;
import br.univille.view.CadastroAnimalView;

public class CadastroAnimalController {
	private CadastroAnimalView view;
	private AnimalModel model;
	
	public CadastroAnimalController(CadastroAnimalView view, AnimalModel model) {
		this.view = view;
		this.model = model;
		model.attach(view);
		view.setModel(model);
		view.setControl(this);
	}
	
	public void exibirTela() {
		view.show();
		model.notifyObservers();
	}

	public void deletar() {
		model.deletar();
		view.setMensagemStatusBar("Registro deletado.");
		view.getBotaoDeletar().setEnabled(false);
	}

	public void novo() {
		model.novoRegistro();
		view.getBotaoDeletar().setEnabled(false);
		view.setMensagemStatusBar("Registro novo.");
	}
	
	public void salvar() {
		model.setNome(view.getNome());
		model.setRaca(view.getRaca());
		model.setCorPelo(view.getCorPelo());
		
		try {
			model.salvar();
			view.setMensagemStatusBar("Registro salvo com sucesso!");
			view.getBotaoDeletar().setEnabled(true);
		}catch(Exception e) {
			e.printStackTrace();
			view.setMensagemStatusBar("Erro: "+e.getMessage());
		}
	}
}
