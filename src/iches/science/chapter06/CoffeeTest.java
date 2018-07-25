package iches.science.chapter06;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee ame = new Coffee();
		ame.name = "아메리카노";
		ame.price = 3500;
		ame.printCoffeeInfo();
		
		Coffee lat = new Coffee();
		lat.name = "카페라떼";
		lat.price = 4000;
		lat.printCoffeeInfo();
		
		Coffee mak = new Coffee();
		mak.name = "마키야또";
		mak.price = 4500;
		mak.printCoffeeInfo();
		
		int totalPrice = ame.getPrice() +lat.getPrice() + mak.getPrice();
		System.out.println("총 금액 : " + totalPrice +"원");
		
		
		

	}

}
