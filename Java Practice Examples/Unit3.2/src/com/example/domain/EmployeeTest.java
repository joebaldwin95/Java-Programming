package com.example.domain;

public class EmployeeTest {

	public static void main(String[] args) {
		
		//Calls Constructor
		Engineer testEng = new Engineer(101,"Jane Smith", "012-24-5678",120_345.27);
		
		Manager testMan = new Manager (207,"Barbara Johnson","054-12-2367",109_501.36,"dept");
			testMan.setDeptName("UK Marketing");
		
		Admin testAdm = new Admin (304,"Bill Monroe","054-12-2367",109_501.36);
		
		Director testDir = new Director (12,"Susan Wheeler","099-45-2340",120_567.36,"Global Marketing",1_000_000.00);
		
		printEmployee(testAdm);
		
		printEmployee(testDir);
		
		printEmployee(testEng);
		
		printEmployee(testMan);
		

	}

	private static void printEmployee(Employee e) {
		System.out.println("--------------------------------------------");
		System.out.println("Employee ID: " + e.getEmpId());
		System.out.println("Employee Name: " + e.getEmpName());
		System.out.println("Social Security Number: " + e.getEmpSSNo());
		System.out.println("Employee Salary: " + e.getEmpSalary());
		
		
		
	}

	

}
