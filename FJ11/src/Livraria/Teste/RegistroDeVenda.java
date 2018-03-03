package Livraria.Teste;
import java.util.List;

import Livraria.Autor;
import Livraria.Produtos.Ebook;
import Livraria.Produtos.Livro;
import Livraria.Produtos.LivroFisico;
import Livraria.Produtos.Produto;

public class RegistroDeVenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Autor autor = new Autor();
		autor.setNome("Renato Cantarino");

		Livro lf = new LivroFisico(autor);
		lf.setNome("TDD impresso");
		lf.setValor(59.90);
		
		lf.AplicarDescontoPadrao();
		
		
		Livro book = new Ebook(autor);
		book.setNome("TDD digital");
		book.setValor(19.90);
		
	

		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		carrinho.Adiciona(lf);
		carrinho.Adiciona(book);

		List<Produto> produtos = carrinho.getProdutos();
		for(Produto p :produtos )
		{
			System.out.println(p);
		}
		

	}

}
