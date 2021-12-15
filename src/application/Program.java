package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		/* remover o produto da lista com base no preço*/
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//predicado implementado manualmente por meio da interface predicate
		list.removeIf(new ProductPredicate());//remove de acordo com a classe especificada
		
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
