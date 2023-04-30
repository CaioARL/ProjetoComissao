package br.edu.ifsp.xyz.comissao;

import java.util.ArrayList;
import java.util.Arrays;

import br.edu.ifsp.xyz.leitor.Leitor;

public class ItemPedido {

	private int id;
	private int qtProduto;
	private String[] idProduto;
	private Produto[] produto;

	public ItemPedido() {

	}

	public ItemPedido(String caminho, int indiceCampoChave, String valorChave, int indice) throws Exception {
		Leitor leitor = new Leitor(caminho, indiceCampoChave, valorChave);
		ArrayList<String> pedidos = leitor.conteudo();
		String pedido = pedidos.get(indice);
		String[] campos = pedido.split(";");

		this.id = Integer.parseInt(campos[0]);
		this.qtProduto = Integer.parseInt(campos[2]);
		this.idProduto = campos[3].split(",");

		String caminhoPoduto = "./src/Produto.txt";
		indiceCampoChave = 0;

		this.produto = new Produto[idProduto.length];
		for (int i = 0; i < idProduto.length; i++) {
			valorChave = this.idProduto[i];
			this.produto[i] = new Produto(caminhoPoduto, indiceCampoChave, valorChave);
		}

	}

	public int getIndice(String caminho, int indiceCampoChave, String valorChave) throws Exception {
		Leitor leitor = new Leitor(caminho, indiceCampoChave, valorChave);
		ArrayList<String> pedidos = leitor.conteudo();
		return pedidos.size();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQtProduto() {
		return qtProduto;
	}
	public void setQtProduto(int qtProduto) {
		this.qtProduto = qtProduto;
	}
	public String[] getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(String[] idProduto) {
		this.idProduto = idProduto;
	}
	public Produto[] getProduto() {
		return produto;
	}
	public void setProduto(Produto[] produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "ItemPedido [id=" + id + ", qtProduto=" + qtProduto + ", idProduto=" + Arrays.toString(idProduto) + '\n'
				+ Arrays.toString(produto) + "]";
	}

}
