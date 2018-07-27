package icehs.science.chapter10;

public class BirdTest {

	public static void main(String[] args) {
		Bird bb = new Bird("독수리",3,"바위산 등");
		System.out.println(bb.getKind()+"(" + bb.getAge()+"살) :" + bb.getHabitat());
		bb.spreadWinds();
		bb.fly();

	}

}
