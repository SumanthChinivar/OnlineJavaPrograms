package PrinciplesOfOOPs;

public class Driver1 {
	public static void main(String[] args) {
		Employee employee=new Employee(2000);
		System.out.println(employee.getSalary());//2000
		employee.setSalary(5000);
		System.out.println(employee.getSalary());//5000
	}
}
