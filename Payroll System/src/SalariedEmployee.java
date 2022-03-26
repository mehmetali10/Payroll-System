
public class SalariedEmployee extends Employee {

	private double weeklySalary;
	
	public SalariedEmployee(String name, String surname, int socialSecurityNumber, double weeklySsalary) {
		this.name = name;
		this.surname = surname;
		this.socialSecurityNumber = socialSecurityNumber;
		this.weeklySalary = weeklySalary;
	}
	
	public double getWeeklySalary() {
		return this.weeklySalary;
	}
	
	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	@Override
	public double getSalary() {
		return this.weeklySalary;
	}
	
	public String toString() {
		return "Salaried employee name: " + this.name + "\tSurname: " + this.surname + "\tSCN: " + this.socialSecurityNumber + "\nWeekly salary: " + getSalary();
	}

}
