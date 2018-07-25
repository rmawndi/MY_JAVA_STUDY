package iches.science.chapter06;

public class ChocolateTest {

	public static void main(String[] args) {
		Chocolate choco = new Chocolate();
		choco.name = "아마도라";
		choco.type = "다크";
		choco.price =2200;
		
		choco.printChocolateInfo();
		String chocoName = choco.getname();
		int totalPrice = choco.calculateTotalPrice(20);
		
		System.out.println(chocoName + "초코렛 20개 : " + totalPrice +"원");
		
		choco.changeChocolateInfo("카페 키리쉬", 2500);
		chocoName = choco.getname();
		totalPrice = choco.calculateTotalPrice(15, 10);
		System.out.println(chocoName + "초코렛 15개(10%)할인 : " + totalPrice);
		choco.changeChocolateInfo("트리플 블랑", "화이트", 2300);
		
		
		

	}

}
