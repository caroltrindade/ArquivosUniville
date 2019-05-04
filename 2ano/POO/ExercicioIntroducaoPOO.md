# Exercicios de Introdução à Programação Orientada a Objetos

1. O que é um objeto?
    > Trata-se da uma representação de algo que possui características e comportamentos, ou seja, uma identidade.

1. Identifique 3 características e 3 comportamentos de um carro.
    - Características:\
        > Cor, modelo e Km rodados.\
    - Comportamentos:\
        > Parar ou Andar, Ligar ou Desligar, Abrir ou Fechar as portas.\

1. No contexto de Orientação a Objetos, as características e comportamentos são chamados respectivamente de?
    Atributos e métodos.

1. Qual é o objetivo da programação orientada à objetos?
    Tem o objetivo de desenvolver um software utilizando objetos de maneira cooperativa através de troca de mensagens entre os mesmos (Interação entre objetos com os métodos);

1. O que é abstração? Cite um exemplo.
    > É a representação de alguma coisa do mundo real, se preocupando apenas com suas características principais disto. \
    > Exemplo: As características e comportamentos de um avião.

1. O que é classe?
    > É a representação das caracteristicas e comportamentos de um objeto do mundo real. Tendo em mente que serão representados por meio de atributos e métodos, respectivamente.\
    > Ela define atributos (características) e métodos (características) em comum de um grupo de objetos.

1. Qual é o padrão utilizado para nomear as classes? Cite um exemplo.
    > Padrão PascalCase, onde a primeira letra de todas as palavras deve ser maiúscula.\
    > Também, o nome da classe deve fazer referência ao seu objeto, de modo que se entenda a finalidade da mesma.

1. Qual opção apresenta corretamente o nome da classe carro elétrico?
    1. carroeletrico
    1. carroEletrico
    1. Carroeletrico
    1. CarroEletrico
    1. carro_eletrico
    
    > 4. CarroEletrico

1. Qual é o padrão utilizado para nomear os atributos? Cite um exemplo.
    > Padrão camelCase, onde a primeira letra de cada palavra deve ser em maiúscula, com exceção da primeira palavra. \
    > Por exemplo: dataEmissao, onde a palavra "data" começa com letra minúscula, pois é a primeira palavra, e a palavra "Emissao" inicia com letra maiúsula

1. Qual opção apresenta corretamente o nome do atributo cor de fundo?
    1. CordeFundo
    1. CorDeFundo
    1. corDeFundo
    1. _cor_de_fundo
    1. _corDeFundo
    1. mCorDeFundo

    > 3. corDeFundo

1. Qual é o padrão utilizado para nomear os métodos? Cite um exemplo.
    > Padrão camelCase (primeira letra de cada palavra maíuscula, com exceção da primeira palavra).\
    > O nome de um método deve explicitar a ação executada pelo mesmo, é comum que o nome do método inicie com um verbo, remetendo à ação que o mesmo irá realizar.\
    > Exemplo: cadastrarCliente()

1. Qual opção apresenta corretamente o nome do método está vazio?
    1. estaVazio
    1. _estaVazio
    1. estavazio
    1. EstaVazio
    1. Estavazio
    1. Esta_vazio
    
    > 1. estaVazio

1. No contexto de orientação à objetos, o que é um objeto? Em que momento existe um objeto? Quando ele deixa de existir?
    > Um objeto é a instância de uma classe.\
    > Ele existe a partir do momento em que é instanciado a classe.\
    > Ele deixa de existir quando o programa é finalizado ou o objeto é excluído da memória (Em java, utiliza-se o finalize, um destrutor).

1. Qual é o objetivo do operador `new`?
    > Este operador reserva o espaço na memória necessário para gravar a variável, ou objeto.\
    > Também, ele instancia um objeto de uma classe, ou seja, chama seu método construtor.

1. O que é o construtor? Qual é o seu objetivo? Qual deve ser o seu nome? Cite um exemplo.
    > Trata-se do método inicializador de uma classe, ele inicializa variáveis, instancia objetos necessários e dispara métodos de inicialização.\
    > Seu nome deve ser exatamente igual ao da classe em do mesmo.\
    > Exemplo:

    ```java
        public class Pessoa(){
            public String nome;

            public Pessoa(String nome){
                this.nome = nome;
            }

        }
    ```
    
