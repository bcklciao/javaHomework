package ex7;

public class Test11_4 {

	public static void main(String[] args) {
		Circle circle = new Circle(1);
			System.out.println("A circle "+circle.toString());
			System.out.println("The color is "+circle.getColor());
			System.out.println("The radius is "+circle.getRadius());
			System.out.println("The area is "+circle.getArea());
			System.out.println("The diamenter is "+circle.getDiammeter());
			
			Rectangle rectangle = new Rectangle(2,4);
			System.out.println("\nA rectangle "+ rectangle.toString());
			System.out.println("The are is "+rectangle.getArea());
			System.out.println("The perimeter is "+rectangle.getPerimeter());
	}

}
