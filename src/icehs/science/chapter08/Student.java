package icehs.science.chapter08;

public class Student {
	
	private String name;
	private String StuId;
	private String photoNo;
	
	public Student(String name, String stuId, String photoNo) {
		this.name = name;
		StuId = stuId;
		this.photoNo = photoNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStuId() {
		return StuId;
	}

	public void setStuId(String stuId) {
		StuId = stuId;
	}

	public String getPhotoNo() {
		return photoNo;
	}

	public void setPhotoNo(String photoNo) {
		this.photoNo = photoNo;
	}
	
	
	
	

}
