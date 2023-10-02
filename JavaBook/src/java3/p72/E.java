package java3.p72;

public class E {
	void method() {
		class F{
			F(){}
			int field1;
			static int field2;
			void method1() {
				System.out.println("class E - method()1 - class F - method1()");
			}
			static void method2(){
				System.out.println("class E - method()1 - class F - method2()");
			}
		}
		
		F f = new F();
		f.field1 = 7;
		System.out.println("f.field1 : "+f.field1);
		f.method1();
		
		f.field2 = 10;
		System.out.println("f.field2 : "+f.field2);
		f.method2();
	}
}
