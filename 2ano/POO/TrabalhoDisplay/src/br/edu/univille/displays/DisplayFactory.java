package br.edu.univille.displays;

public enum DisplayFactory {
	RADIORELOGIO {
		@Override
		public RadioRelogio getInstance(){
			return new RadioRelogio();
		}
	};
	
	public abstract Display getInstance();
}
