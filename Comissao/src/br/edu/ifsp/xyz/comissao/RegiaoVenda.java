package br.edu.ifsp.xyz.comissao;

public class RegiaoVenda {

	private int codigo;
	private String nome;
	private ZonaVenda[] zonas;
	private Representante representante;
	
	public RegiaoVenda(int codigo, String nome, ZonaVenda[] zonas, Representante representante) {
		this.codigo = codigo;
		this.nome = nome;
		this.zonas = zonas;
		this.representante = representante;
	}	
	
}
