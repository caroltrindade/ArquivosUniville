package netflix;

public enum Tipo {
	FILME("Filme"),
    SERIE("S�rie"), 
	DOCUMENTARIO("Document�rio");
    
    private String displayName;
    
    private Tipo(String displayName) {
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
