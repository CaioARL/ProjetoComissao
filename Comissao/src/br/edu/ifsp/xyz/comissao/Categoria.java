package br.edu.ifsp.xyz.comissao;

import java.util.ArrayList;

import br.edu.ifsp.xyz.leitor.Leitor;

public class Categoria {

	private int codigo;
	private String nome;
	private double precoComissaoVendedor;
	private double precoComissaoRepresentante;

	public Categoria() {
		
	}
	
	public Categoria(String caminho, int indiceCampoChave, String valorChave) throws Exception {
		Leitor leitor = new Leitor(caminho, indiceCampoChave, valorChave);
		ArrayList<String> categorias = leitor.conteudo();
		String categoria = categorias.get(0);
		String[] campos = categoria.split(";");

		this.codigo = Integer.parseInt(campos[0]);
		this.nome = campos[1];
		this.precoComissaoVendedor = Double.parseDouble(campos[2]);
		this.precoComissaoRepresentante = Double.parseDouble(campos[3]);

	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrecoComissaoVendedor() {
		return precoComissaoVendedor;
	}
	public void setPrecoComissaoVendedor(double precoComissaoVendedor) {
		this.precoComissaoVendedor = precoComissaoVendedor;
	}
	public double getPrecoComissaoRepresentante() {
		return precoComissaoRepresentante;
	}
	public void setPrecoComissaoRepresentante(double precoComissaoRepresentante) {
		this.precoComissaoRepresentante = precoComissaoRepresentante;
	}

	@Override
	public String toString() {
		return "Categoria [codigo=" + codigo + ", nome=" + nome + ", precoComissaoVendedor=" + precoComissaoVendedor
				+ "%" + ", precoComissaoRepresentante=" + precoComissaoRepresentante + "%" + "]";
	}

}
