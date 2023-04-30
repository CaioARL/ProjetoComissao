package br.edu.ifsp.xyz.comissao;

import java.util.ArrayList;
import java.util.Arrays;

import br.edu.ifsp.xyz.leitor.Leitor;

public class RegiaoVenda {

	private int codigo;
	private String nome;
	private String[] zonas;
	private Representante representante;

	public RegiaoVenda(String caminho, int indiceCampoChave, String valorChave) throws Exception {
		Leitor leitor = new Leitor(caminho, indiceCampoChave, valorChave);
		ArrayList<String> regioes = leitor.conteudo();
		String regiao = regioes.get(0);
		String[] campos = regiao.split(";");

		this.codigo = Integer.parseInt(campos[0]);
		this.nome = campos[1];

		this.zonas = campos[2].split(",");

		String caminhoRepresentante = "./src/Representante.txt";
		indiceCampoChave = 1;
		valorChave = nome;
		this.representante = new Representante(caminhoRepresentante, indiceCampoChave, valorChave);
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
	public String[] getZonas() {
		return zonas;
	}
	public void setZonas(String[] zonas) {
		this.zonas = zonas;
	}
	public Representante getRepresentante() {
		return representante;
	}
	public void setRepresentante(Representante representante) {
		this.representante = representante;
	}

	@Override
	public String toString() {
		return "RegiaoVenda [Código = " + codigo + ", Nome = " + nome + ", Zonas = " + Arrays.toString(zonas) + '\n'
				+ representante + "]";
	}

}
