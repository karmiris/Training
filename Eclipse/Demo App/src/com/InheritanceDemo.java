package com;

class A {
	void meth1() {
		System.out.println("Hello from A");
	}
	
}
class B extends A {
	void meth2() {
		System.out.println("Hello from B");
	}
	
}

public class InheritanceDemo {

	public static void main(String[] args) {
		A x = new A();
		B y = new B();
		
		x.meth1();
		y.meth2();
		y.meth1();
	}

}
