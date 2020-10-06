package java8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {

		// Print all products whose price > 200f
		System.out.println("-----------1st method----------");
		List<Product> pList = new ArrayList<>();

		for (Product p : getAllProductList()) {
			if (p.price > 200f) {
				System.out.println(p);
			}
		}

		System.out.println("-----------2nd method----------");
		List<Product> proList = getAllProductList().stream().filter((product) -> product.price > 200f)
				.collect(Collectors.toList());
		proList.forEach(System.out::println);

		System.out.println("-----------3rd method----------");
		getAllProductList().stream().filter((product) -> product.price > 200f).forEach(System.out::println);

	}

	private static List<Product> getAllProductList() {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "Book", 100f));
		productList.add(new Product(2, "Pen", 200f));
		productList.add(new Product(3, "Pencil", 300f));
		productList.add(new Product(4, "paper", 400f));
		productList.add(new Product(5, "colourPen", 500f));
		return productList;
	}

}

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
