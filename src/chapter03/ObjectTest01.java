package chapter03;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		
		System.out.println(p.getClass()); //reflection
		System.out.println(p.hashCode()); // address X
										  // reference X
		                                  // address 기반의 hashing 값
		System.out.println(p);
		System.out.println(p.toString()); // getClass() + "@" + hashCode()
	
		String s = "Hello World";
	}

}
