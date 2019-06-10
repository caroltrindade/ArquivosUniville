package netflix;

public class Perfil {
	private String nome;
	private boolean crianca;
	private ConteudoPermitido conteudoPermitido;
	private Idioma idioma;
	private MinhaLista minhaLista;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean isCrianca() {
		return crianca;
	}
	public void setCrianca(boolean crianca) {
		this.crianca = crianca;
	}
	
	public ConteudoPermitido getConteudoPermitido() {
		return conteudoPermitido;
	}
	public void setConteudoPermitido(ConteudoPermitido conteudoPermitido) {
		this.conteudoPermitido = conteudoPermitido;
	}
	
	public Idioma getIdioma() {
		return idioma;
	}
	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}
	
	public MinhaLista getMinhaLista() {
		return minhaLista;
	}
	public void setMinhaLista(MinhaLista minhaLista) {
		this.minhaLista = minhaLista;
	}
	
	public Perfil(String nome, boolean crianca, ConteudoPermitido conteudoPermitido, Idioma idioma) {
		this.nome = nome;
		this.crianca = crianca;
		this.conteudoPermitido = conteudoPermitido;
		this.idioma = idioma;
	}
	
	@Override
	public String toString() {
		String descricaoCrianca = "Não";
		String descricaoMinhaLista = "";
		
		
		if (this.isCrianca()){
			descricaoCrianca = "Sim";			
		}
		
		if (this.minhaLista != null){
			descricaoMinhaLista = descricaoMinhaLista + this.minhaLista.toString();
		}
		
		return "\nNome: " + this.nome 
				+ "\nCrianca: " + descricaoCrianca
				+ "\nConteúdo Pemitido: " + this.conteudoPermitido
				+ "\nIdioma: " + this.idioma
				+ "\n" + descricaoMinhaLista;
	}
	
}
