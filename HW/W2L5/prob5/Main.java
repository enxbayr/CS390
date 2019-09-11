package W2L5.prob5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer pc1 = new Computer("Dell","Intel I7", 16000, 3500);
		Computer pc2 = new Computer("Dell","Intel I7", 16000, 3500);
		Computer pc3 = new Computer("Apple","Intel I7", 16000, 3500);
		System.out.println("pc1.equals(pc2) : " + pc1.equals(pc2));
		System.out.println("pc2.equals(pc3) : " + pc2.equals(pc3));
		
		System.out.println("\nHashCode of PC1: " + pc1.hashCode());
		System.out.println("HashCode of PC2: " + pc2.hashCode());
		System.out.println("HashCode of PC3: " + pc3.hashCode());

	}

}
