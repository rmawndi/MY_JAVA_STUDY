package icehs.science.chapter09;

public class AccountTest {

	public static void main(String[] args) {
		
		
			FundAccount[] funAcc = {
					new FundAccount("111-222", "홍길동", 5000000, 4.7),
					new FundAccount("666-777", "홍길순", 1000000, 2.9)
			};
			for(int i = 0; i <funAcc.length; i++) {
				funAcc[i].openAccount();
				funAcc[i].earnMoney();
				System.out.println();
				
				
				
			}
	
			
		
	
	

	}

}
