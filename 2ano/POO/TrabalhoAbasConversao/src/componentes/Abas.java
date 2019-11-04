package componentes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.plaf.metal.MetalTabbedPaneUI.TabbedPaneLayout;

public class Abas{
	private JPanel painelMoeda;
	private JPanel painelTemperatura;
	private JPanel painelComprimento;
	private JTabbedPane tabPane;
	private static List<JTextField> listaCampos = new ArrayList<JTextField>();
	
	public Abas(){	
		
	}
		
	public JTabbedPane setLayout(JFrame frame) {
		this.painelMoeda = criarPanelMoeda();
		this.painelTemperatura = criarPanelTemperatura();
		this.painelComprimento = criarPanelComprimento();
		
		tabPane = new JTabbedPane();
		setVisibleTabs("Moeda", true);
		setVisibleTabs("Temperatura", true);
		setVisibleTabs("Comprimento", true);
		
		// Adiciona o painel na janela
		
		return this.tabPane;
	}
	
	public void setVisibleTabs(String titulo, boolean visible){
		if (titulo == "Moeda" && visible == true){
			this.tabPane.addTab("Moeda", null, this.painelMoeda,"Conversão de moeda");
		}
		else if (titulo == "Temperatura" && visible == true){
			this.tabPane.addTab("Temperatura", null, this.painelTemperatura,"Conversão de temperatura");
		}
		else if (titulo == "Comprimento" && visible == true){
			this.tabPane.addTab("Comprimento", null, this.painelComprimento,"Conversão de comprimento");
		}
		else if (visible == false){
			this.tabPane.removeTabAt(this.tabPane.indexOfTab(titulo));
		}
	}
	
	public void LimparCampos(String titulo, boolean visible){
		if (titulo == "Moeda" && visible == true){
			this.tabPane.addTab("Moeda", null, this.painelMoeda,"Conversão de moeda");
		}
		else if (titulo == "Temperatura" && visible == true){
			this.tabPane.addTab("Temperatura", null, this.painelTemperatura,"Conversão de temperatura");
		}
		else if (titulo == "Comprimento" && visible == true){
			this.tabPane.addTab("Comprimento", null, this.painelComprimento,"Conversão de comprimento");
		}
		else if (visible == false){
			this.tabPane.removeTabAt(this.tabPane.indexOfTab(titulo));
		}
	}
	
