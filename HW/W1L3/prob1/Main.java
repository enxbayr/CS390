package W1L3.prob1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1 = new Customer("John","Lee", "123456789");
		Customer c2 = new Customer("Anna","Schmitz", "123456788");
		Customer c3 = new Customer("Sarah","Connor", "123456787");
		
		Address addr1 = new Address("5 George","Atlanta","Georgia","55555");
		Address addr2 = new Address("10 Pitt","Chicago", "Illinois", "55444");
		Address addr3 = new Address("15 Mary","Denver","Colorado","55333");
		
		c1.setbAdr(addr1);
		c1.setsAdr(addr1);
		c2.setbAdr(addr2);
		c2.setsAdr(addr2);
		c3.setbAdr(addr3);
		c3.setsAdr(addr3);
		
		Customer[] clist = new Customer[3];
		
		clist[0] = c1;
		clist[1] = c2;
		clist[2] = c3;
		
		for(Customer c : clist) {
			
			if(c.getbAdr().getCity() == "Chicago") System.out.println(c.toString());
			
		}

	}

}