1. Caso o construtor da classe Aluno não for declarado, qual será o seu construtor?
    > Será o construtor padrão, que não possui parâmetros.

1. Crie um exemplo de instanciação da classe Aluno. Utilize o construtor padrão.

    ```java
        // Arquivo da classe do objeto
        public class Aluno(){
            public String nome;
            public int matricula;
            
            public Aluno(){

            }
        }

        // Arquivo da classe onde será inicializado o objeto
        public class Inicializacao(){

            public static void main(String[] args) {
                // Instanciação da classe
                Aluno aluno = new Aluno();
            }
        }
    ``` 

1. O que é encapsulamento?
    > Encapsulamento é uma técnica de modelagem e implementação que separa aspectos externos de um objeto dos detalhes internos de implementação do mesmo. Ele encapsula os dados, para deixá-los mais seguros, utilizando modificadores de acesso.\
    > O objetivo aqui é separar o programa em partes o mais isoladamente possível.

1. Qual é o objetivo do modificador de acessso public?
    > Tornar o método ou atributo acessível de qualquer classe.\
    > Somente as classes que possuem acesso sobre o atributo ou método possuem permissão para alterá-lo.

1. Qual é o objetivo do modificador de acessso private?
    > Tornar o método ou atributo acessível somente pela classe que o mesmo pertence.\
    > Somente as classes que possuem acesso sobre o atributo ou método possuem permissão para alterá-lo.

1. Como é aplicado o encapsulamento em uma classe? Considere a classe Aluno com o atributo matrícula.
    > É alterado o modificador de acesso do atributo matírcula para private, isto e, só a classe Aluno poderá acessá-lo e modificá-lo.\
    > Após, cria-se métodos públicos, ou seja, acessíveis por qualquer classe, que realizam a obtenção (getMatricula) e a atribuição (setMatricula) de valores ao atributo matricula.

    ```java
        public class Aluno(){
            private int matricula;
            
            public int getMatricula(){
                return matricula;
            }

            public void setMatricula(int matricula){
                this.matricula = matricula;
            }
        }
    ``` 

1. Qual o objetivo dos métodos getters? Crie um exemplo.
    > Seu objetivo é retornar valores de atributos. Estes atributos geralmente possuem modificador de acesso privado (private).
    
    ```java
        public class Pessoa(){
            private int idade;
            
            public int getIdade(){
                return idade;
            }
        }
    ``` 

1. Qual o objetivo dos métodos setters? Crie um exemplo.
    > Seu objetivo é atribuir valores à atributos. Estes atributos geralmentep ossuem modificador de acesso privado (private).
    
    ```java
        public class Pessoa(){
            private int idade;
            
            public void setIdade(int idade){
                this.idade = idade;
            }
        }
    ``` 
1. O diagrama de classe UML é composto por 3 partes. O que vai em cada parte?
    - Nome da Classe
        > Trata-se do nome da classe que está sendo representada.
    - Atributos
        > Tratam-se dos atributos da classe que está sendo representada.
    - Métodos
        > Tratam-se dos métodos existentes na classe que está sendo representada.

1. Qual é o padrão utilizado para representar um atributo no diagrama de classe
    > O padrão utilizado é modificadorAcesso / nomeAtributo: TipoDado
    > Por exemplo: - nome: String\
    
    |     Pessoa     |
    | -------------- |
    |- nome : String |

    > Isto significa que o atributo nome é privado (-) e é do tipo de dado String.

1. Qual é o padrão utilizado para representar um método no diagrama de classe UML? Crie um exemplo.
    > O padrão utilizado é modificadorAcesso / nome_metodo (parametro: tipoDado) : tipoDadoRetorno
    > Exemplo 1: + getNome(): String\
    > Exemplo 2: + setNome(nome: String): void\
    
    |     Pessoa     |
    | -------------- |
    |- nome : String |
    |+ getNome(): String <br> + setNome(nome: String) : void |


