package icehs.science.chapter08;

public class OddEvenIndexSumTest {

	public static void main(String[] args) {
		int[]arr= {12, 53, 24, 10, 22, 38, 61, 39};
		int oddSum = 0; //홀수번쨰 수 합
		int evenSum = 0; //짝수번쨰 수 합
		
		for(int i = 0; i <arr.length;i++) {
			if((i+1)%2==0) {
				evenSum +=arr[i];
			}else {
				oddSum +=arr[i];
				
			}
		}
		System.out.println("홀수 번쨰 정수의 합 : " + oddSum);
		System.out.println("짝수 번쨰 정수의 합 : " + evenSum);
	}

}
