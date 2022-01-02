package ex5_1;

public class TestCricleWithStaticMembers {

	public static void main(String[] args) {
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is "
		+Circle.numberOfObjects);
		
		Circle c1 = new Circle();
		
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius("+c1.radius
				+") and number of Circle objects ("+c1.numberOfObjects +")");
		
		Circle c2 = new Circle(5);
		 c1.radius = 9;
		 
		 System.out.println("\nAfter creating c2 and modifying c1");
		 System.out.println("c1: radius("+c1.radius
					+") and number of Circle objects ("+c1.numberOfObjects +")");
		 System.out.println("c1: radius("+c2.radius
					+") and number of Circle objects ("+c2.numberOfObjects +")");
		
	}

}
