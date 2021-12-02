package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	
	public ProductRepository() {
		Product phone = new Product("P1234" , "iPhone 6s", 800000 );
		phone.setDecription("4.7-inch, 1334X750 Renina HD diplay, 8-megapixel iSight Camera");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("NEW");
		
		Product noteBook = new Product("P1234", "LG PC ±×·¥", 1500000);
		noteBook.setDecription("13.3inch, IPS LED display, 5rd Generation Inter Core processors");
		noteBook.setCategory("Notebook");
		noteBook.setManufacturer("LG");
		noteBook.setUnitsInStock(1000);
		noteBook.setCondition("Refurbished");
		
		Product tablet = new Product("P1236", "Galaxy Tab S", 900000);
		tablet.setDecription("212.8*125.6*6.6mm, Super AMOLED display, Octa-Core processor");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("Samsung");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("Old");
		
		listOfProducts.add(phone);
		listOfProducts.add(noteBook);
		listOfProducts.add(tablet);
		
		
	}
	public ArrayList<Product> getAllProducts(){
		return listOfProducts;
	}
}
