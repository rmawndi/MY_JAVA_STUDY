package iches.science.chapter06;

public class StudentTest {

	public static void main(String[] args) {
		Student hong = new Student();
		hong.name = "ȫ�浿";
		hong.stuID = "S001";
		hong.kor = 94;
		hong.eng = 80;
		hong.math = 89;
		
		
		hong.printStudentInfo();
		hong.calculateAVG();
		
		System.out.println("* �й��� �����մϴ�!!!");
		
		hong.changeStudentID("STU0001");
		hong.printStudentInfo();
		
		
		
		
		
		
		
	}
}
