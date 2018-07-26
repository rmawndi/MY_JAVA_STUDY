package icehs.science.chapter08;

public class OddAddtionTest {

	public static void main(String[] args) {
		int [] num = {10, 21, 33, 42, 51, 64, 79, 80};
		int sum = 0;
		for(int i = 0; i < num.length ; i++) {
			if(num[i] % 2 != 0) {
				sum += num[i];
				System.out.println(num[i] + " ");
				
			}
		}
		System.out.println();
		System.out.println("홀 수 들의 합계는" + sum + "입니다.");

	}

}
