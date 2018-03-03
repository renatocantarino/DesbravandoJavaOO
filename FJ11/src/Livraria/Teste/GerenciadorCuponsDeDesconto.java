package Livraria.Teste;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorCuponsDeDesconto {

	private Map<String, Double> cupons;

	public GerenciadorCuponsDeDesconto() {

		this.cupons = new HashMap<>();
		
		cupons.put("cab13", 2.20);
		cupons.put("cab50", 1.10);
		cupons.put("cab55", 0.90);
		
	}

	public Double validaCupom(String codigo) {
		return this.cupons.get(codigo);
	}

}
