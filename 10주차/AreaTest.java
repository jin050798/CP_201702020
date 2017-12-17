
class Shape{
	protected int width, height;
	Shape(){
	}
	Shape(int width, int height){
	}
	Shape(int width){
	}
	public double area() {
		return 1;
	}
}
class Triangle extends Shape{
	public Triangle(int width, int height) {
		super(width,height);
		this.width = width;
		this.height = height;
	}
	public double area() {
		return (double)((width*height)/2);
	}
}
class Rectangle extends Shape{
	public Rectangle(int width, int height) {
		super(width,height);
		this.width = width;
		this.height = height;
	}
	public double area() {
		return width*height;
	}
}
class Circle extends Shape{
	public Circle(int width) {
		super(width);
		this.width = width;

	}
	public double area() {
		return (double)(width*width*3.14);
	}
}
public class AreaTest {
	private static Shape affayOfShapes[];
	public static void main(String arg[]) {
		init();
		areaAll();
		}
	public static void init() {
		affayOfShapes = new Shape[3];
		affayOfShapes[0] = new Triangle(5, 5);
		affayOfShapes[1] = new Rectangle(5, 5);
		affayOfShapes[2] = new Circle(5);
	}
	public static void areaAll() {
		for(int i = 0; i<affayOfShapes.length; i++) {
				affayOfShapes[i].area();
		}
		System.out.println("삼각형의 면적은 : "+affayOfShapes[0].area());
		System.out.println("사각형의 면적은 : "+affayOfShapes[1].area());
		System.out.println("원의 면적은 : "+affayOfShapes[2].area());
	}

}
