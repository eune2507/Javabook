package java3.p13;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원면적 : "+calculator.areaCircle(r)); // calculator class 에서 실행
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원면적 : "+computer.areaCircle(r));	// computer class 에서 실행

	}

}
