package iches.science.chapter06;

public class Overloading {
	
	public void addition( int num1, int num2 ) {
		System.out.println(num1 + num2);
		
	}

	
	public void addition( double num1, double num2 ) {
		System.out.println(num1 + num2);
	}
		
	public void addition( String num1, String num2 ) {
		System.out.println(num1 + num2);
	}
}
	
