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
		
		System.out.println("���� ��� : " + addResult);
		System.out.println("�E�� ��� : " + subtractResult);
		System.out.println("���� ��� : " + multiplyResult);
		System.out.println("������ ��� : " + divideResult);
		System.out.println("������ ��� : " + remainderResult);
	}

}
