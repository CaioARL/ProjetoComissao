package br.edu.ifsp.xyz.comissao;
import java.util.ArrayList;
import java.util.Arrays;

import br.edu.ifsp.xyz.leitor.Leitor;
import br.edu.ifsp.xyz.util.Data;

public class Pedido {
	private String idPedido;
	private String cpf;
	private Data dataPedido;
	private double valor;
	private ItemPedido[] itensPedidos;
	
	public Pedido() {
		
	}

	public Pedido(String caminho, int chave, String valorChave, int indice) throws Exception {
		Leitor leitor = new Leitor(caminho, chave, valorChave);
		ArrayList<String> pedidos = leitor.conteudo();
		String pedido = pedidos.get(indice);	
			
		String[] campos = pedido.split(";");
		this.idPedido = campos[0];
		this.cpf = campos[1];
        String[] campoData = campos[2].split("/");
        int dia = Integer.parseInt(campoData[0]);
        int mes = Integer.parseInt(campoData[1]);
        int ano = Integer.parseInt(campoData[2]);
        this.dataPedido = new Data(dia,mes,ano);
        this.valor = Double.parseDouble(campos[3]);
        
        this.itensPedidos = null;

        String caminhoItemPedido = "./src/ItemPedido.txt ";
        ItemPedido itemPedido = new ItemPedido();
        int indiceCampoChave = 1;
        indice = itemPedido.getIndice(caminhoItemPedido, indiceCampoChave, idPedido);
        this.itensPedidos = new ItemPedido[indice];
        
        for (int i = 0; i < indice; i++) {
        	itensPedidos[i] = new ItemPedido(caminhoItemPedido, indiceCampoChave, idPedido, i);
		}
	}
	
	public int getIndicePedido(String caminho, int chave, String valorChave) throws Exception {
		Leitor leitor = new Leitor(caminho, chave, valorChave);
		ArrayList<String> pedidos = leitor.conteudo();
		return pedidos.size();
	}

	public String getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(String idPedido) {
		this.idPedido = idPedido;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Data getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Data dataPedido) {
		this.dataPedido = dataPedido;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public ItemPedido[] getItensPedidos() {
		return itensPedidos;
	}
	public void setItensPedidos(ItemPedido[] itensPedidos) {
		this.itensPedidos = itensPedidos;
	}

	@Override
	public String toString() {
		return "Pedidos [idPedido=" + idPedido + ", cpf=" + cpf + ", dataPedido=" + dataPedido + ", valor=" + valor + '\n'
				+ '\n' + Arrays.toString(itensPedidos) + '\n' + "]";
	}

}