    private static JPanel criarPanelMoeda() {
    	String itens [] = {"Real","Dolar","Euro"};
    	
    	JPanel panel = new JPanel();
    	panel.setLayout(null);
    	
    	JLabel labelDe = new JLabel("De");
    	labelDe.setBounds(30, 35, 50, 10);
		
		JComboBox<String> comboBoxDe = new JComboBox<String>(itens);
		comboBoxDe.setSelectedIndex(0);
		comboBoxDe.setBounds(50, 30, 100, 20);
    	
		JTextField campoDe = new JTextField(); 
		campoDe.setBounds(50, 60, 100, 20);
		listaCampos.add(campoDe);
		
		JLabel labelPara = new JLabel("Para");
    	labelPara.setBounds(200, 35, 50, 10);
		
		JComboBox<String> comboBoxPara = new JComboBox<String>(itens);
		comboBoxPara.setSelectedIndex(1);
		comboBoxPara.setBounds(235, 30, 100, 20);
				
		JTextField campoPara = new JTextField(); 
		campoPara.setBounds(235, 60, 100, 20);
		listaCampos.add(campoPara);
		
		JButton botaoConverter = new JButton("Converter"); 
		botaoConverter.setBounds(245, 100, 90, 20);
		botaoConverter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int de = comboBoxDe.getSelectedIndex();
				int para = comboBoxPara.getSelectedIndex();
				double valor = Double.parseDouble(campoDe.getText());
				double convertido = ConverterMoeda(valor, de, para);
				
				campoPara.setText("" + convertido);
			}
		});
		
		panel.add(labelDe);
		panel.add(comboBoxDe);
		panel.add(campoDe);
		panel.add(labelPara);
		panel.add(comboBoxPara);
		panel.add(campoPara);
		panel.add(botaoConverter);
		
    	return panel;
    }
    
    private static JPanel criarPanelTemperatura() {
    	String itens [] = {"Celsius","Kelvin","Fahrenheit"};
    	
    	JPanel panel = new JPanel();
    	panel.setLayout(null);
    	
    	JLabel labelDe = new JLabel("De");
    	labelDe.setBounds(30, 35, 50, 10);
		
		JComboBox<String> comboBoxDe = new JComboBox<String>(itens);
		comboBoxDe.setSelectedIndex(0);
		comboBoxDe.setBounds(50, 30, 100, 20);
    	
		JTextField campoDe = new JTextField(); 
		campoDe.setBounds(50, 60, 100, 20);
		listaCampos.add(campoDe);
		
		JLabel labelPara = new JLabel("Para");
    	labelPara.setBounds(200, 35, 50, 10);
		
		JComboBox<String> comboBoxPara = new JComboBox<String>(itens);
		comboBoxPara.setSelectedIndex(1);
		comboBoxPara.setBounds(235, 30, 100, 20);
				
		JTextField campoPara = new JTextField(); 
		campoPara.setBounds(235, 60, 100, 20);
		listaCampos.add(campoPara);
		
		JButton botaoConverter = new JButton("Converter"); 
		botaoConverter.setBounds(245, 100, 90, 20);
		botaoConverter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int de = comboBoxDe.getSelectedIndex();
				int para = comboBoxPara.getSelectedIndex();
				double valor = Double.parseDouble(campoDe.getText());
				double convertido = ConverterTemperatura(valor, de, para);
				
				campoPara.setText("" + convertido);
			}
		});
		
		panel.add(labelDe);
		panel.add(comboBoxDe);
		panel.add(campoDe);
		panel.add(labelPara);
		panel.add(comboBoxPara);
		panel.add(campoPara);
		panel.add(botaoConverter);
		
    	return panel;
    }
    
    private static JPanel criarPanelComprimento() {
    	String itens [] = {"Metro","Milímetro","Centímetro"};
    	
    	JPanel panel = new JPanel();
    	panel.setLayout(null);
    	
    	JLabel labelDe = new JLabel("De");
    	labelDe.setBounds(30, 35, 50, 10);
		
		JComboBox<String> comboBoxDe = new JComboBox<String>(itens);
		comboBoxDe.setSelectedIndex(0);
		comboBoxDe.setBounds(50, 30, 100, 20);
    	
		JTextField campoDe = new JTextField(); 
		campoDe.setBounds(50, 60, 100, 20);
		listaCampos.add(campoDe);
		
		JLabel labelPara = new JLabel("Para");
    	labelPara.setBounds(200, 35, 50, 10);
		
		JComboBox<String> comboBoxPara = new JComboBox<String>(itens);
		comboBoxPara.setSelectedIndex(1);
		comboBoxPara.setBounds(235, 30, 100, 20);
				
		JTextField campoPara = new JTextField(); 
		campoPara.setBounds(235, 60, 100, 20);
		listaCampos.add(campoPara);
		
		JButton botaoConverter = new JButton("Converter"); 
		botaoConverter.setBounds(245, 100, 90, 20);
		botaoConverter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int de = comboBoxDe.getSelectedIndex();
				int para = comboBoxPara.getSelectedIndex();
				double valor = Double.parseDouble(campoDe.getText());
				double convertido = ConverterComprimento(valor, de, para);
				
				campoPara.setText("" + convertido);
			}
		});
		
		panel.add(labelDe);
		panel.add(comboBoxDe);
		panel.add(campoDe);
		panel.add(labelPara);
		panel.add(comboBoxPara);
		panel.add(campoPara);
		panel.add(botaoConverter);
		
    	return panel;
    }
    
    private static double ConverterMoeda(double valor, int opcaoDe, int opcaoPara){
    	// De Real para Dólar
    	if (opcaoDe == 0 && opcaoPara == 1){
    		return (valor / 3.99);
    	}
    	// De Dólar para Real
    	else if (opcaoDe == 1 && opcaoPara == 0){
    		return (valor * 3.99);
    	}
    	// De Real para Euro
    	else if (opcaoDe == 0 && opcaoPara == 2){
    		return (valor / 4.46);
    	}
    	// De Euro para Real
    	else if (opcaoDe == 2 && opcaoPara == 0){
    		return (valor * 4.46);
    	}
    	// De Dolar para Euro
    	else if (opcaoDe == 1 && opcaoPara == 2){
    		return (valor / 1.12);
    	}
    	// De Euro para Dolar
    	else if (opcaoDe == 2 && opcaoPara == 1){
    		return (valor * 1.12);
    	}
    	// Caso seja do mesmo tipo para o mesmo tipo
    	return valor;
    }
    
    private static double ConverterTemperatura(double valor, int opcaoDe, int opcaoPara){
    	// De Celsius para Kelvin
    	if (opcaoDe == 0 && opcaoPara == 1){
    		return (valor + 273.15);
    	}
    	// De Kelvin para Celsius
    	else if (opcaoDe == 1 && opcaoPara == 0){
    		return (valor - 273.15);
    	}
    	// De Celsius para Fahrenheit
    	else if (opcaoDe == 0 && opcaoPara == 2){
    		return ((valor * 9/5) + 32);
    	}
    	// De Fahrenheit para Celsius
    	else if (opcaoDe == 2 && opcaoPara == 0){
    		return ((valor - 32) * 5/9);
    	}
    	// De Kelvin para Fahrenheit
    	else if (opcaoDe == 1 && opcaoPara == 2){
    		return ((valor - 273.15) * 9/5 + 32);
    	}
    	// De Fahrenheit para Kelvin
    	else if (opcaoDe == 2 && opcaoPara == 1){
    		return ((valor - 32) * 5/9 + 273.15);
    	}
    	// Caso seja do mesmo tipo para o mesmo tipo
    	return valor;
    }
    
    private static double ConverterComprimento(double valor, int opcaoDe, int opcaoPara){
    	// De Metro para Milímetro
    	if (opcaoDe == 0 && opcaoPara == 1){
    		return (valor * 1000);
    	}
    	// De Milímetro para Metro
    	else if (opcaoDe == 1 && opcaoPara == 0){
    		return (valor / 1000);
    	}
    	// De Metro para Centímetro
    	else if (opcaoDe == 0 && opcaoPara == 2){
    		return (valor * 100);
    	}
    	// De Centímetro para Metro
    	else if (opcaoDe == 2 && opcaoPara == 0){
    		return (valor / 100);
    	}
    	// De Milímetro para Centímetro
    	else if (opcaoDe == 1 && opcaoPara == 2){
    		return (valor / 10);
    	}
    	// De Centímetro para Milímetro
    	else if (opcaoDe == 2 && opcaoPara == 1){
    		return (valor * 10);
    	}
    	// Caso seja do mesmo tipo para o mesmo tipo
    	return valor;
    }
    
    public void clearTextFields() {
		for (JTextField campo: listaCampos) {
			campo.setText("");
		}
	}
}
