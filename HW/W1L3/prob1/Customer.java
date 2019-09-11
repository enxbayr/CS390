package W1L3.prob1;

public class Customer {
	
	private String fName;
	private String lName;
	private String ssn;
	Address bAdr;
	Address sAdr;
	
	public Customer(String fName, String lName, String ssn){
		this.fName = fName;
		this.lName = lName;
		this.ssn = ssn;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public Address getbAdr() {
		return bAdr;
	}

	public void setbAdr(Address bAdr) {
		this.bAdr = bAdr;
	}

	public Address getsAdr() {
		return sAdr;
	}

	public void setsAdr(Address sAdr) {
		this.sAdr = sAdr;
	}
	
	@Override
	public String toString() {
		return "[" + fName + ", " + lName + ", " + "ssn: " + ssn + "]";
	}
}