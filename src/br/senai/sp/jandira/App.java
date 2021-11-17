package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Fabricante;
import br.senai.sp.jandira.repository.FabricanteRepository;
import br.senai.sp.jandira.ui.FrameMeusJogos;

public class App {

	public static void main(String[] args) {
		
		//FabricanteRepository fabricantes = new FabricanteRepository();
		
		//for (Fabricante fabricanteAtual : fabricantes.listarTodos()) {
		//	System.out.println(fabricanteAtual.getNome());
		//}
		
		FrameMeusJogos frame = new FrameMeusJogos();
		frame.setVisible(true);

	}

}
