package iches.science.chapter06;

public class BuildingTest {

	public static void main(String[] args) {
		Buliding sunin = new Buliding();
		sunin.name = "���ΰ�";
		sunin.address = "��ȭ��";
		sunin.totalFloor = 4;
		
		
		System.out.println("�ǹ��� : " + sunin.name);
		System.out.println("�ּ� :" + sunin.address);
		System.out.println("��ü �Ѽ� : " + sunin.totalFloor);
		
		sunin.moveElevator();
		
		sunin.changeAddress("�ڹ���");
		System.out.println("�ּ� :" + sunin.address);
		
		Buliding inhwa = new Buliding();
		
		inhwa.name = "��ȭ����";
		inhwa.address = "��ȭȭ��";
		inhwa.totalFloor = 5;
		
		
		System.out.println("�ǹ��� : " + inhwa.name);
		System.out.println("�ּ� :" + inhwa.address);
		System.out.println("��ü �Ѽ� : " + inhwa.totalFloor);
		
		inhwa.moveElevator();
		
		
		inhwa.changeAddress("��ȭ��");
		System.out.println("�ּ� :" + inhwa.address);
		
		
	}

}
