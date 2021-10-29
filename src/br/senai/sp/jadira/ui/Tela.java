package br.senai.sp.jadira.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.senai.sp.jadira.model.Calculadora;

public class Tela {
	public void criarTela() {
		
		Calculadora calculadora = new Calculadora();
		
		JFrame telaTabuada = new JFrame();
		telaTabuada.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaTabuada.setTitle("Tabuada");
		telaTabuada.setSize(600, 600);
		telaTabuada.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Tabuada");
		lblTitulo.setBounds(20, 20, 200, 40);
		
		JLabel lblMultiplicando = new JLabel("Multiplicando:");
		lblMultiplicando.setBounds(70, 70, 120, 30);
		
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(150, 70, 100, 30);
		
		JLabel lblMaximoMultiplicador = new JLabel("Máximo Multiplicador:");
		lblMaximoMultiplicador.setBounds(24, 120, 150, 30);
		
		JTextField txtMultiplicador = new JTextField();
		txtMultiplicador.setBounds(150, 120, 100, 30);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(20, 180, 230, 40);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(20, 240, 230, 40);
		
		//String estados[] = new String[];
		
		DefaultListModel tabuada = new DefaultListModel();
		
		for (int i = 0; i < t.lenght; i++) {
		tabuada.addElement(t);
		}
		
		JScrollPane scroll = new JScrollPane();
		
		JList lstTabuada = new JList();
		lstTabuada.setModel(tabuada);
		lstTabuada.setBounds(350, 60, 200, 300);
		scroll.add(lstTabuada);
		
		
		telaTabuada.getContentPane().add(lblTitulo);
		telaTabuada.getContentPane().add(lblMultiplicando);
		telaTabuada.getContentPane().add(txtMultiplicando);
		telaTabuada.getContentPane().add(lblMaximoMultiplicador);
		telaTabuada.getContentPane().add(txtMultiplicador);
		telaTabuada.getContentPane().add(btnCalcular);
		telaTabuada.getContentPane().add(btnLimpar);
		telaTabuada.getContentPane().add(scroll);
		
		telaTabuada.setVisible(true);
		
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				calculadora.setMultiplicando(txtMultiplicando.getText());
				
				calculadora.setMultiplicador(txtMultiplicador.getText());
			}
		});
		
	}
}
