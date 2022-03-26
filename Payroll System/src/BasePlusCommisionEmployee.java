
public class BasePlusCommisionEmployee extends CommissionEmployee {
	
	private double baseSalary;
	private double superSalary  = getSalary();

	public BasePlusCommisionEmployee(String name, String surname, int socialSecurityNumber, double commissionRate,
			double grossSales, double baseSalary) {
		
		super(name, surname, socialSecurityNumber, commissionRate, grossSales);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public String toString() {
		return "Base plusCommission employee Name: " + this.name + "\tSurname: " + this.surname + "\tSCN: " + this.socialSecurityNumber + 
				"\nGross sales: " + getGrossSales() + "\tCommision rate: " + getCommissionRate() + 
                "\nBase salary: " + this.baseSalary + "\tEarnings: " + getSalary1();
	}
	

	public double getSalary1() {
		return baseSalary + superSalary;
		
	}

}
