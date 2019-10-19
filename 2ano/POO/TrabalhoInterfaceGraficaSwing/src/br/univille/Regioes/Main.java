package br.univille.Regioes;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import br.univille.login.Login;

public class Main {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Regioes regioes =  new Regioes();
				regioes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				regioes.show();
            }
        });
	}
}
