package com.springRest.RestAssignment5.pojo;

public class Employee {
private static int employeeIdGenerator;
private String employeeName, employeeDepartment, employeeDesignation;
private double employeeSalary;
private int employeeId;
public Employee(String employeeName, String employeeDepartment,
		String employeeDesignation, double employeeSalary) {
	super();
	this.employeeId=employeeIdGenerator++;
	this.employeeName = employeeName;
	this.employeeDepartment = employeeDepartment;
	this.employeeDesignation = employeeDesignation;
	this.employeeSalary = employeeSalary;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmployeeDepartment() {
	return employeeDepartment;
}
public void setEmployeeDepartment(String employeeDepartment) {
	this.employeeDepartment = employeeDepartment;
}
public String getEmployeeDesignation() {
	return employeeDesignation;
}
public void setEmployeeDesignation(String employeeDesignation) {
	this.employeeDesignation = employeeDesignation;
}
public double getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(double employeeSalary) {
	this.employeeSalary = employeeSalary;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}

}
