package netflix;

import java.util.Arrays;

public class Conta {
	private String nome;
	private String email;
	private String senha;
	private int telefone;
	private Plano plano;
	private Perfil[] perfis;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public Plano getPlano() {
		return plano;
	}
	public void setPlano(Plano plano) {
		this.plano = plano;
	}
	
	public Perfil[] getPerfis() {
		return perfis;
	}
	public void setPerfis(int i, Perfil perfil) {
		this.perfis[i] = perfil;
		System.out.println("Perfil adicionado com sucesso!");
	}
	
	public Conta() {
		this.perfis = new Perfil[4];
	}
	
	public void criarConta(String nome, String email, String senha, int telefone, Plano plano){
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
		this.plano = plano;
		
		System.out.println("Conta criada com sucesso!");
	}
	
	public void realizarLogin(String email, String senha){
		if (this.getEmail() == email && this.getSenha() == senha){
			System.out.println("Usuário logado com sucesso!");
		}
		else{
			System.out.println("Não foi possível realizar o login! Alguma informação deve estar incorreta.");
		}
	}
	
	@Override
	public String toString() {
		String descricaoPerfil = "";
		
		for (int i = 0; i < this.perfis.length; i++){
			
			if (perfis[i] != null){
				descricaoPerfil = descricaoPerfil + perfis[i];
			}
		}
		
		return "Conta:"
				+ "\nNome: " + this.nome
				+ "\nE-mail: " + this.email
				+ "\nTelefone: " + this.telefone
				+ "\nPlano: " + this.plano.getNome()
				+ "\nPerfis: " + descricaoPerfil;
	}	
}