package netflix;

import java.io.FileNotFoundException;

public class Conteudo {
	private String titulo;
	private String descricao;
	private Tipo tipo;
	private Genero genero;
	private Classificacao classificacao;
	private Arquivo arquivo;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public Classificacao getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(Classificacao classificacao) {
		this.classificacao = classificacao;
	}

	public Arquivo getArquivo() {
		return arquivo;
	}
	public void setArquivo(Arquivo arquivo) {
		this.arquivo = arquivo;
	}
	
	public Arquivo obterArquivo(String caminho) throws FileNotFoundException {
		if (this.getArquivo().getCaminhoArquivo() != caminho){
			throw new FileNotFoundException("Arquivo não pertence ao conteúdo!");
		}
		
		return this.arquivo;
	}
	
	public void inserirArquivo(Arquivo arquivoConteudo) {
		String nome = arquivoConteudo.getNome();
		String extensao = arquivoConteudo.getExtensao();
		String caminho = arquivoConteudo.getCaminhoArquivo();
		
		this.arquivo = new Arquivo(nome, extensao,caminho);
	}
	
	public Conteudo(String titulo, String descricao, Tipo tipo, Genero genero, Classificacao classificacao) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.tipo = tipo;
		this.genero = genero;
		this.classificacao = classificacao;
	}
	
	@Override
	public String toString() {
		return "\nTítulo: " + this.titulo 
				+ "\nDescrição: " + this.descricao
				+ "\n" + tipo + " - " + this.genero
				+ "\nClassificação: " + this.classificacao;
	}
}
