package br.univille.login;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Login login =  new Login();
				login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				login.show();
            }
        });
	}
}
