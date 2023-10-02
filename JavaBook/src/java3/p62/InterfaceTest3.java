package java3.p62;

public class InterfaceTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//In3 in3 = new In3();인스턴트 생성불가
		ExtendsTest et = new ExtendsTest();
		
		et.in1Method();
		et.in2Method();
		
		System.out.println(In1.x);
		System.out.println(In2.x);
		//System.out.println(In3.x);
		//The field In3.x is ambiguous 모호한

	}

}
