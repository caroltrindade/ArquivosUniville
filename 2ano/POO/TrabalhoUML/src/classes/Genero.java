package classes;

public enum Genero {
	COMEDIA("Com�dia"),
	SUSPENSE("Suspense"),
	TERROR("Terror"),
	DRAMA("Drama"),
	ACAO("A��o"),
	INVESTIGACAO("Investiga��");

	private String displayName;

    private Genero(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() {
        return this.displayName;
    }
    
    @Override
    public String toString() {
        return this.displayName;
    }
}
