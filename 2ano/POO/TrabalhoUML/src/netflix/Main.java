package netflix;

public class Main {
	public static void main(String[] args) {

		// Geração dos dados gerais do sistema

		Conteudo conteudo = new Conteudo("Harry Potter e a Pedra Filosofal",
				"Harry Potter, um menino que soube em seu aniversário de onze anos que é filho órfão de dois bruxos e possui poderes mágicos únicos. De filho indesejado, passa a ser um estudante de Hogwarts, uma escola inglesa para bruxos, onde conhece novos amigos e uma nova fase de sua vida se inicia.",
				Tipo.FILME, Genero.ACAO, Classificacao.LIVRE);

		Arquivo arquivoConteudo = new Arquivo("HarryPotter1", ".avi", "./arquivos/HarryPotter1.avi");
		conteudo.inserirArquivo(arquivoConteudo);

		Plano plano = new Plano("Ultra HD",
				"Assista em 4 telas ao mesmo tempo. HD e Ultra HD disponíveis. Baixe vídeos em 4 smartphones ou tablets.",
				37.90);

		// Geração do usuário

		Conta conta = new Conta();
		conta.criarConta("Carolina Trindade", "carolinatrindade@email.com", "123ABC", 999999999, plano);
		System.out.println("");
		
		Perfil perfilCarolina = new Perfil("Carolina", false, ConteudoPermitido.TODOS, Idioma.PORTUGUES);
		conta.setPerfis(0, perfilCarolina);
		System.out.println("");
		
		Perfil perfilJoao = new Perfil("Joãozinho", true,ConteudoPermitido.CRIANCA_PEQUENA, Idioma.PORTUGUES);
		conta.setPerfis(1, perfilJoao);
		System.out.println("");
		
		System.out.println(conta);
		System.out.println("");

		// Loga na conta
		
		conta.realizarLogin(conta.getEmail(), conta.getSenha());
		System.out.println("");

		// Visualiza os conteúdos disponíveis e o adiciona em sua lista
		
		System.out.println("Catálogo de conteúdos disponíveis: ");
		System.out.println(conteudo);
		System.out.println("");
		
		MinhaLista minhaistaCarolina = new MinhaLista();
		minhaistaCarolina.adicionarAMinhaLista(conteudo);
		
		perfilCarolina.setMinhaLista(minhaistaCarolina);
		System.out.println("");
		
		System.out.println(minhaistaCarolina);
	}
}
