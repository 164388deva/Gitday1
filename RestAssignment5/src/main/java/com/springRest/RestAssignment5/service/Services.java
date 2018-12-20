package com.springRest.RestAssignment5.service;

import java.util.List;

import com.springRest.RestAssignment5.dao.EmployeeDAO;
import com.springRest.RestAssignment5.pojo.Employee;

public class Services {
	
public	static List<Employee> userdao=EmployeeDAO.getEmployeeData();
public String addEmployee(Employee emp){
       userdao.add(emp);
       return "Success";
}	
public Employee searchEmployee(int empId){
	for(Employee emp:userdao){
		if(emp.getEmployeeId()==empId)
			return emp;
		
	}
       return null;
}	
public String deleteEmployee(int empId){
	for(Employee emp:userdao){
		if(emp.getEmployeeId()==empId)
		{
			userdao.remove(empId);
			return "Done";
		}
		
	}
      return "Unsuccessful";
}	


public List<Employee> getAllEmployees(){
	return userdao;
}

/*public String updateEmployee(Employee emp){
	
	
	return "Unsuccessful";
}*/




}
