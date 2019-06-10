package netflix;

public enum ConteudoPermitido {
	CRIANCA_PEQUENA("Apenas para crian�as pequenas"),
    CRIANCAS("Crian�as de todas as idades"), 
	ADOLESCENTES("Adolescentes e mais novos"),
    TODOS("Todos os n�veis de maturidade");
	
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