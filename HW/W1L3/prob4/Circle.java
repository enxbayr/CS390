package W1L3.prob4;

public final class Circle {
	
	private final double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double computeArea() {
		return Math.PI*Math.pow(radius, 2);
	}

	public double getRadius() {
		return radius;
	}

}
