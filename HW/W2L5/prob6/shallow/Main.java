package W2L5.prob6.shallow;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Computer pc1 = new Computer("Dell","Intel I7", 8000, 3500);
		//Computer pc2 = new Computer("Apple","Intel I7", 16000, 3500);
		
		Person p = new Person("John", pc1);
		
		Person clonp = (Person) p.clone();
		p.getComputer().setRamSize(16000);
		
		System.out.println("SHALLOW CLONE CASE:\n");
		
		System.out.println("Real Person: " + p.toString());
		System.out.println("Clonned Person: " + clonp.toString());
		
		System.out.println("HashCode of Real Person: " + p.hashCode());
		System.out.println("HashCode 0f Clonned Person: " + clonp.hashCode());
		System.out.println("HashCode of Real Person's computer: " + p.getComputer().hashCode());
		System.out.println("HashCode of Clonned Person's computer: " + clonp.getComputer().hashCode());
		
	}

}
