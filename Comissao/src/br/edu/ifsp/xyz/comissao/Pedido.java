package br.edu.ifsp.xyz.comissao;
import br.edu.ifsp.xyz.util.Data;

import java.util.ArrayList;

import br.edu.ifsp.xyz.leitor.Leitor;

public class Pedido {
	private int idPedido;
	private String cpf;
	private Data dataPedido;
	private double valor;

	public Pedido(int idPedido, String cpf, Data dataPedido, double valor) {
		this.idPedido = idPedido;
		this.cpf = cpf;
		this.dataPedido = dataPedido;
		this.valor = valor;
	}

	public Pedido(String caminho, int chave, String valorChave) throws Exception {
		Leitor leitor = new Leitor(caminho, chave, valorChave);
		ArrayList<String> pedidos = leitor.conteudo();
		String pedido = pedidos.get(0);
		String[] campos = pedido.split(";");
        this.idPedido = Integer.parseInt(campos[0]);
        this.cpf = campos[1];
        String[] campoData = campos[2].split("/");
        int dia = Integer.parseInt(campoData[0]);
        int mes = Integer.parseInt(campoData[1]);
        int ano = Integer.parseInt(campoData[2]);
        this.dataPedido = new Data(dia,mes,ano);
        this.valor = Double.parseDouble(campos[3]);
	}

	
	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", cpf=" + cpf + ", dataPedido=" + dataPedido + ", valor="
				+ valor + "]";
	}


}
