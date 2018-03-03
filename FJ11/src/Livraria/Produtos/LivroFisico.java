package Livraria.Produtos;

import Livraria.Autor;

public class LivroFisico extends Livro implements Promocional {

	public LivroFisico(Autor autr) {
		super(autr);
	}

	public double getTaxaImpressao() {
		return this.getValor() * 0.05;
	}

	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return super.getValor();
	}

	@Override
	public double AplicarDescontoDe(double porcentagem) {
		if(porcentagem > 0.3)
		{
//			throw new Exception("Desconto não permitido");
		}
		
		 double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		System.out.println("aplicando desconto");
					
		return getValor();
	}

	

}
