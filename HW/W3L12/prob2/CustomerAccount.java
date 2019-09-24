package W3L12.prob2;

class MyException extends Exception{
	MyException(int n){
		if (n < 0) System.out.println("Withdraw amount exceed balance!");
		else System.out.println("Balance reach below $100!");
		
	}
}

class CustomerAccount {
	private String Cus_name;
	private String Acc_No;
	private double Balance;

	public CustomerAccount(String name, String acc, double bal) {
		this.Cus_name = name;
		this.Acc_No = acc;
		this.Balance = bal;
	}

	public String getCus_name() {
		return Cus_name;
	}

	public void setCus_name(String cus_name) {
		Cus_name = cus_name;
	}

	public String getAcc_No() {
		return Acc_No;
	}

	public void setAcc_No(String acc_No) {
		Acc_No = acc_No;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	@Override
	public String toString() {
		return "CustomerAccount [Cus_name=" + Cus_name + ", Acc_No=" + Acc_No + ", Balance=" + Balance + "]";
	}

	public void deposit(Double ammount) {
		Balance += ammount;
	}
	
	public void withdraw(double ammount) throws Throwable {
		if (Balance > ammount) {
			Balance -= ammount;
			
			if(Balance < 100.0) throw new MyException(1);
		}
		else {
			throw new MyException(-1);
		}
	}

}
