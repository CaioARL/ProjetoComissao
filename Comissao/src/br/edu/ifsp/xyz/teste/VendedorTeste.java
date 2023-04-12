package br.edu.ifsp.xyz.teste;

import br.edu.ifsp.xyz.comissao.Vendedor;

public class VendedorTeste {
	public static void main(String[] args) throws Exception {
		Vendedor vendedor = new Vendedor("./src/Vendedor.txt", 0, "222");
		System.out.println("--->" + vendedor);
	}

}
