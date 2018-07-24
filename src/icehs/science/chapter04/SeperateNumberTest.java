package icehs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int num = 456;
		int hundredNum = num / 100;
		int tenNum = (num % 100) / 10;
		int oneNum = (num % 100) % 10;
		
		System.out.println("숫자 : " + num);
		System.out.println("백의 자리 수 : " + hundredNum);
		System.out.println("십의 자리 수 : " + tenNum);
		System.out.println("일의 자리 수 : " + oneNum);
		
		
		
	}

}
