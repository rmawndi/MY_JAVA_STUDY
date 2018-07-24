package icehs.science.chapter05;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		int dongScore = 92;
		
		if(dongScore >= 90 && dongScore <=100) {
			System.out.println("A학점 입니다.");
		}
		else if(dongScore >= 80 && dongScore <=89) {
			System.out.println("B학점 입니다.");
		}
		else if(dongScore >= 70 && dongScore <=89) {
			System.out.println("C학점 입니다.");
		}
		else if(dongScore >= 60 && dongScore <=79) {
			System.out.println("D학점 입니다.");
		}
		else if(dongScore >= 50 && dongScore <=69) {
			System.out.println("E학점 입니다.");
		}
		else if(dongScore < 60 && dongScore >= 0) {
			System.out.println("F학점 입니다.");
		}
		else {
			System.out.println("학점을 알 수가 없습니다. 점수를 잘못입력하셨습니다.");
		}

	}

}
