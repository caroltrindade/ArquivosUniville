	package br.univille.controller;

import br.univille.model.AnimalModel;
import br.univille.view.CadastroAnimalView;

public class CadastroAnimalController {
	private CadastroAnimalView view;
	private AnimalModel model;
	
	public CadastroAnimalController(CadastroAnimalView view, AnimalModel model) {
		this.view = view;
		this.model = model;
		model.attach(this.view);
		view.setModel(this.model);
		view.setControl(this);
	}
	
	public void exibirTela() {
		this.view.show();
		this.model.notifyObservers();
	}

	public void deletar() {
		this.model.deletar();
		this.view.setMensagemStatusBar("Registro deletado.");
		this.view.getBotaoDeletar().setEnabled(false);
	}

	public void novo() {
		this.model.novoRegistro();
		this.view.getBotaoDeletar().setEnabled(false);
		this.view.setMensagemStatusBar("Registro novo.");
	}
	
	public void salvar() {
		this.model.setNome(this.view.getNome());
		this.model.setRaca(this.view.getRaca());
		this.model.setCorPelo(this.view.getCorPelo());
		
		try {
			this.model.salvar();
			this.view.setMensagemStatusBar("Registro salvo com sucesso!");
			this.view.getBotaoDeletar().setEnabled(true);
		}catch(Exception e) {
			e.printStackTrace();
			this.view.setMensagemStatusBar("Erro: " + e.getMessage());
		}
	}
}
