package br.edu.ifsp.xyz.comissao;

public class ZonaVenda {
	
	private String uf;
	private String nome;
	private RegiaoVenda regiao;
	private Vendedor vendedor;
	
	public ZonaVenda(String uf, String nome, RegiaoVenda regiao, Vendedor vendedor) {
		this.uf = uf;
		this.nome = nome;
		this.regiao = regiao;
		this.vendedor = vendedor;
	}	

}
