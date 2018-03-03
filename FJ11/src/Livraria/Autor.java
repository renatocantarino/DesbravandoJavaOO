package Livraria;

public class Autor {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void  MostrarDetalhes() {
		System.out.println(nome);
		System.out.println("--------");
	}

}
