package util;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product> {
	/* classe para implementar a interface Predicate
	 * o Predicate tem que ser do tipo Product
	 * implementa o metodo test()*/
	
	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100;
	}
	
}
