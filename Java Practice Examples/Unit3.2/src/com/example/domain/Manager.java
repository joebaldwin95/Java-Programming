package com.example.domain;

public class Manager extends Employee {
	
	@SuppressWarnings("unused")
	private String deptName;
	
	
	public Manager (int empId, String empName, String empSSNo, double empSalary, String deptName) {
		
		super (empId, empName, empSSNo, empSalary);
		this.deptName = "dept";
		
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
	

}
