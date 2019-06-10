package netflix;

public enum ConteudoPermitido {
	CRIANCA_PEQUENA("Apenas para crianças pequenas"),
    CRIANCAS("Crianças de todas as idades"), 
	ADOLESCENTES("Adolescentes e mais novos"),
    TODOS("Todos os níveis de maturidade");
	
	private String displayName;

    private ConteudoPermitido(String displayName) {
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