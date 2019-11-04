package janela;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTabbedPane;

import componentes.Abas;
import componentes.Menu;

public class Janela extends JFrame{
	
	public Janela(){	
		setTitle("Nova Janela");
		setSize(400,300);
		setBackground(Color.white);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout();
	}
		
	private void setLayout() {
		// Adiciona as abas à janela
	
		Abas abas = new Abas();
		JTabbedPane abasLayout = abas.setLayout(Janela.this);
		
		//Adiciona o menu à janela
		
		Menu menu = new Menu(abas);
		
		setJMenuBar(menu.setLayout(Janela.this));
		add(abasLayout);

	}
}
