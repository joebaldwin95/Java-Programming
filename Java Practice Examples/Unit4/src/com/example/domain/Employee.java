package com.example.domain;

import java.text.NumberFormat;

public class Employee {
	
	//Variables Initialised
	private int empId;
	private String empName;
	private String empSSNo;
	private double empSalary;
	
	public Employee(int empId,String empName, String empSSNo, double empSalary){//Constructor
		
		this.empId = empId;
		this.empName = empName;
		this.empSSNo = empSSNo;
		this.empSalary = empSalary;
		
	}
	
	//Getters and Setters
	public int getEmpId() {
		return empId;
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

	public double getEmpSalary() {
		return empSalary;
	}

	public void raiseSalary (double increase){
		
	}

	
	public String toString(){
		return ""+empId +"\n" + empName +"\n" + empSSNo +"\n" + empSalary + "\n" + NumberFormat.getCurrencyInstance().format(getEmpSalary());
	}
	
	
	
	

}
