package br.edu.ifsp.xyz.comissao;

import java.util.ArrayList;

import br.edu.ifsp.xyz.leitor.Leitor;

public class Produto {

	private String codigo;
	private String descricao;
	private double precoBase;
	private int idCategoria;
	private Categoria categoria;

	public Produto() {

	}

	public Produto(String caminho, int indiceCampoChave, String valorChave) throws Exception {
		Leitor leitor = new Leitor(caminho, indiceCampoChave, valorChave);
		ArrayList<String> produtos = leitor.conteudo();
		String produto = produtos.get(0);
		String[] campos = produto.split(";");

		this.codigo = campos[0];
		this.descricao = campos[1];
		this.precoBase = Double.parseDouble(campos[2]);
		this.idCategoria = Integer.parseInt(campos[3]);
		String caminhoCategoria = "./src/Categoria.txt";
		indiceCampoChave = 0;
		this.categoria = new Categoria(caminhoCategoria, indiceCampoChave, campos[3]);
	}

	public Produto(String caminho, int indiceCampoChave, String valorChave, int indice) throws Exception {
		Leitor leitor = new Leitor(caminho, indiceCampoChave, valorChave);
		ArrayList<String> produtos = leitor.conteudo();
		String produto = produtos.get(indice);
		String[] campos = produto.split(";");

		this.codigo = campos[0];
		this.descricao = campos[1];
		this.precoBase = Double.parseDouble(campos[2]);
		this.idCategoria = Integer.parseInt(campos[3]);
	}

	public int getIndiceProdutos(String caminho, int indiceCampoChave, String valorChave) throws Exception {
		Leitor leitor = new Leitor(caminho, indiceCampoChave, valorChave);
		ArrayList<String> produtos = leitor.conteudo();
		return produtos.size();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", precoBase=" + precoBase + '\n' + categoria
				+ "]";
	}

}
