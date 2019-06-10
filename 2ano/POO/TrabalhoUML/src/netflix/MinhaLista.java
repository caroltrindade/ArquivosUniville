package netflix;

import java.util.ArrayList;

public class MinhaLista {
	ArrayList<Conteudo> lista = new ArrayList<Conteudo>();
		
	public void adicionarAMinhaLista(Conteudo conteudo){
		this.lista.add(conteudo);
		System.out.println("Conteúdo adicionado à minha lista com sucesso!");
	}
	
	public ArrayList<Conteudo> obterMinhaLista(){
		return this.lista;
	}

	@Override
	public String toString() {
		String descricao = "Minha Lista";
		
		for (int i = 0; i < lista.size(); i++){
			descricao = descricao + "\n- " + lista.get(i).getTitulo();
		}
		
		return descricao;
	}
	
	
}
