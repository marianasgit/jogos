package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Fabricante;

public class FabricanteRepository {
	
	private Fabricante[] fabricantes;
	
	public FabricanteRepository() {
		fabricantes = new Fabricante[5];
		
		fabricantes[0] = new Fabricante();
		fabricantes[1] = new Fabricante();
		fabricantes[2] = new Fabricante();
		fabricantes[3] = new Fabricante();
		fabricantes[4] = new Fabricante();
		
		fabricantes[0].setNome("Nintendo");
		fabricantes[0].setLocalização("Japão");
		fabricantes[0].setSite("https://www.nintendo.com/pt_BR/");
		
		fabricantes[1].setNome("Eletronic Arts");
		fabricantes[1].setLocalização("Estados Unidos");
		fabricantes[1].setSite("https://www.ea.com/pt-br");
		
		fabricantes[2].setNome("Capcom");
		fabricantes[2].setLocalização("Japão");
		fabricantes[2].setSite("https://www.capcom.com/");
		
		fabricantes[3].setNome("Konami");
		fabricantes[3].setLocalização("Japão");
		fabricantes[3].setSite("https://www.konami.com/games/br/pt/");
		
		fabricantes[4].setNome("Ubisoft");
		fabricantes[4].setLocalização("França");
		fabricantes[4].setSite("https://store.ubi.com/ofertas/home?lang=pt_BR");
		
	}
	
	public Fabricante[] getFabricantes() {
		return fabricantes;
	}

	public Fabricante[] listarTodos() {
		return fabricantes;
	}
	
	public Fabricante listarFabricante(int posicao) {
		return fabricantes[posicao];
	}
	

}
