package icehs.science.chapter09;

public class Dog extends Animal{
	private String name;
	
	public Dog(int age, String kind, String name) {
		super(age,kind);
		this.name = name;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println("시속 40킬로로뛰어");
	}
	@Override
	public void hunt() {
		System.out.println("순록을 잡아요");
	}
	
	

}
