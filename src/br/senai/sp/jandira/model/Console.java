package br.senai.sp.jandira.model;

public enum Console {
	
	PLAYSTATION4("PlayStation 4", 3000),
	NINTENDOWII("Nintendo Wii", 1900),
	NINTENDOSWITCH("Nintendo Swich", 2000),
	XBOXONE("Xbox One", 2100),
	NINTENDO3DS("Nintendo 3DS", 800);
	
	
	private String tipoDeConsole;
	private int valorConsole;
	
	private Console(String tipoDeConsole, int valorConsole) {
		this.tipoDeConsole = tipoDeConsole;
		this.valorConsole = valorConsole;
	}
	
	public String getTipoDeConsole() {
		return tipoDeConsole;
	}
	
	public int getValorConsole() {
		return valorConsole;
	}

}