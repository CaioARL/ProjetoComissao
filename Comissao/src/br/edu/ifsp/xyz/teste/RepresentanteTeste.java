package br.edu.ifsp.xyz.teste;

import br.edu.ifsp.xyz.comissao.Representante;

public class RepresentanteTeste {
	public static void main(String[] args) throws Exception {
		Representante representante= new Representante("./src/Representante.txt", 1, "Sudeste");
		System.out.println("--->" + representante);
	}

}
