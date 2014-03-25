package com.example.domain;

public class Manager extends Employee {
	
	private String deptName;
	
	
	public Manager (int empId, String empName, String empSSNo, double empSalary, String deptName) {
		
		super (empId, empName, empSSNo, empSalary);
		this.deptName = "dept";
		
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
	public String toString(){
		return super.toString() + "\n" + deptName;
	}
	

}
