package classes;

public enum Classificacao {
	LIVRE("Livre"),
	CLASSIFICACAO_10("10"),
	CLASSIFICACAO_12("12"),
	CLASSIFICACAO_14("14"),
	CLASSIFICACAO_16("16"),
	CLASSIFICACAO_18("18");

	private String displayName;

    private Classificacao(String displayName) {
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
