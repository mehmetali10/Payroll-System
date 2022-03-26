
public class HourlyEmployee extends Employee {
	

	private double wage;
	private int hours;
	
	
	
	public HourlyEmployee(String name, String surname, int socialSecurityNumber, double wage, int hours) {
		this.name = name;
		this.surname = surname;
		this.socialSecurityNumber = socialSecurityNumber;
		this.hours = hours;
		this.wage = wage;
	}
	
	
	
	public double getWage() {
		return wage;
	}


	public void setWage(double wage) {
		this.wage = wage;
	}


	public int getHours() {
		return hours;
	}


	public void setHours(int hours) {
		this.hours = hours;
	}

	public String toString() {
		return "Hourly employee Name: " + this.name + "\tSurname: " + this.surname + "\tSCN: " + this.socialSecurityNumber + 
				"\nHourly wage: " + this.wage + "\tworked hours: " + this.hours + "\tEarnings: " + getSalary() ;

	}


	@Override
	public double getSalary() {
		if(hours<=40) {
			return hours*wage;
		} else {
			return ((40*wage) + (hours-40)*wage*1.5);
		}
		
	}

}
