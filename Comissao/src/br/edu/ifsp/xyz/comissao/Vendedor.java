package br.edu.ifsp.xyz.comissao;

public class Vendedor {

	private int codigo;
	private String nome;
	private ZonaVenda zonaVenda;
	
	public Vendedor(int codigo, String nome, ZonaVenda zonaVenda) {
		this.codigo = codigo;
		this.nome = nome;
		this.zonaVenda = zonaVenda;
	}
	
}
