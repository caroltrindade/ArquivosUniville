package br.univille.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import b.univille.dao.AnimalDao;
import br.univille.util.Observer;
import br.univille.util.Subject;

public class AnimalModel implements Subject{
	
	private long id;
	private String nome;
	private String raca;
	private String corPelo;
	private AnimalDao dao = new AnimalDao();
	private List<Observer> list;
	
	public AnimalModel() {
		this.list = new ArrayList<Observer>();
	}
	
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return this.raca;
	}
	public void setRaca(String cpf) {
		this.raca = raca;
	}
	public String getCorPelo() {
		return this.corPelo;
	}
	public void setCorPelo(String email) {
		this.corPelo = corPelo;
	}
	
	
	public void novoRegistro() {
		this.id = 0;
		this.nome = "";
		this.raca = "";
		this.corPelo = "";
		notifyObservers();
	}
	
	@Override
	public String toString() {
		return "Animal { id: " + this.id + ", nome: " + this.nome + ", raça: " + this.raca + ", cor do pêlo  " + this.corPelo;
	}
	
	
	@Override
	public void attach(Observer o) {
		this.list.add(o);
	}

	@Override
	public void detach(Observer o) {
		this.list.remove(o);
	}

	// Avisa os observadores
	@Override
	public void notifyObservers() {
		
		for(Observer o : list) {
			o.update(this, this);
		}
	}

	// Salva o Animal
	
	public void salvar() throws Exception {
		
		// Validações
		
		if (this.nome == null || this.nome.isEmpty()) {
			throw new Exception("Nome é inválido");
		}
		if (this.raca == null || this.raca.isEmpty()) {
			throw new Exception("Raça é inválida");
		}
		if (this.corPelo == null || this.corPelo.isEmpty()) {
			throw new Exception("Cor do pêlo é inválida");
		}
		else {
			// Novo animal
			
			if(this.id == 0) {
				dao.insert(this);	
			}
			
			// Edição do animal
			
			else {
				dao.update(this);
			}
			notifyObservers();
		}
	}
	
	// Deleta no banco de dados
	
	public void deletar() {
		dao.delete(this);
		novoRegistro();
		notifyObservers();
	}

}
