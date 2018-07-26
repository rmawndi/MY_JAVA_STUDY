package icehs.science.chapter08;

public class StudentArrayTest {

	public static void main(String[] args) {
		Student [] stu = {
				new Student("강감찬","STU0001", "010-1234-5678"),
				new Student("이순신","STU0002", "010-1235-5648"),
				new Student("김유신","STU0003", "010-1244-5678")
		};
		
		for(int i = 0; i < stu.length; i++) {
			System.out.println(stu[i].getName() + "(" + stu[i].getStuId() +") / 전화번호"+ stu[i].getPhotoNo());
		}

	}

}
