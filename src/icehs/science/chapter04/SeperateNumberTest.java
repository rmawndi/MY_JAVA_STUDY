package icehs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int num = 456;
		int hundredNum = num / 100;
		int tenNum = (num % 100) / 10;
		int oneNum = (num % 100) % 10;
		
		System.out.println("���� : " + num);
		System.out.println("���� �ڸ� �� : " + hundredNum);
		System.out.println("���� �ڸ� �� : " + tenNum);
		System.out.println("���� �ڸ� �� : " + oneNum);
		
		
		
	}

}
