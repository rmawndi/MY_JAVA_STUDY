package icehs.science.chapter08;

public class Account {
	private String accName;
	private String accNum;
	private int balance;
	private double interestRate;
	
	
	
	public Account(String accName, int balance, double interestRate) {
		this.accName = accName;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

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
	public int calculateInterest() {
		balance += (int)(balance * interestRate / 100);
		
		return balance;
	}
}
