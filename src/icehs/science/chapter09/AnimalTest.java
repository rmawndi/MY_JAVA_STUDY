package icehs.science.chapter09;

public class AnimalTest {

	public static void main(String[] args) {
		Animal[] anis = { 
				new Cat(3, "페르시안","야옹이"),
				new Dog(3, "시베리안허스키","멍멍이"),
				
		};
		
		for(int i = 0; i < anis.length; i++ ) {
			anis[i].run();
			anis[i].hunt();
		}
		
		

	}

}
