package com.example.domain;

public class Director extends Manager {
	
	private double budget;
	
	

	public Director (int empId, String empName, String empSSNo, double empSalary, String deptName, double budget){
		
		super (empId, empName, empSSNo, empSalary, deptName);
		
		
	}
	
	public double getBudget() {
		return budget;
		}

}
