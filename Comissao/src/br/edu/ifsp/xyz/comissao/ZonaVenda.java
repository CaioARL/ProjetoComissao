package br.edu.ifsp.xyz.comissao;

import java.util.ArrayList;

import br.edu.ifsp.xyz.leitor.Leitor;

public class ZonaVenda {

	private String uf;
	private String nome;
	private RegiaoVenda regiao;

	public ZonaVenda(String caminho, int indiceCampoChave, String valorChave) throws Exception {
		Leitor leitor = new Leitor(caminho, indiceCampoChave, valorChave);
		ArrayList<String> zonas = leitor.conteudo();
		String zona = zonas.get(0);
		String[] campos = zona.split(";");

		this.uf = campos[1];
		this.nome = campos[2];

		String caminhoRegiaoVenda = "./src/regiaoVenda.txt";
		indiceCampoChave = 1;
		if (uf.equals("SP") || uf.equals("RJ") || uf.equals("MG") || uf.equals("ES")) {
			valorChave = "Sudeste";
		} else {
			valorChave = "Sul";
		}
		this.regiao = new RegiaoVenda(caminhoRegiaoVenda, indiceCampoChave, valorChave);

	}

	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public RegiaoVenda getRegiao() {
		return regiao;
	}
	public void setRegiao(RegiaoVenda regiao) {
		this.regiao = regiao;
	}

	@Override
	public String toString() {
		return "ZonaVenda [UF = " + uf + ", Nome = " + nome + '\n' + regiao + "]";
	}

}
