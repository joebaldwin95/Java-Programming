package com.example.domain;

public class EmployeeTest {

	public static void main(String[] args) {
		
		//Calls Constructor
		Employee Emptest = new Employee();
		
		//Calls Setters and Assigns Values
		Emptest.setEmpId		(101);
		Emptest.setEmpName		("Jane Smith");
		Emptest.setEmpSSNo		("012-34-4567");
		Emptest.setEmpSalary	(120_345.27);
		
		//Prints & Gets Values
		System.out.println("Employee ID: " 						+Emptest.empId);
		System.out.println("Employee Name: " 					+Emptest.empName);
		System.out.println("Employee Social Security Number: " 	+Emptest.empSSNo);
		System.out.println("Employee Salary: " 					+Emptest.empSalary);
		
		
		
		
		

	}

}
