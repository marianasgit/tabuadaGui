package br.senai.sp.jadira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import br.senai.sp.jadira.model.Calculadora;

public class Tela {
	public void criarTela() {
		
		Calculadora calculadora = new Calculadora();
		
		Font titulo = new Font("Arial", Font.BOLD, 20);
		Font botao = new Font("Arial", Font.BOLD, 20);
		Font label = new Font("Arial", Font.PLAIN, 15);
		
		JFrame telaTabuada = new JFrame();
		telaTabuada.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaTabuada.setTitle("Tabuada");
		telaTabuada.setSize(600, 600);
		telaTabuada.setLayout(null);
		
		//Criando panel
		JPanel header = new JPanel();
		header.setSize(300, 150);
		header.setBounds(0, 0, 600, 50);
		header.setBackground(Color.WHITE);
		header.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Tabuada");
		lblTitulo.setBounds(10, 10, 300, 40);
		lblTitulo.setFont(titulo);
		lblTitulo.setForeground(Color.BLUE);
		header.add(lblTitulo);
		
		
		//ImageIcon img = new ImageIcon("/tabuadaGui/src/br/senai/sp/jadira/images/calculadora.png");
		
		JLabel lblImagem = new JLabel();
		lblImagem.setIcon(new ImageIcon("/tabuadaGui/src/br/senai/sp/jadira/images/calculadora.png"));
		lblImagem.setBounds(400, 20, 100, 10);
		header.add(lblImagem);
		
		JPanel panelFormulario = new JPanel();
		panelFormulario.setBounds(20, 30, 310, 300);
		panelFormulario.setLayout(null);
		
		JLabel lblMultiplicando = new JLabel("Multiplicando:");
		lblMultiplicando.setBounds(45, 70, 120, 30);
		lblMultiplicando.setFont(label);
		lblMultiplicando.setHorizontalAlignment(SwingConstants.RIGHT);
		panelFormulario.add(lblMultiplicando);
		
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(165, 70, 100, 30);
		panelFormulario.add(txtMultiplicando);
		
		JLabel lblMultiplicador = new JLabel("Máximo Multiplicador:");
		lblMultiplicador.setBounds(27, 120, 150, 30);
		lblMultiplicador.setFont(label);
		panelFormulario.add(lblMultiplicador);
		
		JTextField txtMultiplicador = new JTextField();
		txtMultiplicador.setBounds(165, 120, 100, 30);
		panelFormulario.add(txtMultiplicador);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(20, 180, 245, 40);
		btnCalcular.setFont(botao);
		btnCalcular.setForeground(Color.WHITE);
		btnCalcular.setBackground(Color.GREEN);
		panelFormulario.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(20, 240, 245, 40);
		btnLimpar.setFont(botao);
		btnLimpar.setForeground(Color.WHITE);
		btnLimpar.setBackground(Color.RED);
		panelFormulario.add(btnLimpar);
		
		JLabel lblResultado = new JLabel();
		lblResultado.setBounds(50, 10, 100, 30);
		panelFormulario.add(lblResultado);
		
		
		//Criando JList
		
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(350, 130, 200, 300);
		
		JList listTabuada = new JList();
		scroll.getViewport().add(listTabuada);
		
		DefaultListModel tabuadaModel = new DefaultListModel();
		listTabuada.setModel(tabuadaModel);
		
		telaTabuada.getContentPane().add(header);
		telaTabuada.getContentPane().add(panelFormulario);
		telaTabuada.getContentPane().add(scroll);
		telaTabuada.getContentPane().add(lblResultado);
		
		telaTabuada.setVisible(true);
		
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				calculadora.setMultiplicando(txtMultiplicando.getText());
				calculadora.setMultiplicador(txtMultiplicador.getText());
				
				String[] resultadoTabuada = calculadora.calcular();
				
				for (int i = 0; i < resultadoTabuada.length; i++) {
					tabuadaModel.addElement(resultadoTabuada[i]);
				}
			}
		});
		
		
		btnLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				txtMultiplicando.setText("");
				txtMultiplicador.setText("");
				txtMultiplicando.requestFocus();
				
				tabuadaModel.clear();
				
			}
		});
	}
}
