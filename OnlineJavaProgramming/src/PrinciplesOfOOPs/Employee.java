package PrinciplesOfOOPs;

public class Employee {
	private double salary;
	
	Employee(double salary){
		this.salary=salary;
	}
	//return/fetch
	//readable
	public double getSalary() {
		return salary;
	}
	
	//initialize
	//writable
	public void setSalary(double salary) {
		this.salary=salary;
	}
}

