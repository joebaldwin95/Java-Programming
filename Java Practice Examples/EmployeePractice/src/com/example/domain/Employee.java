package com.example.domain;

public class Employee {
	
	//Variables Initialised
	int empId;
	String empName;
	String empSSNo;
	double empSalary;
	//Getter or Accessor
	public int getEmpId() {
		return empId;
	}
	
	//Setter or Mutator
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSSNo() {
		return empSSNo;
	}

	public void setEmpSSNo(String empSSNo) {
		this.empSSNo = empSSNo;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	
	
	public Employee(){ //Constructor with no args
		
	}

}
