package W2L5.prob3;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Figure[] fg = new Figure[5];
		
		fg[0] = new UpwardHat();
		fg[1] = new UpwardHat();
		fg[2] = new DownwardHat();
		fg[3] = new FaceMaker();
		fg[4] = new Vertical();
		
		for (Figure f : fg) {
			f.getFigure();
		}
		
		for (Figure f : fg) {
			System.out.print(f.getClass().getSimpleName() + " : ");
			f.getFigure();
			System.out.println();
		}

	}

}
