package icehs.science.chapter07;

public class Book {
	private String auther;
	private String title;
	int price;
	
	Book(){
		
	}
	Book(String title, int price) {
		this.title = title;
		this.price = price;
			
	}
	Book(String title, String auther, int price) {
		this.title = title;
		this.auther = auther;
		this.price = price;
		
	}
	Book(String title, String auther) {
		this.title = title;
		this.auther = auther;
		
	}
	
		
	void printBookInfo() {
		System.out.println("å ����: " +title);
		System.out.println("�۰���: " +auther);
		System.out.println("����: " +price);
	}
	
	
}
