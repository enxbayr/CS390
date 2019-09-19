package W3L8Day2.prob2;

import java.util.Objects;

class Marketing implements Comparable<Object> {

	private String employeename;
	private String productname;
	private double salesamount;

	public Marketing(String employeename, String productname, double salesamount) {
		this.employeename = employeename;
		this.productname = productname;
		this.salesamount = salesamount;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getSalesamount() {
		return salesamount;
	}

	public void setSalesamount(double salesamount) {
		this.salesamount = salesamount;
	}

	@Override
	public String toString() {
		return "[" + "EMPLOYEE: " + employeename + ", PRODUCT: " + productname + ", SALES: " + salesamount + "]";
	}

	@Override
	public boolean equals(Object ob) {
		if (ob == null)
			return false;
		if (getClass() != ob.getClass())
			return false;
		Marketing m = (Marketing) ob;
		return m.getEmployeename().equals(employeename) && m.getProductname().equals(productname)
				&& (m.getSalesamount() == salesamount);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Marketing clone = (Marketing) super.clone();
		return clone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeename, productname, salesamount);
	}

	@Override
	public int compareTo(Object obj) {
		Marketing MObj = (Marketing) obj;
		if (this.employeename.compareTo(MObj.employeename) > 0)
			return 1;
		else {
			if (this.employeename.compareTo(MObj.employeename) < 0)
				return -1;
			else {
				if (this.productname.compareTo(MObj.productname) > 0)
					return 1;
				else {
					if (this.productname.compareTo(MObj.productname) < 0)
						return -1;
					else {
						if (this.salesamount > MObj.salesamount)
							return 1;
						else {
							if (this.salesamount < MObj.salesamount)
								return -1;
							else
								return 0;
						}
					}
				}
			}
		}
	}

}
