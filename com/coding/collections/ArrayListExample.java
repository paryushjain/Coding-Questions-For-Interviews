package com.coding.collections;

public class ArrayListExample {

	public static void main(String[] args) throws ClassNotFoundException {
		B b = new B();
		b.m1();
	}

}

class A {
	void m1() throws ArrayIndexOutOfBoundsException{
		System.out.println("A");
	}
}

class B extends A {
	void m1(int j) throws IndexOutOfBoundsException{
		System.out.println("B");
	}
}
