package W1L3.prob4;

public final class Triangle {

	private final double base;
	private final double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double computeArea() {
		return 0.5*base*height;
	}

}
