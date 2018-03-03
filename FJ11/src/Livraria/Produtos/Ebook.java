package Livraria.Produtos;

import Livraria.Autor;

public class Ebook extends Livro implements Promocional {

	// extends : classes é um subclasse de outra, superclasse
	// super = delegate construtor

	private String waterMaker;

	public Ebook(Autor autor) {
		super(autor);

	}

	/*
	 * @Override public double AplicarDescontoDe(Double porcento) throws Exception {
	 * if (porcento > 0.15) throw new Exception("Desconto maior que o permitido");
	 * 
	 * // this.setPreco(this.getPreco() - (this.getPreco() * porcento)); // return
	 * this.getPreco();
	 * 
	 * return super.AplicarDescontoDe(porcento);
	 * 
	 * }
	 */

	private String getWaterMaker() {
		return waterMaker;
	}

	private void setWaterMaker(String waterMaker) {
		this.waterMaker = waterMaker;
	}

	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return super.getValor();
	}

	@Override
	public double AplicarDescontoDe(double porcentagem) {
		// TODO Auto-generated method stub
		return 0;
	}



}
