package classes;

public enum Genero {
	COMEDIA("Comédia"),
	SUSPENSE("Suspense"),
	TERROR("Terror"),
	DRAMA("Drama"),
	ACAO("Ação"),
	INVESTIGACAO("Investigaçã");

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
