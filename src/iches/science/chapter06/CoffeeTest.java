package iches.science.chapter06;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee ame = new Coffee();
		ame.name = "�Ƹ޸�ī��";
		ame.price = 3500;
		ame.printCoffeeInfo();
		
		Coffee lat = new Coffee();
		lat.name = "ī���";
		lat.price = 4000;
		lat.printCoffeeInfo();
		
		Coffee mak = new Coffee();
		mak.name = "��Ű�߶�";
		mak.price = 4500;
		mak.printCoffeeInfo();
		
		int totalPrice = ame.getPrice() +lat.getPrice() + mak.getPrice();
		System.out.println("�� �ݾ� : " + totalPrice +"��");
		
		
		

	}

}
