package icehs.science.chapter05;

public class GradeIfElseTest {

	public static void main(String[] args) {
		int dongScore = 92;
		int soonScore = 85;
		
		if(dongScore >= 90 && dongScore <=100) {
			System.out.println("홍길동 : A학점입니다.");
		}else {
			System.out.println("홍길동 : A학점을 받지 못했습니다.");
		}
		if(soonScore >= 90 && soonScore <=100) {
			System.out.println("홍길순 : A학점입니다.");
		}else {
			System.out.println("홍길순 : A학점을 받지 못했습니다.");
		}

	}

}
