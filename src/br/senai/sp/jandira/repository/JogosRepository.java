package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Jogo;

public class JogosRepository {
	
	private Jogo[] jogos;
	
	public JogosRepository(int quantidadeJogos) {
		jogos = new Jogo[quantidadeJogos];
	}
	
	public void gravar(Jogo jogo, int posicao) {
		jogos[posicao] = jogo;
	}
	
	public Jogo listarJogo(int posicao) {
		return jogos[posicao];
	}
	
	public Jogo[] listarTodos() {
		return jogos;
	}

}
