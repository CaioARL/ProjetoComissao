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
		System.out.println(vendedor);
		String[] campos = vendedor.split(";");
		this.codigo = Integer.parseInt(campos[0]);
		this.nome = campos[1];
		String zona = campos[2];
		
		String caminhoZonaVenda = "./src/zonaVenda.txt";
		indiceCampoChave = 1;
		this.zonaVenda = new ZonaVenda(caminhoZonaVenda, indiceCampoChave, zona); 
		
		}

	@Override
	public String toString() {
		return "Vendedor [codigo=" + codigo + ", nome=" + nome + ", zonaVenda=" + zonaVenda + "]";
	}
	
		
	}
