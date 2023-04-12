package br.edu.ifsp.xyz.teste;

import br.edu.ifsp.xyz.comissao.ZonaVenda;

public class ZonaVendaTeste {
	public static void main(String[] args) throws Exception {
		ZonaVenda zonaVenda = new ZonaVenda("./src/ZonaVenda.txt", 1, "SP");
		System.out.println("--->" + zonaVenda);
	}

}
