package br.senai.sp.jandira.model;

public class Jogo {
	private String titulo;
	private Fabricante fabricante;
	private boolean jogoZerado;
	private Console console;
	private double valor;
	private String observacao;

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

	public boolean isJogoZerado() {
		return jogoZerado;
	}

	public void setJogoZerado(boolean zerado) {
		this.jogoZerado = zerado;
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

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
