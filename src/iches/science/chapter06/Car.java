package iches.science.chapter06;

public class Car {
	int oilAmount;
	double distance;
	String name = "ICEī";
	
	
	void driveCar(String start, String end, double driveDistance) {
		
		distance += driveDistance;
		oilAmount -= (driveDistance/20);
		System.out.println(start + "����" + end + "����" + driveDistance + "km �����Ͽ����ϴ�.");
		
		
	}
	void addOil(int oil) {
		oilAmount += oil;
		System.out.println("�ֹ��� " + oil + "L �����մϴ�.");
	}
	
	
	void calculateDrivingDistance() {
		System.out.println("���� ������ �Ÿ��� ��" + oilAmount * 20 + "km�Դϴ�");
		
	}
	
	void printCarInfo() {
		System.out.println("[" + name + "~] ���� �⸧�� �� : " + oilAmount + "L, �� ����Ÿ� : " + distance + "km");
		
	}
	

	
	 
	

}
