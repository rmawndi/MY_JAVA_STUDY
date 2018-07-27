package iches.science.chapter06;

public class ChocolateTest {

	public static void main(String[] args) {
		Chocolate choco = new Chocolate();
		choco.setName("xxx");
		choco.setType ("��ũ");
		choco.setPrice (2200);
		
		choco.printChocolateInfo();
		String chocoName = choco.getname();
		int totalPrice = choco.calculateTotalPrice(20);
		
		System.out.println(chocoName + "���ڷ� 20�� : " + totalPrice +"��");
		
		choco.changeChocolateInfo("ī�� Ű����", 2500);
		chocoName = choco.getname();
		totalPrice = choco.calculateTotalPrice(15, 10);
		System.out.println(chocoName + "���ڷ� 15��(10%)���� : " + totalPrice);
		choco.changeChocolateInfo("Ʈ���� ���", "ȭ��Ʈ", 2300);
		
		
		

	}

}
