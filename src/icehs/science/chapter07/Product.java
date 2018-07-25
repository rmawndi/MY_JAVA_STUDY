package icehs.science.chapter07;

public class Product {

	String name;
	int price;
	int discount;
	
	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	Product(String name, int price, int discount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	
	void printProductInfo() {
		System.out.println("=====" +this.name+" =====");
		System.out.println("���� " +this.price);
		if(discount==0) {
			System.out.println("������ : ������������");
			
		}else {
			System.out.println("������ : "+ this.discount);
			
		}
	}
		
	
	
	

}
