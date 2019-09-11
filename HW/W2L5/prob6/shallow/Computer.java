package W2L5.prob6.shallow;

public class Computer implements Cloneable {

	private String manufacturer;
	private String processor;
	private int ramSize;
	private double processorSpeed;

	public Computer(String mf, String pr, int rs, double ps) {
		this.manufacturer = mf;
		this.processor = pr;
		this.ramSize = rs;
		this.processorSpeed = ps;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getProcessor() {
		return processor;
	}

	public int getRamSize() {
		return ramSize;
	}
	
	public void setRamSize(int rs) {
		this.ramSize = rs;
	}

	public double getProcessorSpeed() {
		return processorSpeed;
	}

	public double computePower() {
		return ramSize * processorSpeed;
	}

	public String toString() {
		return "[" + manufacturer + ", " + processor + ", " + ramSize + ", " + processorSpeed + "]";
	}

	public boolean equals(Object ob) {
		if (ob == null)
			return false;
		if (getClass() != ob.getClass())
			return false;
		Computer c = (Computer) ob;
		return c.getManufacturer().equals(manufacturer) && c.getProcessor().equals(processor)
				&& c.getRamSize() == ramSize && c.getProcessorSpeed() == processorSpeed;
	}

	public int hashCode() {
		int seed = 7;
		int result = 11 * seed + manufacturer.hashCode();
		result = 13 * result + processor.hashCode();
		result = 17 * result + ramSize;
		result = 19 * result + (int) processorSpeed;
		return result;

	}

	public Object clone() throws CloneNotSupportedException {

		Computer clone = (Computer) super.clone();

		return clone;
	}

}
