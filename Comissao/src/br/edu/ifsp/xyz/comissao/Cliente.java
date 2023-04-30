package br.edu.ifsp.xyz.comissao;

import java.util.ArrayList;
import java.util.Arrays;

import br.edu.ifsp.xyz.leitor.Leitor;

public class Cliente {
	private String cpf;
	private String nome;
	private Pedido[] pedidos;
	private Vendedor vendedor;
	
	public Cliente(String caminho, int chave, String valorChave) throws Exception {
		Leitor leitor = new Leitor(caminho, chave, valorChave);
		ArrayList<String> clientes = leitor.conteudo();
		String cliente = clientes.get(0);
		String[] campos = cliente.split(";");
		this.cpf = campos[0];
		this.nome = campos[1];

		String caminhoPedido = "./src/Pedido.txt";
        int chavePedido = 1;
        String valorChavePedido = this.cpf;

        Pedido pedido = new Pedido();
        int indice = pedido.getIndicePedido(caminhoPedido, chavePedido, valorChavePedido);
        
        this.pedidos = new Pedido[indice];
        for (int i = 0; i < indice; i++) {
        	pedidos[i] = new Pedido(caminhoPedido, chavePedido, valorChavePedido, i);
		}
        String caminhoVendedor = "./src/Vendedor.txt";
        chavePedido = 0;
        valorChavePedido = campos[2];
        this.vendedor = new Vendedor(caminhoVendedor, chavePedido, valorChavePedido);
        
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Pedido[] getPedidos() {
		return pedidos;
	}
	public void setPedidos(Pedido[] pedidos) {
		this.pedidos = pedidos;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + '\n' +  Arrays.toString(pedidos) + '\n' + vendedor + "]";
	}
	
}
