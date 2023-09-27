package java3.p30;

public class Main {

	public static void main(String[] args) {
		// p42
		Parent parent = new Parent();
		Child child = new Child();

		if (parent instanceof Parent) {
			System.out.println("ture");
		} else {
			System.out.println("false");
		}
		if (parent instanceof Child) {
			System.out.println("ture");
		} else {
			System.out.println("false");
		}
		if (child instanceof Parent) {
			System.out.println("ture");
		} else {
			System.out.println("false");
		}
		if (child instanceof Child) {
			System.out.println("ture");
		} else {
			System.out.println("false");
		}
	}

}
