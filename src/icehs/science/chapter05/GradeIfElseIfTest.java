package icehs.science.chapter05;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		int dongScore = 92;
		
		if(dongScore >= 90 && dongScore <=100) {
			System.out.println("A���� �Դϴ�.");
		}
		else if(dongScore >= 80 && dongScore <=89) {
			System.out.println("B���� �Դϴ�.");
		}
		else if(dongScore >= 70 && dongScore <=89) {
			System.out.println("C���� �Դϴ�.");
		}
		else if(dongScore >= 60 && dongScore <=79) {
			System.out.println("D���� �Դϴ�.");
		}
		else if(dongScore >= 50 && dongScore <=69) {
			System.out.println("E���� �Դϴ�.");
		}
		else if(dongScore < 60 && dongScore >= 0) {
			System.out.println("F���� �Դϴ�.");
		}
		else {
			System.out.println("������ �� ���� �����ϴ�. ������ �߸��Է��ϼ̽��ϴ�.");
		}

	}

}
