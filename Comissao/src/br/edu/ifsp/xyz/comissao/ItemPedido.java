package br.edu.ifsp.xyz.comissao;

public class ItemPedido {

	
	private Produto produto;
	private int qtProduto;
	private double preco;
	
	public ItemPedido(Produto produto, int qtProduto, double preco) {
		this.produto = produto;
		this.qtProduto = qtProduto;
		this.preco = preco;
	}
	
}
