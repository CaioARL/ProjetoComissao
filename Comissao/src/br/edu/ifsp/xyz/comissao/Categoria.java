package br.edu.ifsp.xyz.comissao;

public class Categoria {

	private int codigo;
	private String nome;
	private Produto[] produtos;
	private double precoComissao;
	
	public Categoria(int codigo, String nome, Produto[] produtos, double precoComissao) {
		this.codigo = codigo;
		this.nome = nome;
		this.produtos = produtos;
		this.precoComissao = precoComissao;
	}
	
}
