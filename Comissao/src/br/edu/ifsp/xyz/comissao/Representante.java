package br.edu.ifsp.xyz.comissao;

public class Representante {

	private int codigo;
	private String nome;
	private RegiaoVenda regiao;
	
	public Representante(int codigo, String nome, RegiaoVenda regiao) {
		this.codigo = codigo;
		this.nome = nome;
		this.regiao = regiao;
	}
	
}
