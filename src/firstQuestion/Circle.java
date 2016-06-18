package firstQuestion;

public class Circle extends Point {

	public Circle(int a, int b) {
		super(a, b);
	}
	
	public static double CalErea (Point p1, Point p2) {
		return Math.PI * Math.pow(Math.sqrt(Math.pow(p1.x-p2.x, 2) + Math.pow(p1.y-p2.y, 2)), 2);
	}
	
}
