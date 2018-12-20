package com.springRest.RestAssignment5.dao;

import java.util.ArrayList;
import java.util.List;

import com.springRest.RestAssignment5.pojo.Employee;

public class EmployeeDAO {
private static List<Employee> list=new ArrayList<Employee>();

public static List<Employee> getEmployeeData(){
	return list;
}	
}
