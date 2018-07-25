package iches.science.chapter06;

public class Chocolate {
	String name;
	String type;
	int price;
	
	String getname( ) {
		return name;
	}
	int calculateTotalPrice(int count) {
		return count * price ;
	}
	int calculateTotalPrice(int count, int discount) {
		return count * price * (100-discount) / 100;
	}
	void changeChocolateInfo(String newName, String newType, int newPrice) {
		name = newName;
		price = newPrice;
		printChocolateInfo();
	}
	void changeChocolateInfo(String newName, int newPrice) {
		name = newName;
		price = newPrice;
		printChocolateInfo();
	}
	void printChocolateInfo(String newName, String newType, int newPrice) {
		//System.out.println("�̸� : " + name + ", ���� : " + type + ", ���� : " + price);
	}
	void printChocolateInfo() {
		System.out.println("�̸� : " + name + ", ���� : " + type + ", ���� : " + price);
		
	}
}
