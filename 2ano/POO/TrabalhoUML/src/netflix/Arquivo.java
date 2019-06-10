package netflix;

public class Arquivo {
	private String nome;
	private String extensao;
	private String caminhoArquivo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getExtensao() {
		return extensao;
	}
	public void setExtensao(String extensao) {
		this.extensao = extensao;
	}
	
	public String getCaminhoArquivo() {
		return caminhoArquivo;
	}
	public void setCaminhoArquivo(String caminhoArquivo) {
		this.caminhoArquivo = caminhoArquivo;
	}
	
	public Arquivo(String nome, String extensao, String caminhoArquivo) {
		this.nome = nome;
		this.extensao = extensao;
		this.caminhoArquivo = caminhoArquivo;
	}
}
