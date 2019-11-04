package componentes;

import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTabbedPane;

import janela.Janela;

public class Menu {
	private Abas abas;
	
	public Menu() {
		
	}
	
	public Menu(Abas abas) {
		this.abas = abas; 
	}
	
	public JMenuBar setLayout(JFrame frame) {
		// Cria o menu
		
		JMenuBar menu = new JMenuBar();
		
		// Menu: Arquivo
		
		JMenu menuArquivo = new JMenu("Arquivo");
		menuArquivo.setMnemonic(KeyEvent.VK_A);
		
		// Opção: sair
		JMenuItem sair = new JMenuItem("Sair",KeyEvent.VK_I);
		sair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
			}
		});
		
		// Adiciona os itens no menu
		menuArquivo.add(sair);
		
		// Menu: Editar
		
		JMenu menuEditar = new JMenu("Editar");
		
		JMenuItem limparCampos = new JMenuItem("Limpar Campos");
		limparCampos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				abas.clearTextFields();
			}
		});
		
		// Opção: Exibir Moedas
		JCheckBoxMenuItem exibirMoedas = new JCheckBoxMenuItem("Exibir Moedas");
		exibirMoedas.setSelected(true);
		exibirMoedas.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (exibirMoedas.isSelected()){
					abas.setVisibleTabs("Moeda", true);
				}
				else{
					abas.setVisibleTabs("Moeda", false);
				}
			}
		});
		
		// Opção: Exibir Temperaturas
		JCheckBoxMenuItem exibirTemperaturas = new JCheckBoxMenuItem("Exibir Temperaturas");
		exibirTemperaturas.setSelected(true);
		exibirTemperaturas.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (exibirTemperaturas.isSelected()){
					abas.setVisibleTabs("Temperatura", true);
				}
				else{
					abas.setVisibleTabs("Temperatura", false);
				}
			}
		});
		
		// Opção: Exibir Comprimentos
		JCheckBoxMenuItem exibirComprimentos = new JCheckBoxMenuItem("Exibir Comprimentos");
		exibirComprimentos.setSelected(true);
		exibirComprimentos.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (exibirComprimentos.isSelected()){
					abas.setVisibleTabs("Comprimento", true);
				}
				else{
					abas.setVisibleTabs("Comprimento", false);
				}
			}
		});
		
		// Adiciona os itens no menu
		menuEditar.add(limparCampos);
		menuEditar.addSeparator();
		menuEditar.add(exibirMoedas);
		menuEditar.add(exibirTemperaturas);
		menuEditar.add(exibirComprimentos);
		
		// Menu: Ajuda
		
		JMenu menuAjuda = new JMenu("Ajuda");
		JMenuItem desenvolvedores = new JMenuItem("Desenvolvedores",KeyEvent.VK_S);
		JMenuItem repositorioGit = new JMenuItem("Repositório do Git Hub",KeyEvent.VK_S);
		JMenuItem sobre = new JMenuItem("Sobre",KeyEvent.VK_S);
		
		// Adiciona os itens no menu
		menuAjuda.add(desenvolvedores);
		menuAjuda.add(repositorioGit);
		menuAjuda.add(sobre);
	
		// Adicina os menus na barra de menu
		
		menu.add(menuArquivo);
		menu.add(menuEditar);
		menu.add(menuAjuda);
		
		return menu;
	}
	
}
