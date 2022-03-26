
public class CommissionEmployee extends Employee {

	private double commissionRate;
	private double grossSales;
	
	public CommissionEmployee(String name, String surname, int socialSecurityNumber, double commissionRate, double grossSales) {
		this.name = name;
		this.surname = surname;
		this.socialSecurityNumber = socialSecurityNumber;
		this.commissionRate = commissionRate;
		this.grossSales = grossSales;
	}
	
	public double getCommissionRate() {
		return this.commissionRate;
	}
	
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	public double getGrossSales() {
		return this.grossSales;
	}
	
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	
	public String toString() {
		return "Commission employee Name: " + this.name + "\tSurname: " + this.surname + "\tSCN: " + this.socialSecurityNumber + 
				"\nGross sales: " + getGrossSales() + "\tCommision rate: " + getCommissionRate() + "\tEarnings: " + getSalary();

	}
	
	@Override
	public double getSalary() {
		return getCommissionRate()*getGrossSales();
	}

}
