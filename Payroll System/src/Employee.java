
public abstract class Employee {

	protected String name;
	protected String surname;
	protected int socialSecurityNumber;
	
	public abstract double getSalary();
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getSocialSecurityNumber() {
		return this.socialSecurityNumber;
	}
 	
	public String toString() {
		return "Name: " + this.name + "\tSurname: " + this.surname + "\tSCN: " + this.socialSecurityNumber;
	}

}
