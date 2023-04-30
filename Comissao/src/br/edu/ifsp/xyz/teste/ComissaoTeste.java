package br.edu.ifsp.xyz.teste;

import java.util.Arrays;

import br.edu.ifsp.xyz.comissao.Categoria;
import br.edu.ifsp.xyz.comissao.Cliente;
import br.edu.ifsp.xyz.comissao.ItemPedido;
import br.edu.ifsp.xyz.comissao.Pedido;
import br.edu.ifsp.xyz.comissao.Produto;
import br.edu.ifsp.xyz.comissao.RegiaoVenda;
import br.edu.ifsp.xyz.comissao.Representante;
import br.edu.ifsp.xyz.comissao.Vendedor;
import br.edu.ifsp.xyz.comissao.ZonaVenda;

public class ComissaoTeste {
	public static void main(String[] args) throws Exception {
		Cliente cliente = new Cliente("./src/Cliente.txt", 0, "929.286.900-00");
		Pedido[] pedidos = cliente.getPedidos();
		Categoria categoria = new Categoria();
		Vendedor vendedor = cliente.getVendedor();
		ZonaVenda zona = vendedor.getZonaVenda();
		RegiaoVenda regiao = zona.getRegiao();
		Representante representante = regiao.getRepresentante();
		double comissaoVendedor = 0d;
		double comissaoRepresentante = 0d;

		System.out.println("-->Cliente");
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("CPF:" + cliente.getCpf());

		int i = 0;
		for (Pedido pedido : pedidos) {
			i++;
			System.out.printf("\n-->%dº Pedido\n", i);
			System.out.println("Id: " + pedido.getIdPedido());
			System.out.println("Data: " + pedido.getDataPedido());
			System.out.printf("Valor: " + "R$%.2f\n", pedido.getValor());
			ItemPedido[] itens = pedido.getItensPedidos();
			System.out.println("-->Item Pedido");
			for (ItemPedido item : itens) {
				System.out.println("Id: " + item.getId());
				System.out.println("Quantidade de produtos: " + item.getQtProduto());
				Produto[] produtos = item.getProduto();
				for (Produto produto : produtos) {
					categoria = produto.getCategoria();
					double valorProduto = produto.getPrecoBase();
					System.out.printf("Código: " + produto.getCodigo() + "\tNome/Descrição: " + produto.getDescricao()
							+ "\tPreço: R$%.2f" + "\tCategoria: " + categoria.getNome() + "\n", valorProduto);
					comissaoVendedor += (valorProduto * categoria.getPrecoComissaoVendedor()) / 100;
					comissaoRepresentante += (valorProduto * categoria.getPrecoComissaoRepresentante()) / 100;
				}
			}
		}

		System.out.println("\n-->Vendedor");
		System.out.println("Nome: " + vendedor.getNome());
		System.out.println("Código: " + vendedor.getCodigo());
		System.out.println("Percentual Comissão: " + categoria.getPrecoComissaoVendedor() + "%");
		System.out.println("-->Zona de Venda");
		System.out.println("Nome: " + zona.getNome());
		System.out.println("UF: " + zona.getUf());
		System.out.println("-->Região");
		System.out.println("Código: " + regiao.getCodigo());
		System.out.println("Nome: " + regiao.getNome());
		System.out.println("Zonas: " + Arrays.toString(regiao.getZonas()));
		System.out.println("-->Representante");
		System.out.println("Código: " + representante.getCodigo());
		System.out.println("Nome: " + representante.getNome());
		System.out.println("Percentual Comissão: " + categoria.getPrecoComissaoRepresentante() + "%");
		System.out.println("\n-->Valor final comissão");
		System.out.printf("Vendedor: " + "R$%.2f\n", comissaoVendedor);
		System.out.printf("Representante: " + "R$%.2f\n", comissaoRepresentante);

	}
}
