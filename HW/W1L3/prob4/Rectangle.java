package W1L3.prob4;

public final class Rectangle {
	
	private final double width;
	private final double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public double computeArea() {
		return length*width;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}
	

}
