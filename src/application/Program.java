package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		/* Expressão lambda inline*/
		
		/* usa a expressão lambida como predicado*/
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double min = 100.0;//variavel que pode ser usada na expressao lambida
		
		//passa a expressao lambida como predicado
		list.removeIf(p -> p.getPrice() >= min);//remove de acordo a expressao lambida indicada
		
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
