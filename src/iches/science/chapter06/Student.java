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
		System.out.println("평균 : " + avg);
		
	}

	void printStudentInfo( ) {
		System.out.println("학생명: " + name);
		System.out.println("학번: " + stuID);
		System.out.println("국어 성적: " + kor);
		System.out.println("영어 성적: " + eng);
		System.out.println("수학 성적: " + math);
		
	}
	void changeStudentID(String newStuID ) {
		stuID = newStuID;
		
	}
	
	
	
}
