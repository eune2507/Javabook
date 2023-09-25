package java2.sedanfactory;

import java2.component.Tire;

public class Sedan {
	public static void main(String[] args) {
//		java2.component.Tire compoTire = new java2.component.Tire();
		Tire compoTire = new Tire();
//		compoTire.size = 20;
		compoTire.setSize(30);
		
		
//		System.out.println(compoTire.size);
		System.out.println(compoTire.getSize());
		
		compoTire.bigTire();
		System.out.println(compoTire.getSize());

	}

}
