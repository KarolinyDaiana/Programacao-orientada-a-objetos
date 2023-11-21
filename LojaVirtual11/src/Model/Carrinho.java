package Model;

import java.util.ArrayList;

public class Carrinho {

	private Cliente cliente;
	private Integer valorTotal;
	private Produto produto;
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	private ArrayList<Integer> quantidades = new ArrayList<Integer>();

	public Carrinho() {
		
	}
	
	/** Getter e setter para o cliente */
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/** Getter e setter para os produtos */
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto produto) {
		this.produtos.add(produto);
	}

	/** Getter e setter para as quantidades */
	public ArrayList<Integer> getQuantidades() {
		return quantidades;
	}

	public void setQuantidades(ArrayList<Integer> quantidades) {
		this.quantidades = quantidades;
	}

	
	/** Método para o valor total*/
	public Integer getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Integer valorTotal) {
		for(Integer i = 0; i < quantidades.size(); i++) {
			valorTotal += quantidades.get(i);
		}
	}

}