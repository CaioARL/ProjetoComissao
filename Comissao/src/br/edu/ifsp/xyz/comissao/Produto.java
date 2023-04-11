package br.edu.ifsp.xyz.comissao;

public class Produto {

	private int codigo;
	private String descricao;
	private double precoBase;
	private Categoria categoria;
	
	public Produto(int codigo, String descricao, double precoBase, Categoria categoria) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.precoBase = precoBase;
		this.categoria = categoria;
	}
	
}
