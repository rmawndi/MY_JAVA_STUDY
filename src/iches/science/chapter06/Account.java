package iches.science.chapter06;

public class Account {
	String accName;
	String accNum;
	int balance;
	public int getBalance( ) {
		return balance;
	}
	  
	void deposit(int money) {
		if(money < 0) {
			System.out.println("[����] �ݾ��� ������ �Է��� �� �����ϴ�.");
		}else {
			balance += money;
		}
		
	}
	
	void wihtdraw(int money) {
		if(money < 0) {
			System.out.println("[����] �ݾ��� ������ �Է��� �� �����ϴ�.");
		}
		else if(balance < money) {
			System.out.println("[����] �ܾ��� �����մϴ�.");
		}
		else {
			System.out.println(balance -= money
					);
		
		}
	}
	
	void printAccountInfo() {
		
		System.out.println(" ���� " + accNum + "(������ : " + accName + ")");
		System.out.println("�ܾ� : " + balance);
		
	}
}
