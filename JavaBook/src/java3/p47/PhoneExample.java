package java3.p47;

public class PhoneExample {

	public static void main(String[] args) {
	
		//Phone phone = new SmartPhone("홍길동");
		
		SmartPhone smartphone = new SmartPhone("홍길동");
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
	}

}
