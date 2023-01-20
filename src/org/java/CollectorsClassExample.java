package org.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product
{	
	int id;
	String name;
	float price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
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



public class CollectorsClassExample {

	public static void main(String[] args) {
		
		List<Product> productList=new ArrayList<>();
		productList.add(new Product(1, "HP Laptop",30000f));
		productList.add(new Product(2, "Acer Laptop",35000f));
		productList.add(new Product(3, "Dell Laptop",40000f));
		productList.add(new Product(4, "Sony Laptop",45000f));
		productList.add(new Product(5, "Apple Laptop",90000f));
		
		//toList method collects the result as a list 
		List<Float> productPriceList=productList.stream().map(x -> x.price).collect(Collectors.toList());
		System.out.println(productPriceList);
		
		List<String> productNameList=productList.stream().map(x -> x.name).collect(Collectors.toList());
		System.out.println(productNameList);
		
		//toSet method collects the result as a set 
		Set<Integer> productIdList=productList.stream().map(x -> x.id).collect(Collectors.toSet());
		System.out.println(productIdList);
		
		
		//Returns a Collector that produces the sum of a double-valuedfunction applied to the input elements. 
		//If no elements are present,the result is 0
		Double sumPrices=productList.stream().collect(Collectors.summingDouble(x -> x.price));
		System.out.println(sumPrices);
		
		Double avgPrice=productList.stream().collect(Collectors.averagingDouble(x -> x.price));
		System.out.println(avgPrice);
		
		Long noOfproducts=productList.stream().collect(Collectors.counting());
		System.out.println(noOfproducts);
	}

}
