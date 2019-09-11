package W2L5.prob1;

public class Main {

	public static void printTotal(Shape[] shapes) {
	
		double area = 0;
		double peri = 0;
		
		for(Shape sh : shapes) {
			if(sh instanceof Rectangle) {
				Rectangle r = (Rectangle)sh;
				area += r.calculateArea();
				peri += r.calculatePerimeter();
			}
			
			if(sh instanceof Square) {
				Square s = (Square)sh;
				area += s.calculateArea();
				peri += s.calculatePerimeter();
			}
			
			if(sh instanceof Circle) {
				Circle c = (Circle)sh;
				area += c.calculateArea();
				peri += c.calculatePerimeter();
			}
			
		}
		
		System.out.println("TOTAL AREA: " + area);
		System.out.println("TOTAL PERIMETER: " + peri);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape[] shapes = new Shape[5];
		
		shapes[0] = new Rectangle("Green", 2, 4);
		shapes[1] = new Square("White", 5);
		shapes[2] = new Circle("Brown", 6);
		shapes[3] = new Rectangle("Blue", 5, 8);
		shapes[4] = new Square("Breen", 9);
		
		printTotal(shapes);

	}

}
