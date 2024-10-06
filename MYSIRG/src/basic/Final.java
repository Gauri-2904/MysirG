package basic;

// Methods declared as final cannot be overridden
class Dummy {
	public void someFunction() {
		// Method body
	}
}

class MoreDummy extends Dummy {
	// Class can extend Dummy but cannot override final methods (if any)
}

public class Final {
	private final int x; // final instance member variable
	private final static int y; // final static member variable

	// Correct static block syntax
	static {
		y = 4;
	}

	// Constructor
	Final() {
		x = 5;
	}

	// Correct method signature without semicolon
	public void fun() {
		final int k = 10; // Final variable inside method must be initialized
		System.out.println(k);
	}

	public static void main(String[] args) {
		Final e1 = new Final();
		e1.fun(); // Calling the fun method
	}
}
