package br.edu.ifsp.xyz.comissao;

import java.util.ArrayList;

import br.edu.ifsp.xyz.leitor.Leitor;

public class Vendedor {

	private int codigo;
	private String nome;
	private ZonaVenda zonaVenda;

	public Vendedor(String caminho, int indiceCampoChave, String valorChave) throws Exception {
		Leitor leitor = new Leitor(caminho, indiceCampoChave, valorChave);
		ArrayList<String> vendedores = leitor.conteudo();
		String vendedor = vendedores.get(0);
		String[] campos = vendedor.split(";");
		this.codigo = Integer.parseInt(campos[0]);
		this.nome = campos[1];
		String zona = campos[2];

		String caminhoZonaVenda = "./src/zonaVenda.txt";
		indiceCampoChave = 1;
		this.zonaVenda = new ZonaVenda(caminhoZonaVenda, indiceCampoChave, zona);

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
	public ZonaVenda getZonaVenda() {
		return zonaVenda;
	}
	public void setZonaVenda(ZonaVenda zonaVenda) {
		this.zonaVenda = zonaVenda;
	}

	@Override
	public String toString() {
		return "Vendedor [Código = " + codigo + ", Nome = " + nome + '\n' + zonaVenda + "]";
	}

}
