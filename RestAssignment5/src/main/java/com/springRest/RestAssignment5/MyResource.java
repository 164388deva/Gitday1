package com.springRest.RestAssignment5;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.springRest.RestAssignment5.pojo.Employee;
import com.springRest.RestAssignment5.service.Services;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
  
	 Services  s=new Services();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> getAllEmployees() {
       

    	return s.getAllEmployees() ;
    }
    
    
   @POST
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.TEXT_PLAIN)
   public String addEmployee(Employee emp) {
	
	emp.setEmployeeId(Services.userdao.size());
   	return s.addEmployee(emp);
   }
  
   
   @Path("{empId}")
   @PUT
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.TEXT_PLAIN)
   public String updateEmployee(Employee emp,@PathParam("empId") int empId) {
    
   	return s.addEmployee(emp);
   }
   
   
   @Path("{empId}")
   @GET
   @Produces(MediaType.APPLICATION_JSON)
   public Employee getEmployee(@PathParam("empId") int empId) {
   	return s.searchEmployee(empId) ;
   }
   @Path("{empId}")
   @DELETE
   @Produces(MediaType.TEXT_PLAIN)
   public String DeleteEmployees(@PathParam("empId") int empId) {
      

   	return s.deleteEmployee(empId);
   }
}
