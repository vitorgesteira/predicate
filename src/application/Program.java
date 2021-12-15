package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		/*  Reference method com m�todo n�o est�tico*/
		
		/* ao invez de usar uma classe para usar como predicado
		 * usa um metodo n�o static dentro da propria classe product*/
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//Referencia para metodo usando metodo n�o static
		list.removeIf(Product::nonStaticProductPredicate);//remove de acordo com o metodo especificado
		
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
