package br.edu.ifsp.xyz.teste;

import br.edu.ifsp.xyz.comissao.RegiaoVenda;

public class RegiaoVendaTeste {
	public static void main(String[] args) throws Exception {
		RegiaoVenda regiao= new RegiaoVenda("./src/RegiaoVenda.txt", 1, "Sul");
		System.out.println("--->" + regiao);
	}

}
