package org.emp;

public class Employee {
	
	private void empId() {
		System.out.println("empId");
	}
	private void empName() {
		System.out.println("empName");
	}
	private void empDob() {
		System.out.println("empDob");
	}
	private void empPhone() {
		System.out.println("empPhone");
	}
	private void empEmail() {
		System.out.println("empEmail");
	}
	private void empAddress() {
		System.out.println("empAddress");
	}
	private void empAge() {
		System.out.println("empAge");
	}	
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.empId();
		e.empName();
		e.empDob();
		e.empPhone();
		e.empEmail();
		e.empAddress();
	}
	

}
