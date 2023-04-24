package br.edu.ifsp.xyz.teste;

import br.edu.ifsp.xyz.comissao.Pedido;

public class PedidoTeste {
	public static void main(String[] args) throws Exception {
		Pedido pedido = new Pedido("./src/Pedido.txt", 0, "TKL2", 0);
		System.out.println("--->" + pedido);

	}

}
