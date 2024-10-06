package basic;

class A {
	int a;

	public A(int x) {
		a = x;
		System.out.println("A constructor called with value: " + x);
	}
}

class B extends A {
	int b;

	public B() {
		super(4); // Call the constructor of A with the value 4
		System.out.println("B constructor called");
	}
}

public class Constructor {
	public static void main(String[] args) {
		B obj = new B(); // Create an instance of B
	}
}
