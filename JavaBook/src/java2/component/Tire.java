package java2.component;

public class Tire {
	private int size;
	
	public Tire() {
		System.out.println("Tire Constructor");
		size = 0;
	}
	
	public void setSize(int psize) {
		size = psize;
	}
	public int getSize() {
		return size;
	}
	public int bigTire() {
		size = size * 2;
		return size;
	}
}
