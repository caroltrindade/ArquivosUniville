package classes;

public class Conteudo {
	private String titulo;
	private String descricao;
	private Tipo tipo;
	private Genero genero;
	private Classificacao classificacao;
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

	public Arquivo obterArquivo(String caminho) {
		//Integração com o banco de dados
		
		Arquivo arquivo = new Arquivo();
		
		return arquivo;
	}
	
	public void inserirArquivo(Arquivo arquivo) {
		arquivo = new Arquivo();
	}
	
}
