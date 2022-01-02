package ex7;

public class Text11_5 {

	public static void main(String[] args) {
		displayObject(new Circle(1,"red",false));
		displayObject(new Rectangle(1,1,"blak",true));

	}
	public static void displayObject(GeometricObject object) {
		System.out.println("Createdd on "+object.getDateCreated()+" Color is "+object.getColor());
	}
}
