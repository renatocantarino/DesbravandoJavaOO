package Livraria.Teste;

import java.util.ArrayList;

import Livraria.Produtos.Produto;

public class CarrinhoDeCompra {

	private double total;
	private ArrayList<Produto> produtos;

	public CarrinhoDeCompra() {
		this.produtos = new ArrayList<Produto>();

	}

	public void Adiciona(Produto produto) {

		System.out.println("adicionado - " + produto);
		this.produtos.add(produto);

	}

	public void Remove(int posicao) {

		System.out.println("removendo produto posicao - " + posicao);
		this.produtos.remove(posicao);

	}

	public ArrayList<Produto> getProdutos() {
		return this.produtos;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
