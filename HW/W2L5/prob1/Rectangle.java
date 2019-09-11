package W2L5.prob1;

public class Rectangle extends Shape {

	double width;
	double height;

	public Rectangle(String color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;

	}
	@Override
	public double calculateArea() {
		return width * height;
	}
	@Override
	public double calculatePerimeter() {
		return (width + height) * 2;
	}

}
