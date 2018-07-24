package icehs.science.chapter04;

public class OperatorTesting {

	public static void main(String[] args) {
		int num = 64;
		
		boolean isOdd = num % 2 ==0;
		boolean isMultiOf3 = num % 3 ==0;
		boolean isMuitiOf2and7 = (num % 2 == 0) && (num % 7 == 0);
		boolean isMuitiOf2or7 = (num % 2 == 0) || (num % 7 == 0);
		
		System.out.println("짝수 입니까? : " +isOdd );
		System.out.println("3의 배수 입니까? : " + isMultiOf3);
		System.out.println("2의 배수 이면서 7의 배수 입니까? : " + isMuitiOf2and7);
		System.out.println("2의 배수 이거나 7의 배수 입니까? : " + isMuitiOf2or7
				);
		

	}

}
