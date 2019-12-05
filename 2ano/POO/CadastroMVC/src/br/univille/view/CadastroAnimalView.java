package br.univille.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.univille.controller.CadastroAnimalController;
import br.univille.model.AnimalModel;
import br.univille.util.Observer;
import br.univille.util.Subject;

public class CadastroAnimalView extends JFrame implements Observer{
	private AnimalModel model;
	private CadastroAnimalController control;
	
	private JTextField codigoTextField;
	private JTextField nomeTextField;
	private JTextField racaTextField;
	private JTextField corPeloTextField;
	private JButton salvarButton;
	private JButton cancelarButton;
	private JButton novoButton;
	private JButton deletarButton;
	private JLabel statusLabel;
	
	public CadastroAnimalView() {
		setSize(400,280);
		setTitle("Cadastro de Pessoa");
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildLayout();
	}
	
	public void setModel(AnimalModel model) {
		this.model = model;
	}
	
	public void setControl(CadastroAnimalController control) {
		this.control = control;
	}

	private void buildLayout() {
		JPanel root = new JPanel();
		root.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createEmptyBorder(20, 20, 0, 20),
				BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Detalhes do Animal"),
				BorderFactory.createEmptyBorder(10, 10, 10, 10))));
		
		// Botões
		
		salvarButton = new JButton("Salvar");
		salvarButton.setToolTipText("Salvar as alteraçoes");
		salvarButton.addActionListener(e -> salvar());
		
		cancelarButton = new JButton("Cancelar");
		
		novoButton = new JButton("Novo");
		novoButton.setToolTipText("Criar animal");
		novoButton.addActionListener(e -> novo());
				
		deletarButton = new JButton("Deletar");
		deletarButton.setToolTipText("Excluir animal");
		deletarButton.setEnabled(true);
		deletarButton.addActionListener(e -> deletar());
		
		// Campos
		
		JLabel l = new JLabel("Código",JLabel.RIGHT);
		l.setPreferredSize(new Dimension(65,16));
		
		codigoTextField = new JTextField(20);
		codigoTextField.setEnabled(false);
		
		panel.add(l);
		panel.add(codigoTextField);
		
		l = new JLabel("Nome",JLabel.RIGHT);
		l.setPreferredSize(new Dimension(65,16));
		
		nomeTextField = new JTextField(20);
		
		panel.add(l);
		panel.add(nomeTextField);
		
		l = new JLabel("Raça",JLabel.RIGHT);
		l.setPreferredSize(new Dimension(65,16));
		
		racaTextField = new JTextField(20);
		
		panel.add(l);
		panel.add(racaTextField);
		
		l = new JLabel("Cor do Pêlo",JLabel.RIGHT);
		l.setPreferredSize(new Dimension(65,16));
		
		corPeloTextField = new JTextField(20);
		
		panel.add(l);
		panel.add(corPeloTextField);
		
		l = new JLabel("");
		l.setPreferredSize(new Dimension(65,16));
		
		panel.add(l);
		
		panel.add(novoButton);
		panel.add(salvarButton);
		panel.add(deletarButton);
		
		JPanel statusPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		statusPanel.setBorder(BorderFactory.createEmptyBorder(0, 15, 0, 10));
		statusLabel = new JLabel("Cadastre um animal");
		statusPanel.add(statusLabel);
		
		root.add(statusPanel,BorderLayout.SOUTH);
		root.add(panel,BorderLayout.CENTER);
		
		add(root);
	}
	
	private void exibirDados() {
		codigoTextField.setText(Long.toString(model.getId()));
		nomeTextField.setText(model.getNome());
		racaTextField.setText(model.getRaca());
		corPeloTextField.setText(model.getCorPelo());
	}
	
	
	private void salvar() {
		control.salvar();
	}
	
	private void deletar() {
		control.deletar();
	}
	
	private void novo() {
		control.novo();
	}

	public JButton getBotaoDeletar() {
		return deletarButton;
	}

	public void setMensagemStatusBar(String text) {
		statusLabel.setText(text);
	}

	@Override
	public void update(Subject s, Object o) {
		model = (AnimalModel) o;
		exibirDados();
	}
	
	public String getNome() {
		return nomeTextField.getText();
	}
	
	public String getRaca() {
		return racaTextField.getText();
	}
	
	public String getCorPelo() {
		return corPeloTextField.getText();
	}
}