1. Como o construtor de uma classe pode ser diferenciado no diagrama de classe UML? Crie um exemplo.
    > Um construtor pode ser diferenciado utilizando '<<create>> metodoConstrutor()', onde o método será público e não terá retorno.\
    > Por Exemplo: + <<create>> Pessoa()

    |     Pessoa     |
    | -------------- |
    |- nome : String |
    |+ <<create>> Pessoa()|

1. Quais são os simbolos utilizados no diagrama de classe UML para representar os modificadores de acessos aos atributos e métodos? Crie um exemplo.
    Representação dos modificadores de acesso:
    \-: Privado
    \+: Público
    \#: Protegido
    \~: Padrão

    |     Pessoa     |
    | -------------- |
    |- nome : String |
    |+ getNome(): String <br> + setNome(nome: String) : void <br> # alterarNome(nome: String) : void |

1. Considere a classe Cliente, com os atributos nome, email e telefone com os respectivos métodos getters e setters. Desenvolva o diagrama de classe UML.

    |     Cliente    |
    | -------------- |
    |- nome : String <br> - email : String <br> - telefone : int |
    |+ getNome(): String <br> + setNome(nome: String) : void <br> + getEmail(): String <br> + setEmail(email: String) : void <br> + getTelefone(): int <br> + setTelefone(telefone: int) : void|

1. Considere a classe Cliente apresentado no Problema 29, e desenvolva o código Java correspondente.

    ```java
    public class Cliente {
	private String nome;
	private String email;
	private int telefone;
	
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
	
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
    ```

1. Desenvolva o código java das classes do apresentadas no diagrama de classes UML abaixo:

![ImagemUMLClasse](/images/ImagemUMLClasse.png)



1. Desenvolva o diagrama de classe dos cóodigos Java abaixo.
    ```java
    public class Livro{
        private String nome;

        public String getNome(){
            return nome;
        }

        public void setNome(String nome){
            this.nome = nome;
        }

    }

    public class ContaCorrente{
        private double saldo;
        
        public double sacar(double valor){
            return 0.0;
        }

        public void depositar(double valor){
            this.saldo = saldo;
        }

        private void recalcularSaldo(){
        }
    }
        
    public class Par{
        public String chave;
        public String valor;
    }

    public class Impressora{
        public void imprimir(Documento documento){

        }
    }
    ```

1. O que é o estado de um objeto? Cite um exemplo com a classe Aluno com os atributos nome, idade, matrícula e curso. Utilize o diagrama de estado de objeto.

1. Qual ébo estado do objeto da classe Dog quando é inicializado? Desenvolva o diagrama de objetos.

    ```java
        public class Dog{
            private int years;
            private String name;
            private boolean alive;
            //Getters e setters suprimido
        }
    ```

1. Qual é o estado do objeto dog no final da execução do método main? Desenvolva o diagrama de objetos.

    ```java
        1: public static void main(String args[]){
        2:  Dog dog = new Dog();
        6
        3:  dog.setYears(10);
        4:  dog.setName("Spike");
        5:  dog.setAlive(true);
        6:}
    ```

1. Qual é o estado do objeto pug e buldog ap´os a execu¸c˜ao da linha 6? Desenvolva o diagrama de objetos.

    ```java
        1: Dog pug = new Dog();
        2: Dog buldog = new Dog();
        3: pug.setName("Spoke")
        4: buldog.setName("Spike");
        5: pug.setAlive(true);
        6: pug.setYears(2);
        7: buldog.setName("Floquinho");
        8: pug.setYears(1);
    ```

1. Analise o código abaixo. Verifique se existem problemas, caso sim, indique o problema e sugere as correções.

    ```java
        1: public class Cat{
        2: private String name;
        3: public double weight;
        4: // Getters e Setters suprimidos
        5:}
        6:public class Main{
        7: public static void main(String args[]){
        8: Cat c = new Cat();
        9: c.weight = 3.5;
        10: c.name = "BlackCat";
        11: }
        12:}
    ```