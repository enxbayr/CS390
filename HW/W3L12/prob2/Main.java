package W3L12.prob2;

public class Main {

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
		CustomerAccount cst = new CustomerAccount("Egi", "12345", 50.0);
		
		cst.deposit(100.0);
		System.out.println(cst.toString());
		try {
			cst.withdraw(60.0);
		} catch (MyException e) {
			// TODO Auto-generated catch block
		}
		try {
			cst.withdraw(100.0);
		}catch (MyException e) {
			// TODO Auto-generated catch block
		}
		System.out.println(cst.toString());
	}

}
