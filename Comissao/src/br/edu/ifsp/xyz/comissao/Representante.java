package br.edu.ifsp.xyz.comissao;

import java.util.ArrayList;

import br.edu.ifsp.xyz.leitor.Leitor;

public class Representante {

	private int codigo;
	private String nome;
	private String regiao;
	
	public Representante(String caminho, int indiceCampoChave, String valorChave) throws Exception {
		Leitor leitor = new Leitor(caminho, indiceCampoChave, valorChave);
		ArrayList<String> representantes = leitor.conteudo();
		String representante = representantes.get(0);
		System.out.println(representante);
		String[] campos = representante.split(";");
		
		this.codigo = Integer.parseInt(campos[0]);
		this.regiao = campos[1];
		this.nome = campos[2];
		
	}

	@Override
	public String toString() {
		return "Representante [Código = " + codigo + ", Nome = " + nome + ", Região = " + regiao + "]";
	}
	
	
}
