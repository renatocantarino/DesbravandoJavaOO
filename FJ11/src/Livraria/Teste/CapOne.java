package Livraria.Teste;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import Livraria.Autor;
import Livraria.Produtos.Livro;
import Livraria.Produtos.LivroFisico;

public class CapOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Autor autor = new Autor();
		autor.setNome("renato");
		
		Livro javaOO = new LivroFisico(autor);
		javaOO.setNome("JAVA OO");
		
		Livro java8 = new LivroFisico(autor);
		java8.setNome("RUBY");
		Livro javaP = new LivroFisico(autor);
		javaP.setNome("JAVA Patterns");
		
		List<Livro> livros = Arrays.asList(javaOO,java8 , javaP);
	
//		livros.forEach(l-> System.out.println(l.getNome()));
		
		List<Livro> stream =  livros.stream().filter(l-> l.getNome().contains("JAVA")).collect(Collectors.toList());  ;
		
		
		
		stream.forEach(l-> System.out.println(l.getNome()));

	}

}
