package Livraria.Produtos;

import java.util.UUID;

import Livraria.Autor;

public abstract class Livro implements Produto, Promocional {
	// Classe é um molde
	// Objeto é a personificação do molde.
	// get setter = padrao de atribuicao de variavel. acoplamento.

	private String nome;
	private String descricao;
	private Double Valor;
	private UUID isbn; // identificacao internacional
	private Autor autor;

	public Livro() {
		this.isbn = java.util.UUID.randomUUID();
	}

	public Livro(Autor autor) {
		this();
		this.autor = autor;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return Valor;
	}

	public void setValor(Double preco) {
		this.Valor = preco;
	}

	public UUID getIsbn() {
		return isbn;
	}

	public void setIsbn(UUID isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

//	public abstract double AplicarDescontoDe(Double porcento);
	
/*	throws Exception {
		
		if(porcento > 0.3)
			throw new Exception("Desconto não permitido");
		
		double desconto = getPreco() * porcento;
		setPreco(getPreco() - desconto);
		System.out.println("aplicando desconto");
					
		return getPreco();
	}*/

	public boolean TemAutor() {
		return this.autor != null;
	}



	
	public void MostrarDetalhes() {
		System.out.println(nome);
		System.out.println(descricao);
		System.out.println(Valor);
		System.out.println(isbn);

		if (this.TemAutor()) {
			autor.MostrarDetalhes();

		} else {
			System.out.println("Autor não informado");

		}

		System.out.println("--------");
	}

}
