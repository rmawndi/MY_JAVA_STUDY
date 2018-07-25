package icehs.science.chapter07;

public class Book {
	String auther;
	String title;
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
		System.out.println("책 제목: " +title);
		System.out.println("작가명: " +auther);
		System.out.println("가격: " +price);
	}
	
	
}
