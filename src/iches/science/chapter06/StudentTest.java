package iches.science.chapter06;

public class StudentTest {

	public static void main(String[] args) {
		Student hong = new Student();
		hong.name = "홍길동";
		hong.stuID = "S001";
		hong.kor = 94;
		hong.eng = 80;
		hong.math = 89;
		
		
		hong.printStudentInfo();
		hong.calculateAVG();
		
		System.out.println("* 학번을 변경합니다!!!");
		
		hong.changeStudentID("STU0001");
		hong.printStudentInfo();
		
		
		
		
		
		
		
	}
}
