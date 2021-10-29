package br.senai.sp.jadira.model;

public class Calculadora {
	
	private int multiplicando;
	private int multiplicador;
	
	public int getMulltiplicando() {
		return this.multiplicando;	
	}
	
	public void setMultiplicando(String multiplicando) {
		this.multiplicando = Integer.parseInt(multiplicando);
	}
	
	public int getMultiplicador() {
		return this.multiplicador;
	}
	
	public void setMultiplicador(String multiplicador) {
		this.multiplicador = Integer.parseInt(multiplicador);
	}
	
	public String[] calcular() {
		
		String t[] = new String[multiplicador + 1]; //a letra t representa o nome tabuada
	
		for(int i = 0; i <= multiplicador; i++) {
			int produto = (multiplicando * i);
			t[i] = multiplicando + " X " + i + " = " + produto;
		}
		
		return t;
	}
	

}
