package icehs.science.chapter04;

public class CalculatorTest {

	public static void main(String[] args) {
		int firstnumber = 20;
		int secondnumber = 7;
		
		int addResult = firstnumber + secondnumber;
		int subtractResult = firstnumber - secondnumber;
		int divideResult =  firstnumber / secondnumber;
		int multiplyResult =  firstnumber * secondnumber;
		int remainderResult =  firstnumber % secondnumber;
		
		System.out.println("µ¡¼À °á°ú : " + addResult);
		System.out.println("–E¼À °á°ú : " + subtractResult);
		System.out.println("°ö¼À °á°ú : " + multiplyResult);
		System.out.println("³ª´°¼À °á°ú : " + divideResult);
		System.out.println("³ª¸ÓÁö °á°ú : " + remainderResult);
	}

}
