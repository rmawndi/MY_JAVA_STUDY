package iches.science.chapter06;

public class AccounTest {

	public static void main(String[] args) {
		Account gildong = new Account();
		gildong.accName = "ȫ�浿";
		gildong.accNum = "123-456789";
		gildong.balance = 10000;
		gildong.printAccountInfo();
		
		System.out.println("20000���� �Ա��մϴ�.");
		gildong.deposit(20000);
		
		System.out.println("�ܾ� : " + gildong.balance + "��");
		
		System.out.println("45000���� ����մϴ�.");
		gildong.wihtdraw(45000);
		
		System.out.println("�ܾ� : " + gildong.balance + "��");
	}

}

