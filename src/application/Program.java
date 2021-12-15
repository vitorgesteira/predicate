package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		/* Expressão lambda declarada*/
		
		/* declara o predicado no main com a expressao lambida*/
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//declara uma variavel do tipo predicate passando uma expressao lambida
		Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		
		//passa a variavel como predicado
		list.removeIf(pred);//remove de acordo com a variavel especificada
		
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
