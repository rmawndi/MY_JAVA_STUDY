package iches.science.chapter06;

public class CarTest {

	public static void main(String[] args) {
		Car ice = new Car();
		ice.oilAmount = 5 ;
		ice.distance = 140;
		
		ice.printCarInfo();
		ice.addOil(10);
		ice.printCarInfo();
		ice.driveCar("IT����", "��õ����", 10.17);
		ice.printCarInfo();
		ice.driveCar("��õ����", "������", 62.21);
		ice.printCarInfo();
		ice.calculateDrivingDistance();
		
	}

}
