package W1L2;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = (double) Math.pow(Math.PI, RandomNumbers.getRandomInt(1,9));
		double y = (double) Math.pow(RandomNumbers.getRandomInt(3,14), Math.PI);
		
		System.out.println("X: " + x + "\n" + "Y: " + y);
		
	}

}
