package br.senai.sp.jandira.model;

public class jogo {
	private String titulo;
	private Fabricante fabricante;
	private boolean zerado;
	private Console console;
	private double valor;
	private String observa��o;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public boolean isZerado() {
		return zerado;
	}

	public void setZerado(boolean zerado) {
		this.zerado = zerado;
	}

	public Console getConsole() {
		return console;
	}

	public void setConsole(Console console) {
		this.console = console;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getObserva��o() {
		return observa��o;
	}

	public void setObserva��o(String observa��o) {
		this.observa��o = observa��o;
	}

}
