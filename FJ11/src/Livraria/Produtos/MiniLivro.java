package Livraria.Produtos;

import Livraria.Autor;

public class MiniLivro extends Livro {

	public MiniLivro(Autor autor) {
		super(autor);
		// TODO Auto-generated constructor stub
	}



	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public double AplicarDescontoDe(double porcentagem) {
		// TODO Auto-generated method stub
		if (porcentagem > 0.3) {
			// throw new Exception("Desconto não permitido");
		}

		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		System.out.println("aplicando desconto");

		return getValor();
	}

	

}
