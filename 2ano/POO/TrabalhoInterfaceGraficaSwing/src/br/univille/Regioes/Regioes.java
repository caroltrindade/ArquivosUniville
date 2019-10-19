package br.univille.Regioes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Regioes extends JFrame{

	public Regioes() {
		setTitle("Regiões");
		setSize(400, 300);
		setBackground(Color.white);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout();
	}
	
	// Configuração da tela
	private void setLayout() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		//panel.setLayout(new BorderLayout(10,10));
		//panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		// Painel de paineis
		
		JPanel panelPaineis = new JPanel();
		panelPaineis.setLayout(null);
		panelPaineis.setBackground(Color.white);
		panelPaineis.setBounds(180, 0, 215, 300);
		panelPaineis.setVisible(true);
		
		JPanel panelNorte = new JPanel();
		panelNorte.setLayout(null);
		panelNorte.setBackground(new Color(0, 166, 255));
		panelNorte.setBounds(35, 10, 150, 40);
		panelNorte.setVisible(true);
		
		JLabel labelNorte = new JLabel("Norte");
		labelNorte.setBounds(60, 3, 50, 40);
		labelNorte.setForeground(Color.black);
		
		panelNorte.add(labelNorte);
		
		JPanel panelSul = new JPanel();
		panelSul.setLayout(null);
		panelSul.setBackground(new Color(249, 95, 98));
		panelSul.setBounds(35, 150, 150, 40);
		panelSul.setVisible(true);
		
		JLabel labelSul = new JLabel("Sul");
		labelSul.setBounds(65, 3, 50, 35);
		labelSul.setForeground(Color.black);
		
		panelSul.add(labelSul);
		
		JPanel panelCentro = new JPanel();
		panelCentro.setLayout(null);
		panelCentro.setBackground(Color.white);
		panelCentro.setBounds(85, 50, 50, 100);
		panelCentro.setVisible(true);
		
		JLabel labelCentro = new JLabel("Centro");
		labelCentro.setBounds(5, 35, 50, 35);
		labelCentro.setForeground(Color.black);
		
		panelCentro.add(labelCentro);
		
		JPanel panelLeste = new JPanel();
		panelLeste.setLayout(null);
		panelLeste.setBackground(new Color(184, 151, 126));
		panelLeste.setBounds(35, 50, 50, 100);
		panelLeste.setVisible(true);
		
		JLabel labelLeste = new JLabel("Leste");
		labelLeste.setBounds(10, 35, 50, 35);
		labelLeste.setForeground(Color.black);
		
		panelLeste.add(labelLeste);
		
		JPanel panelOeste = new JPanel();
		panelOeste.setLayout(null);
		panelOeste.setBackground(new Color(255, 144, 82));
		panelOeste.setBounds(135, 50, 50, 100);
		panelOeste.setVisible(true);
		
		JLabel labelOeste = new JLabel("Oeste");
		labelOeste.setBounds(10, 35, 50, 35);
		labelOeste.setForeground(Color.black);
		
		panelOeste.add(labelOeste);
		
		panelPaineis.add(panelNorte);
		panelPaineis.add(panelSul);
		panelPaineis.add(panelCentro);
		panelPaineis.add(panelLeste);
		panelPaineis.add(panelOeste);
		
		// Painel de checks
		
		JPanel panelCheckBox = new JPanel();
		panelCheckBox.setLayout(null);
		panelCheckBox.setBackground(Color.white);
		panelCheckBox.setBounds(0, 0, 180, 300);
		panelCheckBox.setVisible(true);
		
		JCheckBox checkNorte = new JCheckBox("Norte");
		checkNorte.setBounds(20, 30, 100, 20);
		checkNorte.setBackground(Color.white);
		checkNorte.setSelected(true);
		checkNorte.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (checkNorte.isSelected()){
					panelNorte.setVisible(true);
				}else{
					panelNorte.setVisible(false);
				}
			}
		});
		
		JCheckBox checkSul = new JCheckBox("Sul");
		checkSul.setBounds(20, 50, 100, 20);
		checkSul.setBackground(Color.white);
		checkSul.setSelected(true);
		checkSul.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (checkSul.isSelected()){
					panelSul.setVisible(true);
				}else{
					panelSul.setVisible(false);
				}
				
			}
		});
		
		JCheckBox checkCentro = new JCheckBox("Centro");
		checkCentro.setBounds(20, 70, 100, 20);
		checkCentro.setBackground(Color.white);
		checkCentro.setSelected(true);
		checkCentro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (checkCentro.isSelected()){
					panelCentro.setVisible(true);
				}else{
					panelCentro.setVisible(false);
				}
				
			}
		});
		
		JCheckBox checkLeste = new JCheckBox("Leste");
		checkLeste.setBounds(20, 90, 100, 20);
		checkLeste.setBackground(Color.white);
		checkLeste.setSelected(true);
		checkLeste.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (checkLeste.isSelected()){
					panelLeste.setVisible(true);
				}else{
					panelLeste.setVisible(false);
				}
				
			}
		});
		
		JCheckBox checkOeste = new JCheckBox("Oeste");
		checkOeste.setBounds(20, 110, 100, 20);
		checkOeste.setBackground(Color.white);
		checkOeste.setSelected(true);
		checkOeste.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (checkOeste.isSelected()){
					panelOeste.setVisible(true);
				}else{
					panelOeste.setVisible(false);
				}
				
			}
		});
		
		panelCheckBox.add(checkNorte);
		panelCheckBox.add(checkSul);
		panelCheckBox.add(checkCentro);
		panelCheckBox.add(checkLeste);
		panelCheckBox.add(checkOeste);
		
		// Adiciona o painel na janela
		
		panel.add(panelCheckBox);
		panel.add(panelPaineis);
		
		add(panel);
	}
}