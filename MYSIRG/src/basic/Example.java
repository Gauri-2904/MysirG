package basic;

interface I1{
	String toString();
}

public class Example {

	public static void main(String[] args) {
		System.out.print(new I1(){
			public String toString() {//not public then error will come
				System.out.println("Example String");
				return "A";
			}
		});
	}
}
// 
//Cannot reduce the visibility of the inherited method from I1
//Cannot reduce the visibility of the inherited method from Object		