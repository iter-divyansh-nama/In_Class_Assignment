package collections_framwork_list;

public class Product {
	int id;
	String brand;
	String name;
	double price;
	public Product(int id, String brand, String name, double price) {
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	@Override 
	public String toString() {
		 return "Product [id=" + id + ", brand=" + brand + ", name=" + name + ", price=" + price + "]";
	}

}
