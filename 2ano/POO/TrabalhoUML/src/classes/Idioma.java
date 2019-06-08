package classes;

public enum Idioma {
	BAHASA_INDONESIA("Bahasa Indonesia"),
    DANSK("Dansk"), 
	DEUTSCH("Deutsch"),
    ENGLISH("English"),
    ESPANOL("Español"),
    FRANCAIS("Français"),
    ITALIANO("Italiano"),
    NEDERLANDS("Nederlands"),
    NORSK_BOKMAL("Norsk bokmål"),
    POLSKI("Polski"),
    PORTUGUES("Português"),
    ROMANA("Română"),
    SUOMI("Suomi"),
    SVENSKA("Svenska"),
    TURKCE("Türkçe"),
    ELLINIKA("Ελληνικά"),
	ARABE("العربية"),
    ABRIT("עברית"),
	THAILANDES("ไทย"),
    CHINES("中文"),
    JAPONES("日本語"),
    KOREANO("한국어");

    private String displayName;

    private Idioma(String displayName) {
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
