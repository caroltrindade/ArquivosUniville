package br.univille.login;

import java.awt.Color;
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
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Login extends JFrame{
	
	public Login() {
		setTitle("Login");
		setSize(350, 300);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout();
	}
	
	// Configuração da tela
	private void setLayout() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(208, 216, 227));
		panel.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createEmptyBorder(20, 20, 20, 20),
				BorderFactory.createTitledBorder("Login")));

		JLabel labelUsuario = new JLabel("Usuário:");
		labelUsuario.setBounds(40, 40, 80, 35);
		
		JTextField textUsuario = new JTextField(20);
		textUsuario.setBounds(100, 50, 150, 30);
		
		JLabel labelSenha = new JLabel("Senha:");
		labelSenha.setBounds(40, 80, 80, 35);
		
		JPasswordField textSenha = new JPasswordField(20);
		textSenha.setBounds(100, 90, 150, 30);
		
		JButton button = new JButton("Acessar");
		button.setBounds(100, 140, 150, 30);
		button.setBackground(new Color(71, 82, 95));
		button.setForeground(Color.white);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Usuário logado!");
			}
		});
		
		JCheckBox checkManterAcesso = new JCheckBox("Manter acessado");
		checkManterAcesso.setBounds(105, 180, 200, 20);
		checkManterAcesso.setBackground(new Color(208, 216, 227));
		checkManterAcesso.setSelected(true);
		
		JLabel labelEsqueciSenha = new JLabel("Esqueci minha senha");
		labelEsqueciSenha.setBounds(110, 195, 200, 35);
		labelEsqueciSenha.setForeground(new Color(151, 109, 208));
		
		panel.add(labelUsuario);
		panel.add(textUsuario);
		
		panel.add(labelSenha);
		panel.add(textSenha);
		
		panel.add(button);
		
		panel.add(checkManterAcesso);
		
		panel.add(labelEsqueciSenha);
		
		add(panel);
	}
}
