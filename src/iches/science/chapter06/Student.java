package iches.science.chapter06;

public class Student {

	
	String name;
	String stuID;
	int kor;
	int eng;
	int math;
	double avg;
	
	void calculateAVG( ) {
		avg = (double)(kor + eng + math )/3;
		System.out.println("��� : " + avg);
		
	}

	void printStudentInfo( ) {
		System.out.println("�л���: " + name);
		System.out.println("�й�: " + stuID);
		System.out.println("���� ����: " + kor);
		System.out.println("���� ����: " + eng);
		System.out.println("���� ����: " + math);
		
	}
	void changeStudentID(String newStuID ) {
		stuID = newStuID;
		
	}
	
	
	
}
