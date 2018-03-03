package Livraria.Produtos;

@FunctionalInterface
public interface Promocional {
	public double AplicarDescontoDe(double porcentagem);

	default double AplicarDescontoPadrao() {
		return AplicarDescontoDe(0.1);
	}

}
