package iches.science.chapter06;

public class AccounTest {

	public static void main(String[] args) {
		Account gildong = new Account();
		gildong.accName = "홍길동";
		gildong.accNum = "123-456789";
		gildong.balance = 10000;
		gildong.printAccountInfo();
		
		System.out.println("20000원을 입금합니다.");
		gildong.deposit(20000);
		
		System.out.println("잔액 : " + gildong.balance + "원");
		
		System.out.println("45000원을 출금합니다.");
		gildong.wihtdraw(45000);
		
		System.out.println("잔액 : " + gildong.balance + "원");
	}

}

